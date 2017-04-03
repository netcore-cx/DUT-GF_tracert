import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.util.ArrayList;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener{
	public ArrayList<AddRouter> router;
	public ArrayList<AddSwitch> switcH;
	public ArrayList<AddTerm> term;
	public ArrayList<AddAp> ap;
	
	private static final long serialVersionUID = 1L;
	
	JLayeredPane layeredPane;
	JButton btnAp;
	JButton btnSwitch;
	JButton btnRouter;
	JButton btnPC;
	JPanel panel;
	JButton button;
	
  
  public Frame(String title){
	  router =new ArrayList<AddRouter>();
	  switcH = new ArrayList<AddSwitch>();
	  term = new ArrayList<AddTerm>();
	  ap = new ArrayList<AddAp>();
	  //Titre
	  setTitle(title);
	  setSize(656,600); //Resolution
	  setIconImage(new ImageIcon("res/icon/icon.png").getImage()); //Icon du programme
	  setLocationRelativeTo(null); //Affiche la fenetre au mileu
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //kill le processus
	  setBackground(new Color(236,240,241));
	  setResizable(false);
	  setVisible(true);
	  
	  layeredPane = new JLayeredPane();
	  getContentPane().add(layeredPane);
	  
	  //Ajout du boutton AP
	  btnAp = new JButton("ap");
	  btnAp.setIcon(new ImageIcon("res/icon/ap_blue_64x64.png"));
	  btnAp.setBackground(new Color(236,240,241));
	  btnAp.setBounds(12, 20, 148, 70);
	  layeredPane.add(btnAp);
	  
	//Ajout du boutton Switch
	  btnSwitch = new JButton("switch");
	  btnSwitch.setIcon(new ImageIcon("res/icon/switch_bleu_64x64.png"));
	  btnSwitch.setBackground(new Color(236,240,241));
	  btnSwitch.setBounds(172, 20, 148, 70);
	  layeredPane.add(btnSwitch);
	  
	//Ajout du boutton router
	  btnRouter = new JButton("router");
	  btnRouter.setIcon(new ImageIcon("res/icon/router_blue_64x64.png"));
	  btnRouter.setBackground(new Color(236,240,241));
	  btnRouter.setBounds(332, 20, 148, 70);
	  layeredPane.add(btnRouter);
	  
	//Ajout du boutton PC
	  btnPC = new JButton("PC");
	  btnPC.setIcon(new ImageIcon("res/icon/terminal_blue_64x64.png"));
	  btnPC.setBackground(new Color(236,240,241));
	  btnPC.setBounds(492, 20, 148, 70);
	  layeredPane.add(btnPC);
		
	  //Ajout de la zone de d√©placement des JButton
	  panel = new JPanel();
	  panel.setBounds(0, 100, 9999, 9999);
	  panel.setBackground(new Color(149,165,166));
	  panel.setLayout(null);
	  layeredPane.add(panel);
	  
	  //Ajout des actions
	  btnRouter.addActionListener(this);
	  btnSwitch.addActionListener(this);
	  btnAp.addActionListener(this);
	  btnPC.addActionListener(this);
	  
	  
	  }
  
  
  public void actionPerformed(ActionEvent e){
	  //Si on click le bouton router
	  if(e.getSource() == btnRouter ){
		  //Ajoute un objet de type AddRouter ‡ la liste
		  router.add(new AddRouter());
		  //Retourne le nom du router pour afficher sur le JPanel
		  panel.add(router.get(router.size()-1).getLabel());
		  //On refraichie le panel 
		  panel.repaint();
		}
	  if(e.getSource() == btnSwitch){
		  switcH.add(new AddSwitch());
		  panel.add(switcH.get(switcH.size()-1).getLabel());
		  panel.repaint();
		  panel.revalidate();
	  }
	  if(e.getSource() == btnPC){
		  term.add(new AddTerm());
		  panel.add(term.get(term.size()-1).getLabel());
		  panel.repaint();
		  panel.revalidate();
	  }
	  if(e.getSource() == btnAp){
		  ap.add(new AddAp());
		  panel.add(ap.get(ap.size()-1).getLabel());
		  panel.repaint();
		  panel.revalidate();
	  }
	}
  
     
}
