import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import machines.Router;

public class AddRouter{
	
	private Router router;
	private int id;
	private JButton button;
	private JLabel label;
	static int cpt;
	int y,x;
	
	public AddRouter(){
		this.router = new Router();
		this.id = cpt;
		cpt = cpt +1;
		
		
		this.label = new JLabel("Router "+this.id);
		this.label.setIcon((new ImageIcon("res/icon/router_blue_64x64.png")));
		this.label.setVerticalTextPosition(AbstractButton.BOTTOM);
		this.label.setHorizontalTextPosition(AbstractButton.CENTER);
		this.label.setBounds(29, 9, 64, 80);
		//this.label.setLocation(29, 9);
		this.label.addMouseListener(new MouseAdapter(){
			//Appel ma méthode quand on click le JPanel
			@Override
			public void mousePressed(MouseEvent e){
				//RÃ©cupÃ¨re la position du button
				x = e.getX();
				y = e.getY();
				}
			});
		this.label.addMouseMotionListener(new MouseMotionAdapter(){
			//Appel de la méthode quand la souris bouge
			public void mouseDragged(MouseEvent e){
				//DÃ©place le button
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
	public Router getRouter(){
		return router;
	}
	public int getId(){
		return id;
	}
}
