import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener{
	static int x, y;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setLocationRelativeTo(null);
		frame.setBounds(100, 100, 652, 600);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));

		JLayeredPane layeredPane = new JLayeredPane();
		frame.getContentPane().add(layeredPane);

		JButton btnAp = new JButton("ap");
		btnAp.setIcon(new ImageIcon("res/icon/ap_blue_64x64.png"));
		btnAp.setBounds(12, 20, 148, 70);
		layeredPane.add(btnAp);

		JButton btnSwitch = new JButton("switch");
		btnSwitch.setIcon(new ImageIcon("res/icon/switch_bleu_64x64.png"));
		btnSwitch.setBounds(172, 20, 148, 70);
		layeredPane.add(btnSwitch);

		JButton btnRouter = new JButton("router");
		btnRouter.setIcon(new ImageIcon("res/icon/router_blue_64x64.png"));
		btnRouter.setBounds(332, 20, 148, 70);
		layeredPane.add(btnRouter);

		JButton btnPC = new JButton("PC");
		btnPC.setIcon(new ImageIcon("res/icon/terminal_blue_64x64.png"));
		btnPC.setBounds(492, 20, 148, 70);
		layeredPane.add(btnPC);
		
		JPanel panel = new JPanel();
		JButton button = new JButton("pc");
		panel.setBounds(12, 99, 628, 449);
		panel.setBackground(Color.GRAY);
		panel.add(button);
		//panel.setLayout(null);
		
		//TRES IMPORTANT
		button.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e){
				//Récupère la position du button
				x = e.getX();
				y = e.getY();
			}
		});
		button.addMouseMotionListener(new MouseMotionAdapter(){
            public void mouseDragged(MouseEvent e){
            	//Déplace le button
                button.setLocation(e.getX() - x + button.getLocation().x, e.getY() - y + button.getLocation().y);
            }
        });
		layeredPane.add(panel);
		btnRouter.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
			
		}
	}
	
	
