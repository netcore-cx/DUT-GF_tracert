public class InterfaceActive extends InterfaceMac{
	public static final String IP="xxx.xxx.xxx.xxx";
	private String ip;
  private String mask;

  //Constructeur
	public InterfaceActive(){
    super();
		this.ip=IP;
    this.mask=IP;
	}
	public  InterfaceActive(String macAdr, String ipAdr, String maskAdr){
    super(macAdr);
    this.ip=ipAdr;
    this.mask=maskAdr;
	}
	
	//mutateur
	public void setIp(String newIp){
		this.ip=newIp;
	}
	
	public void setMask(String newMask){
		this.mask=newMask;
	}
	//Accesseur en lecture
	public String getIp(){
		return ip;
	}
	//Test git avec eclipse
	
	public String getMask(){
		return mask;
	}
}
