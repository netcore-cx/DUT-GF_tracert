import java.util.ArrayList;

public class InterfaceOrdi extends InterfaceActive {
	static ArrayList<InterfaceOrdi> allInterfaces = new ArrayList<InterfaceOrdi>();
	private String dns;
	private String passerelle;

	//*******************
  //** Constructeurs **
  //*******************
	public InterfaceOrdi(){
		super();
		this.passerelle = IP;
		this.dns = IP;
		allInterfaces.add(this);
	}

	public InterfaceOrdi(String mac, String ip, String mask, String passAdr, String dnsAdr){
		super(mac, ip, mask);
		this.passerelle = passAdr;
		this.dns = dnsAdr;
		allInterfaces.add(this);
	}

	//********************
  //***** Mutateur *****
  //********************
	public void setDns(String dnsAdr){
		this.dns = dnsAdr;
	}

	public void setPasserelle(String passAdr){
		this.passerelle = passAdr;
	}

	public String toString(){
		return super.toString() + "|" + passerelle + "|" + dns;
	}


	//*******************
  //***** Lecture *****
  //*******************
	public String getDns(){
		return this.dns;
	}

	public String getPasserelle(){
		return this.passerelle;
	}
	
	public ArrayList<InterfaceOrdi> getIntOrdiList(){
		return allInterfaces;
	}

//Méthode de test
	public static void main(String[] args){
		InterfaceOrdi test = new InterfaceOrdi("14a5.5afb.2c2b", "192.168.1.2", "255.255.255.0", "192.168.1.254", "8.8.8.8");
		System.out.println(test.getDns());
		System.out.println(test.getPasserelle());
		System.out.println(test.getIp());
		System.out.println(test.getMask());
		System.out.println(test.getMac());
	}
}
