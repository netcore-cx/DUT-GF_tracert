import java.util.ArrayList;

public class InterfaceMac {
	public static final String MAC="0000.0000.0000";
	static ArrayList<InterfaceMac> allInterfaces = new ArrayList<InterfaceMac>();
	private Machine machine;
	private String mac;
	
	//*******************
  //** Constructeurs **
  //*******************
	public InterfaceMac(){
		this.mac = MAC;
		this.machine = new Machine();
		allInterfaces.add(this);
	}
	public InterfaceMac(String newMac){
		this.mac = newMac;
		allInterfaces.add(this);
	}
	public InterfaceMac(String newMac, Machine machine){
		this.mac = newMac;
		this.machine = machine;
		allInterfaces.add(this);
	}
	

	//********************
  //***** Mutateur *****
  //********************
	public void setMac(String newMac){
		this.mac=newMac;
	}
	public void setMachine(Machine machine){
		this.machine = machine;
	}

	//*******************
  //***** Lecture *****
  //*******************
	public String getMac(){
		return mac;
	}
	public Machine getMachine(){
		return machine;
	}
	
	public ArrayList<InterfaceMac> getIntMacList(){
		return allInterfaces;
	}

//toString
	public String toString(){
		return machine.toString() + "|" + mac;
	}
}
