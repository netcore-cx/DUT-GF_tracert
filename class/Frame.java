import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Frame extends JFrame {
  private JButton pcButton, switchButton, routerButton, apButton;
  private JPanel pan = new JPanel();
  
  public Frame(String title){
	  //Titre
	  setTitle(title);
	  setSize(600, 400); //Resolution
	  setIconImage(new ImageIcon("res/icon/icon.png").getImage()); //Icon du programme
	  setLocationRelativeTo(null); //Affiche la fenetre au mileu
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //kill le processus
	  setVisible(true);
	  
	  pcButton = new JButton("PC");
	  switchButton = new JButton("Switch");
	  routerButton = new JButton("Router");
	  apButton = new JButton("Ap");
	  
	  pan.add(pcButton);
	  pan.add(switchButton);
	  pan.add(routerButton);
	  pan.add(apButton);
	  
	  this.setContentPane(pan);
      }
      
}
