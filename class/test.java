
import java.util.ArrayList;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class test{
  public static void main(String[] args) throws UnknownHostException{
	  
	  InterfaceOrdi temp;
	  ArrayList<InterfaceOrdi> temp2;
	  int cpt=0;
	  boolean ipTest;
	  
	  
	  
	  //**********************
	  //*** Test Interface ***
	  //**********************
	  temp2 = new ArrayList<InterfaceOrdi>();

	  Ordi pc = new Ordi("PcLinux");
	  Ordi pc2 = new Ordi("PC_2_Linux");
	  
	  temp = new InterfaceOrdi("ad4e.4a5f.c9af", "192.168.1.254", "255.255.255.0", "192.168.1.254","8.8.8.8");
	  temp2.add(temp);
	  pc.setInterfaceList(temp2);
	  
	  temp = new InterfaceOrdi("a847.485a.caaf", "192.168.1.2", "255.255.255.0", "192.168.1.254","8.8.8.8");
	  pc2.addInterface(temp);
	  
	  System.out.println(pc.toString());
	  System.out.println(pc.getInterfaceList().get(0).toString());
	  
	  System.out.println(pc2.toString());
	  System.out.println(pc2.getInterfaceById(0).toString());
	  
	  System.out.println("C'est qui l'papa ??");
	  
	  
	  //********************
	  //*** Test du ping ***
	  //********************
	  InetAddress address = InetAddress.getByName(pc.getInterfaceById(0).getIp());
	  byte[] ip = address.getAddress();
	  InetAddress mask = InetAddress.getByName(pc.getInterfaceById(0).getMask());
	  byte[] maskByte = mask.getAddress();
	  
	  
	  InetAddress address2 = InetAddress.getByName(pc2.getInterfaceById(0).getIp());
	  byte[] ip2 = address2.getAddress();
	  InetAddress mask2 = InetAddress.getByName(pc2.getInterfaceById(0).getMask());
	  byte[] maskByte2 = mask.getAddress();
	  
	  
	  //Test si deux @ip ont le même mask
	  ipTest = true;
	  if ( mask.toString().equals(mask2.toString()) == true ){
		  
		  //Boucle pour compter le nombre de 255 dans le mask
		  //qui permetra de déterminer le nombre de byte à comparer
		  //Donc pour l'instant on focntion en class FULL
		  for(int i=0 ; i<4 ; i++ ){
			  if(maskByte[i] == (byte)0xff){
				  cpt++;
			  }
		  }
		  System.out.println("cpt : " + cpt);
		  for (int ii=0; ii<cpt ; ii++){
			  if ( ip[ii] != ip2[ii] ){
				  ipTest = false;
			  }
		  }
	  }
	  else{
		  ipTest = false;
	  }
	  
	  
	  
	  
	  if (ipTest == false){
		  System.out.println("pas dans le même réseau");
	  }
	  if (ipTest == true){
		  System.out.println("ping --> ok");
	  }
	  
	  
	  
	  if(maskByte == maskByte2){
		  
		  if (ip[0] == ip2[0] && ip[1] == ip2[1]){
		  //System.out.println("ok");
		  }
		}
	  
	  System.out.printf("%#x %#x %#x %#x %n", maskByte[0], maskByte[1], maskByte[2], maskByte[3] );
	  
	  
	  
	  
	  System.out.println("");
	  System.out.println("Interfaces:");
	  System.out.println("");
	  
	  Ordi myOrdi = new Ordi("Jean Claude");
	  InterfaceOrdi myInterfaceMac = new InterfaceOrdi("1803.1939.8104.1839","192.168.2.62","255.255.255.0","192.168.2.254","8.8.8.8");
	  InterfaceOrdi myInterfaceMac2 = new InterfaceOrdi("0284.1058.0184.1179","72.16.2.62","255.255.0.0","72.16.255.254","8.8.8.8");
	  
	  myOrdi.addInterface(myInterfaceMac);
	  myOrdi.addInterface(myInterfaceMac2);
	  
	  System.out.println(myOrdi.toString());
	  System.out.println(myOrdi.interfacesToString());
	  }
  }
