import java.util.ArrayList;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class test{
  public static void main(String[] args) throws UnknownHostException{
	  
	  //Création et listing des intrfaces MACS
	  	System.out.println("Interfaces Mac");
	  	InterfaceMac myIntMac = new InterfaceMac();
	  	InterfaceMac myIntMac2 = new InterfaceMac("2");
	  	InterfaceMac myIntMac3 = new InterfaceMac("4","5");
	  	ArrayList<InterfaceMac> interfaceMacList = myIntMac.getIntMacList();
	  	
	  	for(int i=0; i<interfaceMacList.size(); i+=1){
	  		System.out.println(interfaceMacList.get(i).toString());
	  	}
	  	
	  //Création et listing des intrfaces ACTIVES
	  	System.out.println("\nInterfaces Actives");
	  	InterfaceActive myIntActive = new InterfaceActive();
	  	InterfaceActive myIntActive2 = new InterfaceActive();
	  	InterfaceActive myIntActive3 = new InterfaceActive();
	  	ArrayList<InterfaceActive> interfaceActiveList = myIntActive.getIntActiveList();
	  	
	  	for(int i=0; i<interfaceActiveList.size(); i+=1){
	  		System.out.println(interfaceActiveList.get(i).toString());
	  	}
	  	
	  //Création et listing des intrfaces ORDIS
	  	System.out.println("\nInterfaces Ordis");
	  	InterfaceOrdi myIntOrdi = new InterfaceOrdi();
	  	InterfaceOrdi myIntOrdi2 = new InterfaceOrdi();
	  	InterfaceOrdi myIntOrdi3 = new InterfaceOrdi();
	  	ArrayList<InterfaceOrdi> interfaceOrdiList = myIntOrdi.getIntOrdiList();
	  	
	  	for(int i=0; i<interfaceOrdiList.size(); i+=1){
	  		System.out.println(interfaceOrdiList.get(i).toString());
	  	}
	  }
  }
