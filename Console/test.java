import java.util.ArrayList;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class test{
  public static void main(String[] args) throws UnknownHostException{
	  
	  //Cr�ation et listing des intrfaces MACS
	  	System.out.println("Interfaces Mac");
	  	InterfaceMac myIntMac = new InterfaceMac();
	  	InterfaceMac myIntMac2 = new InterfaceMac("2222.2222.2222.2222");
	  	InterfaceMac myIntMac3 = new InterfaceMac("Jean", "3333.3333.3333.3333");
	  	ArrayList<InterfaceMac> interfaceMacList = myIntMac.getIntMacList();
	  	
	  	for(int i=0; i<interfaceMacList.size(); i+=1){
	  		System.out.println(interfaceMacList.get(i).toString());
	  	}
	  	
	  //Cr�ation et listing des intrfaces ACTIVES
	  	System.out.println("\nInterfaces Actives");
	  	InterfaceActive myIntActive = new InterfaceActive();
	  	InterfaceActive myIntActive2 = new InterfaceActive("4444.4444.4444.4444","5555.5555.5555.5555","10.10.10.10","255.0.0.0");
	  	InterfaceActive myIntActive3 = new InterfaceActive("5555.5555.5555.5555","6666.6666.6666.6666","17.17.17.17","255.255.0.0");
	  	ArrayList<InterfaceActive> interfaceActiveList = myIntActive.getIntActiveList();
	  	
	  	for(int i=0; i<interfaceActiveList.size(); i+=1){
	  		System.out.println(interfaceActiveList.get(i).toString());
	  	}
	  	
	  //Cr�ation et listing des intrfaces ORDIS
	  	System.out.println("\nInterfaces Ordis");
	  	InterfaceOrdi myIntOrdi = new InterfaceOrdi();
	  	InterfaceOrdi myIntOrdi2 = new InterfaceOrdi("6666.6666.6666.6666","2222.2222.2222.2222","192.168.5.2","255.255.255.0","192.168.5.254","8.8.8.8");
	  	InterfaceOrdi myIntOrdi3 = new InterfaceOrdi("7777.7777.7777.7777","None","17.16.5.2","255.255.0.0","17.16.255.254","7.7.7.7");
	  	ArrayList<InterfaceOrdi> interfaceOrdiList = myIntOrdi.getIntOrdiList();
	  	
	  	for(int i=0; i<interfaceOrdiList.size(); i+=1){
	  		System.out.println(interfaceOrdiList.get(i).toString());
	  	}
	  }
  }
