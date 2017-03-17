import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;


import java.awt.Dimension;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Frame extends JFrame {
	
	private static final long serialVersionUID = 1L;
  
  public Frame(String title){
	  //Titre
	  setTitle(title);
	  setSize(600, 400); //Resolution
	  setIconImage(new ImageIcon("res/icon/icon.png").getImage()); //Icon du programme
	  setLocationRelativeTo(null); //Affiche la fenetre au mileu
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //kill le processus
	  setVisible(true);
	  
	  //Création de deux Objet panel qui sont en faite des JPanel
	  Panel b1 = new Panel();
	  Panel b2 = new Panel();
	   
	  //Le conteneur principal
	  JPanel content = new JPanel();
	  //content.setPreferredSize(new Dimension(800, 800));
	  
	  //On définit le layout manager
	  content.setLayout(new GridBagLayout());
	  content.setBackground(Color.WHITE);
	  
	  //L'objet servant à positionner les composants
	  GridBagConstraints gbc = new GridBagConstraints();
	  
	  //On positionne la case de départ du composant
	  gbc.gridx = 0;
	  gbc.gridy = 0;
	  //Cette instruction informe le layout que c'est une fin de ligne
	  gbc.gridwidth = GridBagConstraints.REMAINDER;
	  //La taille en hauteur et en largeur
	  gbc.gridheight = 1;
	  
	  //Position en haut centre
	  gbc.anchor = GridBagConstraints.PAGE_START;
	  //gbc.gridwidth = 4;
	  content.add(new Panel("PC"), gbc);
	  
	  JPanel cell1 = new JPanel();
	  cell1.setBounds(12, 102, 628, 436);
	  cell1.setLayout(null);
	  cell1.setBackground(Color.GRAY);
	  
	  gbc.gridx = 0;
	  gbc.gridy = 1;
	  gbc.gridwidth = GridBagConstraints.REMAINDER;;
	  gbc.gridheight = 1;
	  gbc.anchor = GridBagConstraints.PAGE_START;
	  gbc.weightx = 1.;
	  gbc.weighty = 1.;
	  
	  /* Marge à gauche de 15 (gardons la même que précédemment)
	   * Marge au dessus de 30 et
	   * Marge à droite de 10. */
	  gbc.insets = new Insets(15, 15, 0, 10);
	  
	  //Celle-ci indique que la cellule se réplique de façon verticale
	  content.add(cell1, gbc);
	  
	  

	  getContentPane().add(content);
      }
      
}
