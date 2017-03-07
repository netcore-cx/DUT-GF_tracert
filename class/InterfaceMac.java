import java.util.ArrayList;

public class InterfaceMac {
	public static final String MAC="0000.0000.0000";
	static ArrayList<InterfaceMac> allInterfaces = new ArrayList<InterfaceMac>();
	private String mac;
	private String linkedTo;
	
	//*******************
  //** Constructeurs **
  //*******************
	public InterfaceMac(){
		this.mac = MAC;
		this.linkedTo = "None";
		allInterfaces.add(this);
	}
	public InterfaceMac(String newMac){
		this.mac = newMac;
		this.linkedTo = "None";
		allInterfaces.add(this);
	}
	public InterfaceMac(String newMac, String newLink){
		this.mac = newMac;
		this.linkedTo = newLink;
		allInterfaces.add(this);
	}

	//********************
  //***** Mutateur *****
  //********************
	public void setMac(String newMac){
		this.mac=newMac;
	}
	
	public void setLink(String newLink){
		this.linkedTo = newLink;
	}

	//*******************
  //***** Lecture *****
  //*******************
	public String getMac(){
		return mac;
	}
	
	public String getLink(){
		return linkedTo;
	}
	
	public ArrayList<InterfaceMac> getIntMacList(){
		return allInterfaces;
	}

//toString
	public String toString(){
		return mac + "|" + linkedTo;
	}
}
