import java.util.ArrayList;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class test{
  public static void main(String[] args) throws UnknownHostException{
	  	InterfaceMac myInt = new InterfaceMac();
	  	InterfaceMac myInt2 = new InterfaceMac("2");
	  	InterfaceMac myInt3 = new InterfaceMac("4","5");
	  	ArrayList<InterfaceMac> interfaceList = myInt.getInterfaceList();
	  	
	  	System.out.println("Voici la liste des interfaces:");
	  	for(int i=0; i<interfaceList.size(); i+=1){
	  		System.out.println(interfaceList.get(i).toString());
	  	}
	  }
  }
