import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class Mouse extends java.applet.Applet implements MouseListener{
	String msg="Bonjour";
	int xmsg=20;
	int ymsg=20;
	
	public void paint(Graphics g) {
		 g.drawString(msg,xmsg,ymsg);
		 }
	
	public void init(){
		addMouseListener(this);
	}
	
	public void mouseClicked(MouseEvent e) {
		//Invoked when the mouse has been clicked on a component.
		 xmsg=e.getX();
		 ymsg=e.getY();
		 repaint();
		} 
	public void mousePressed(MouseEvent e) {}
		//Invoked when a mouse button has been pressed on a component.
	public void mouseReleased(MouseEvent e) {}
		//Invoked when a mouse button has been released on a component.
	public void mouseEntered(MouseEvent e) {}
		//Invoked when the mouse enters a component.
	public void mouseExited(MouseEvent e) {}
		//Invoked when the mouse exits a component.
}
