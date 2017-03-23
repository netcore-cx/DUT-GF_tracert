import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import machines.AP;
import machines.Router;

public class AddAp {
	
	private AP ap;
	private int id;
	private JButton button;
	private JLabel label;
	static int cpt;
	int y,x;
	
	public AddAp(){
		this.ap = new AP();
		this.id = cpt;
		cpt = cpt +1;
		this.label = new JLabel("AP "+this.id);
		this.label.setIcon((new ImageIcon("res/icon/ap_blue_64x64.png")));
		this.label.setVerticalTextPosition(AbstractButton.BOTTOM);
		this.label.setHorizontalTextPosition(AbstractButton.CENTER);
		this.label.setBounds(29, 9, 64, 80);
		//this.label.setLocation(29, 9);
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
	public AP getAp(){
		return ap;
	}
	public int getId(){
		return id;
	}
	
}
