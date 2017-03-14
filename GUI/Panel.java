import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.KeyEvent;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

public class Panel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public Panel(String titre){
		ImageIcon terminal = new ImageIcon("res/icon/terminal_64x64.png");
		ImageIcon switchIcon = new ImageIcon("res/icon/switch_64x64.png");
		ImageIcon routerIcon = new ImageIcon("res/icon/router_64x64.png");
		ImageIcon apIcon = new ImageIcon("res/icon/ap_64x64.png");
		
		JButton pcButton = new JButton(titre, terminal);
		/*pcButton.setVerticalTextPosition(AbstractButton.BOTTOM);
		pcButton.setHorizontalTextPosition(AbstractButton.CENTER);
		pcButton.setMnemonic(KeyEvent.VK_M);*/
	    
		JButton switchButton = new JButton("Switch", switchIcon);
		JButton routerButton = new JButton("Router", routerIcon);
		JButton apButton = new JButton("AP", apIcon);
		
		
		add(pcButton);
		add(switchButton);
		add(routerButton);
		add(apButton);
	}
	
	public Panel(){
		super();
	}
}
