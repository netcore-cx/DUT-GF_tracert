
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class test{
  public static void main(String[] args){
	  
	  InterfaceOrdi temp;

	  Ordi pc = new Ordi("PcLinux");
	  Ordi pc2 = new Ordi("PC_2_Linux");
	  
	  temp = new InterfaceOrdi("ad4e.4a5f.c9af", "192.168.1.1", "255.255.255.0", "192.168.1.254","8.8.8.8");
	  pc.setAddInt(temp);
	  temp = new InterfaceOrdi("a847.485a.caaf", "192.168.1.2", "255.255.255.0", "192.168.1.254","8.8.8.8");
	  pc2.setAddInt(temp);
	  
	  System.out.println(pc.toString());
	  System.out.println(pc.getInt().get(0).toString());
	  
	  System.out.println(pc2.toString());
	  System.out.println(pc2.getInt().get(0).toString());
	  
	  System.out.println("C'est qui le papa ??");
	  }
  }
