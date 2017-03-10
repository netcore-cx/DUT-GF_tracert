import java.util.ArrayList;

public class InterfaceMac {
	public static final String MAC="0000.0000.0000";
	static ArrayList<InterfaceMac> allInterfaces = new ArrayList<InterfaceMac>();
	private String mac;
	
	//*******************
  //** Constructeurs **
  //*******************
	public InterfaceMac(){
		this.mac = MAC;
		allInterfaces.add(this);
	}
	public InterfaceMac(String newMac){
		this.mac = newMac;
		allInterfaces.add(this);
	}

	//********************
  //***** Mutateur *****
  //********************
	public void setMac(String newMac){
		this.mac=newMac;
	}

	//*******************
  //***** Lecture *****
  //*******************
	public String getMac(){
		return mac;
	}
	
	public ArrayList<InterfaceMac> getIntMacList(){
		return allInterfaces;
	}

//toString
	public String toString(){
		return mac;
	}
}
