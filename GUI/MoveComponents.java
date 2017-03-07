import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MoveComponents extends JPanel {

    public MoveComponents() {
      // on supprime le layout manager
        setLayout(null);

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

    private final static Color[] COLORS= {Color.RED, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.BLUE, Color.CYAN, Color.MAGENTA, Color.PINK, Color.WHITE, Color.BLACK};

    private JComponent createComponent() {
      // ici on peut faire n'importe quel JComponent, JLabel, par exemple
        JPanel component=new JPanel();
         // position aléatoire
        component.setLocation((int)(Math.random()*100), (int)(Math.random()*100));
         // taille aléatoire
        component.setSize(10+(int)(Math.random()*100), 10+(int)(Math.random()*100));
        // couleur aléatoire de l'objet
        component.setBackground(COLORS[(int)(Math.random()*COLORS.length)]);
        // les composants ne doivent pas intercepter la souris
        component.setEnabled(false);
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
                    component.setBorder(BorderFactory.createLineBorder(Color.BLACK));
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

        @Override
        //Method qui permet de déplacer les objets
        public void mouseMoved(MouseEvent e) {
            if ( move ) {
                // si on déplace
                component.setLocation(e.getX()-relx, e.getY()-rely);
            }
        }

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("exemple");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //On ajoute les objets
        frame.setContentPane(new MoveComponents());

        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
