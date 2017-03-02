
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class test{
  public static void main(String[] args){
	  
	  InterfaceOrdi temp;
	  ArrayList<InterfaceOrdi> temp2;
	  temp2 = new ArrayList<InterfaceOrdi>();

	  Ordi pc = new Ordi("PcLinux");
	  Ordi pc2 = new Ordi("PC_2_Linux");
	  
	  temp = new InterfaceOrdi("ad4e.4a5f.c9af", "192.168.1.1", "255.255.255.0", "192.168.1.254","8.8.8.8");
	  temp2.add(temp);
	  pc.setInterfaceList(temp2);
	  
	  
	  temp = new InterfaceOrdi("a847.485a.caaf", "192.168.1.2", "255.255.255.0", "192.168.1.254","8.8.8.8");
	  pc2.addInterface(temp);
	  
	  System.out.println(pc.toString());
	  System.out.println(pc.getInterfaceList().get(0).toString());
	  
	  System.out.println(pc2.toString());
	  System.out.println(pc2.getInterfaceById(0).toString());
	  
	  System.out.println("C'est qui le papa ??");
	  }
  }
