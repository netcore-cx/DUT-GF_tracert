import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import machines.Router;

public class AddButtonRouter{
	public int ID=0;
	int y,x;
	private Router router;
	private int id;
	private JButton button;
	
	public AddButtonRouter(){
		this.router = new Router();
		this.id = ID + 1;
		this.button = new JButton();
		this.button.setIcon((new ImageIcon("res/icon/router_blue_64x64.png")));
		this.button.setBounds(29, 9, 86, 64);
		this.button.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e){
				//Récupère la position du button
				x = e.getX();
				y = e.getY();
				}
			});
		this.button.addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent e){
				//Déplace le button
				button.setLocation(e.getX() - x + button.getLocation().x, e.getY() - y + button.getLocation().y);
				}
			});
	}
	public JButton getButton(){
		return button;
	}
	public Router getRouter(){
		return router;
	}
	public int getId(){
		return id;
	}
}
