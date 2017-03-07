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

	public InterfaceOrdi(String mac, String linkedTo, String ip, String mask, String passAdr, String dnsAdr){
		super(mac, linkedTo, ip, mask);
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
}
