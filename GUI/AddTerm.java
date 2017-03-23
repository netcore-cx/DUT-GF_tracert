import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import machines.PC;

public class AddTerm {
	
	private PC pc;
	private int id;
	private JButton button;
	private JLabel label;
	static int cpt;
	int y,x;
	
	public AddTerm(){
		this.pc = new PC();
		this.id = cpt;
		cpt = cpt +1;
		this.label = new JLabel("Term "+this.id);
		this.label.setIcon((new ImageIcon("res/icon/terminal_blue_64x64.png")));
		this.label.setVerticalTextPosition(AbstractButton.BOTTOM);
		this.label.setHorizontalTextPosition(AbstractButton.CENTER);
		this.label.setBounds(29, 9, 64, 80);
		this.label.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e){
				//Récupère la position du button
				x = e.getX();
				y = e.getY();
				}
			});
		this.label.addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent e){
				//Déplace le button
				label.setLocation(e.getX() - x + label.getLocation().x, e.getY() - y + label.getLocation().y);
				}
			});
	}
	public JButton getButton(){
		return button;
	}
	public JLabel getLabel(){
		return label;
	}
	public PC getPc(){
		return pc;
	}
	public int getId(){
		return id;
	}

}
