
public class InterfaceOrdi extends InterfaceActive {
	public static final String IP="000.000.000.000";
	private String dns;
	private String passerelle;
	
	//Constructeur
	public InterfaceOrdi(){
		super();
		this.dns=IP;
		this.passerelle=IP;
	}
	public InterfaceOrdi(String mac, String ip, String mask, String dnsAdr, String passAdr){
		super(mac, ip, mask);
		this.dns=dnsAdr;
		this.passerelle=passAdr;
	}
	
	//Lecture
	public String getDns(){
		return dns;
	}
	public String getPasserelle(){
		return passerelle;
	}
	
	//Ecriture
	public void setDns(String dnsAdr){
		this.dns=dnsAdr;
	}
	public void setPasserelle(String passAdr){
		this.passerelle=passAdr;
	}
	
	public static void main(String[] args){
		InterfaceOrdi test=new InterfaceOrdi("14a5.5afb.2c2b", "192.168.1.2", "255.255.255.0", "8.8.8.8", "192.168.1.254");
		System.out.println(test.getDns());
		System.out.println(test.getPasserelle());
		System.out.println(test.getIp());
		System.out.println(test.getMask());
		System.out.println(test.getMac());
	}
	
	

}
