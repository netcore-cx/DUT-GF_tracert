import java.net.InetAddress;
import java.net.UnknownHostException;

public class InterfaceActive extends InterfaceMac{
	public static final String IP="xxx.xxx.xxx.xxx";
	private String ip;
 	private String mask;

	//*******************
 	//** Constructeurs **
 	//*******************
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
	//********************
	//***** Mutateur *****
	//********************
	public void setIp(String newIp){
		this.ip=newIp;
	}
		public void setMask(String newMask){
		this.mask=newMask;
	}
	public String toString(){
		return super.toString() + "|" + ip + "|" + mask;
	}
	//*******************
	//***** Lecture *****
	//*******************
	public String getIp(){
		return this.ip;
	}

	public String getMask(){
		return this.mask;
	}
	
	//******************
	//***** Method *****
	//******************
	public boolean isLocal(String ipDest) throws UnknownHostException{
		int cptMask=0;
		
		InetAddress addressSrc = InetAddress.getByName(this.ip);
		byte[] byteIpSrc = addressSrc.getAddress();
		
		InetAddress addressDest = InetAddress.getByName(ipDest);
		byte[] byteIpDest = addressDest.getAddress();
		
		InetAddress mask = InetAddress.getByName(this.mask);
		byte[] byteMask = mask.getAddress();
		
		//Boucle pour compter le nombre de 255 dans le mask
		//qui permettra de déterminer le nombre de byte à comparer
		//Donc pour l'instant on fonction en class FULL
		for(int i = 0 ; byteMask[i] == (byte)0xff && i < 4; i++){
			cptMask++;
		}
		//Test du net_id
		for(int cpt = 0 ; cpt < cptMask ; cpt++){
			System.out.println(cpt);
			if( byteIpSrc[cpt] != byteIpDest[cpt] ){
				return false;
				}
			}
		return true;
		}
	
	
	
	public boolean isPrivateIp(String addressIp) throws UnknownHostException{
		InetAddress address = InetAddress.getByName(addressIp);
		return address.isSiteLocalAddress();
	}
	}


