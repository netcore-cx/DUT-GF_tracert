import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import machines.Switch;

public class AddSwitch {
	static int cpt;
	
	private int id;
	private Switch switcH;
	private JLabel label;
	int x,y;
	
	public AddSwitch(){
		this.id = cpt;
		this.switcH = new Switch();
		cpt = cpt +1;
		
		this.label = new JLabel("Switch "+this.id);
		this.label.setIcon((new ImageIcon("res/icon/switch_bleu_64x64.png")));
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
	public JLabel getLabel(){
		return label;
	}
	public Switch getSwitch(){
		return switcH;
	}
	public int getId(){
		return id;
	}
	
}
