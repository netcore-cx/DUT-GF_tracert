import javax.swing.SwingUtilities;
public class MainFrame{
      public static void main(String[] args){
    	  //Swing gère les fenetre sur son propre thread
    	  SwingUtilities.invokeLater(new Runnable(){
    		  @Override
    		  public void run(){
    	          Frame fenetre = new Frame("GF_TraceRT");
    		  }
    	  });
      }
}
