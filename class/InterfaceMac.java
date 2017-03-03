public class InterfaceMac {
	public static final String MAC="0000.0000.0000";
	private String mac;

//Constructeurs
	public InterfaceMac(){
		this.mac=MAC;
	}
	public  InterfaceMac(String newMac){
		this.mac=newMac;
	}

//Ecriture

	public void setMac(String newMac){
		this.mac=newMac;
	}
	
	public String toString(){
		return mac;
	}
	public static void main(String[] args){
		InterfaceMac test=new InterfaceMac("14a5.5afb.2c2b");
		System.out.println(test.getMac());
	}
	
//Lecture
	
	public String getMac(){
		return mac;
	}
	
//toString
	
}
