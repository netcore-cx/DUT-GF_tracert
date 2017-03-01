public class InterfaceActive extends InterfaceMac{
	public static final String IP="xxx.xxx.xxx.xxx";
	private String ip;
 	private String mask;

//Constructeurs
	public InterfaceActive(){
		super();
		this.ip=IP;
		this.mask=IP;
	}

	public  InterfaceActive(String macAdr, String ipAdr, String maskAdr){
		super(macAdr);
		this.ip = ipAdr;
		this.mask = maskAdr;
	}

//Accesseurs en lecture

	public String getIp(){
		return this.ip;
	}

	public String getMask(){
		return this.mask;
	}

//Accesseurs en ecriture
	public void setIp(String newIp){
		this.ip=newIp;
	}

	public void setMask(String newMask){
		this.mask=newMask;
	}
	public String toString(){
		return super.toString() + " @ip : " + ip + " mask : " + mask;
	}

}
