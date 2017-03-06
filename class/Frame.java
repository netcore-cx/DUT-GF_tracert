
import javax.swing.JFrame;
import java.awt.Toolkit;
public class Frame extends JFrame {   
      public Frame(){
          this.setTitle("GF_TraceRT");
          this.setSize(600, 400);
          this.setLocationRelativeTo(null);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            
          this.setVisible(true);
          this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Logo.png")));
      }
}
