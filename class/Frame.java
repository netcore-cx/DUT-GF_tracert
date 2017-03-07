import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
//Position des elements
import javax.swing.JPanel;
import java.awt.BorderLayout;
/*
Il te faudra utiliser en complément du MouseListener ,
un MouseMotionListener pour pouvoir réagir aux mouvements
de la souris. La classe MouseMotionAdapter combine déjà
ces deux écouteurs. Ensuite, il faut prendre en compte
les coordonnées relatives du composant déplacé par rapport
aux coordonnées de la souris. Comme tes composants
sont déplaçables à des coordonnées quelquonques,
il faudra supprimer le layout manager, qui justement
 sert à gérer automatiquement les coordonnées
 (et les tailles) des composants.
*/






public class Frame extends JFrame {
  private JButton pcButton, switchButton, routerButton, apButton;
  private JPanel pan = new JPanel();
      public Frame(){
        // on supprime le layout manager
        setLayout(null);
    	  //Titre
          this.setTitle("GF_TraceRT");
          //Resolution
          this.setSize(600, 400);
          //Icon du programme
          this.setIconImage(new ImageIcon(getClass().getResource("icon.jpg")).getImage());
          this.setLocationRelativeTo(null);
          //Quand on click sur la croix ça kill le processus
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          //Container pan;
          //pan=this.getContentPane();

          //Creation des buttons
          pcButton = new JButton("PC");
          switchButton = new JButton("Switch");
          routerButton = new JButton("Router");
          apButton = new JButton("Ap");

          //pan.setLayout(new GridLayout(2,3));
          //Ajout du bouton à notre content pane
          //par défaut, JPanel gère la mise en page
          pan.add(pcButton);
          pan.add(switchButton);
          pan.add(routerButton);
          pan.add(apButton);

          this.setContentPane(pan);
      }
}
