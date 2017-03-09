import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

public class Panel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public Panel(String titre){
		JButton pcButton = new JButton(titre);
		JButton switchButton = new JButton("Switch");
		JButton routerButton = new JButton("Router");
		JButton apButton = new JButton("AP");
		
		
		add(pcButton);
		add(switchButton);
		add(routerButton);
		add(apButton);
	}
	
	public Panel(){
		super();
	}
}
