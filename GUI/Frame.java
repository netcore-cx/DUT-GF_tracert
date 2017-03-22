import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.util.ArrayList;


import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener{
	public ArrayList<AddButtonRouter> router;
	public ArrayList<AddButtonSwitch> switcH;
	
	private static final long serialVersionUID = 1L;
	
	JLayeredPane layeredPane;
	JButton btnAp;
	JButton btnSwitch;
	JButton btnRouter;
	JButton btnPC;
	JPanel panel;
	JButton button;
	
  
  public Frame(String title){
	  router =new ArrayList<AddButtonRouter>();
	  switcH = new ArrayList<AddButtonSwitch>();
	  //Titre
	  setTitle(title);
	  setSize(650, 600); //Resolution
	  setIconImage(new ImageIcon("res/icon/icon.png").getImage()); //Icon du programme
	  setLocationRelativeTo(null); //Affiche la fenetre au mileu
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //kill le processus
	  setVisible(true);
	  
	  layeredPane = new JLayeredPane();
	  getContentPane().add(layeredPane);
	  
	  //Ajout du boutton AP
	  btnAp = new JButton("ap");
	  btnAp.setIcon(new ImageIcon("res/icon/ap_blue_64x64.png"));
	  btnAp.setBounds(12, 20, 148, 70);
	  layeredPane.add(btnAp);
	  
	//Ajout du boutton Switch
	  btnSwitch = new JButton("switch");
	  btnSwitch.setIcon(new ImageIcon("res/icon/switch_bleu_64x64.png"));
	  btnSwitch.setBounds(172, 20, 148, 70);
	  layeredPane.add(btnSwitch);
	  
	//Ajout du boutton router
	  btnRouter = new JButton("router");
	  btnRouter.setIcon(new ImageIcon("res/icon/router_blue_64x64.png"));
	  btnRouter.setBounds(332, 20, 148, 70);
	  layeredPane.add(btnRouter);
	  
	//Ajout du boutton PC
	  btnPC = new JButton("PC");
	  btnPC.setIcon(new ImageIcon("res/icon/terminal_blue_64x64.png"));
	  btnPC.setBounds(492, 20, 148, 70);
	  layeredPane.add(btnPC);
		
	  //Ajout de la zone de déplacement des JButton
	  panel = new JPanel();
	  panel.setBounds(12, 99, 628, 449);
	  panel.setBackground(Color.GRAY);
	  panel.setLayout(null);
	  layeredPane.add(panel);
	  
	  //Action
	  btnRouter.addActionListener(this);
	  btnSwitch.addActionListener(this);
	  btnAp.addActionListener(this);
	  btnPC.addActionListener(this);
	  
	  
	  }
  
  
  public void actionPerformed(ActionEvent e){
	  if(e.getSource() == btnRouter ){
		  router.add(new AddButtonRouter());
		  panel.add(router.get(router.size()-1).getLabel());
		  panel.repaint();
		  panel.revalidate();
		}
	  if(e.getSource() == btnSwitch){
		  switcH.add(new AddButtonSwitch());
		  panel.add(switcH.get(switcH.size()).getLabel());
		  panel.repaint();
		  panel.revalidate();
	  }
	}
  
     
}
