
public class InterfaceMac {
	public static final String MAC="0000.0000.0000";
	private String mac;

	//Constructeur
	public InterfaceMac(){
		this.mac=MAC;
	}
	public  InterfaceMac(String newMac){
		this.mac=newMac;
	}
	
	//mutateur
	public void setMac(String newMac){
		this.mac=newMac;
	}
	
	//Accesseur en lecture
	public String getMac(){
		return mac;
	}
	//Test git avec eclipse

	public static void main(String[] args){
		InterfaceMac test=new InterfaceMac("14a5.5afb.2c2b");
		System.out.println(test.getMac());

	}
}
