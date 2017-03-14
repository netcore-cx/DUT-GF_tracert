import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.BorderLayout;

//https://www.developpez.net/forums/d1428230/java/interfaces-graphiques-java/awt-swing/deplacer-objet-souris/

public class MoveComponents extends JPanel {

    public MoveComponents() {
    	// on supprime le layout manager
       //setLayout(null);
        
        //Crée l'objet listener --> ComponentMove
        
        ComponentMove listener = new ComponentMove(this);

        //Crée 10 objets que l'on va pouvoir déplacer
        for(int i=0; i<10; i++) {
            add(createComponent());
        }
        //Ajoute listener
        addMouseListener(listener);
        addMouseMotionListener(listener);

    }

    private JComponent createComponent() {
    	// ici on peut faire n'importe quel JComponent, JLabel, par exemple
    	JPanel component=new JPanel();
    	ImageIcon icon = new ImageIcon("res/icon/router_64x64.png");
    	JLabel img = new JLabel(icon);
    	component.setLocation((int)(Math.random()*100), (int)(Math.random()*100));
    	component.setSize(128, 128);
    	component.setEnabled(false);
    	img.setIcon(icon);
    	component.add(img);
    	component.setVisible(true);
    	component.setEnabled(false);


      /*  JPanel component=new JPanel();
         // position aléatoire
        component.setLocation((int)(Math.random()*100), (int)(Math.random()*100));
         // taille aléatoire
        component.setSize(10+(int)(Math.random()*100), 10+(int)(Math.random()*100));
        // couleur aléatoire de l'objet
        component.setBackground(COLORS[(int)(Math.random()*COLORS.length)]);
        // les composants ne doivent pas intercepter la souris
        */
        return component;
    }

    private static class ComponentMove extends MouseAdapter {

        private boolean move;
        private int relx;
        private JComponent component;
        private int rely;
        private Container container;

        public ComponentMove(Container container) {
            this.container=container;
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if ( move ) {
              // arrêt du mouvement
                move=false;
                 // on  supprime la bordure noire
                component.setBorder(null);
                component=null;
            }
            else {
              // on mémorise le composant en déplacement
                component = getComponent(e.getX(),e.getY());
                if ( component!=null ) {
                   // place le composant le plus haut possible
                    container.setComponentZOrder(component,0);
                     // on mémorise la position relative
                    relx = e.getX()-component.getX();
                     // on mémorise la position relative
                    rely = e.getY()-component.getY();
                     // démarrage du mouvement
                    move=true;
                     // on indique le composant sélectionné par une bordure
                     //noire pour dire qu'il peut ètre déplacé
                    //component.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                }
            }
        }

        private JComponent getComponent(int x, int y) {
            // on recherche le premier composant/Objets qui correspond aux coordonnées de la souris
            //retourne le component/Objet
            for(Component component : container.getComponents()) {
                if ( component instanceof JComponent && component.getBounds().contains(x, y) ) {
                    return (JComponent)component;
                }
            }
            return null;
        }

      //Method qui permet de déplacer les objets
        
        @Override
        public void mouseMoved(MouseEvent e) {
            if ( move ) {
                // si on déplace
                component.setLocation(e.getX()-relx, e.getY()-rely);
            }
        }

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GR_tracert");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //On ajoute les objets
        frame.add(new MoveComponents());
        
        
        frame.setIconImage(new ImageIcon("res/icon/icon.jpg").getImage());
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
