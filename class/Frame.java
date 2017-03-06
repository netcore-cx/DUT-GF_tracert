
import javax.swing.JFrame;
import javax.swing.ImageIcon;
public class Frame extends JFrame {
      public Frame(){
    	  //Titre
          this.setTitle("GF_TraceRT");
          //Resolution
          this.setSize(600, 400);
          //Icon du programme
          this.setIconImage(new ImageIcon(getClass().getResource("icon.jpg")).getImage());
          this.setLocationRelativeTo(null);
          //Quand on click sur la croix ça kill le processus
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
}
