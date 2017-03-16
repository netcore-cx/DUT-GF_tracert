package interfaces;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class InterfaceIP extends InterfaceMac{
	public static final String IP="xxx.xxx.xxx.xxx";
	public static ArrayList<InterfaceIP> list = new ArrayList<InterfaceIP>();
	private String ip;
 	private String mask;

	//*******************
 	//** Constructeurs **
 	//*******************
	public InterfaceIP(){
		super();
		this.ip=IP;
		this.mask=IP;
		list.add(this);
	}
	
	public InterfaceIP(String name){
		super(name);
		this.ip=IP;
		this.mask=IP;
		if(name == "ReadOnly"){
			list.add(this);
		}
	}

	public  InterfaceIP(String name, String macAdr, String ipAdr, String maskAdr){
		super(name, macAdr);
		this.ip = ipAdr;
		this.mask = maskAdr;
		list.add(this);
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
	
	public ArrayList<InterfaceIP> getIntAPList(){
		return list;
	}
	
	//******************
	//***** Method *****
	//******************
	
	
	public boolean canPing(String ipDest) throws UnknownHostException{
		if(isLinkedTo(ipDest)){
			if(isPrivateIp(ipDest)){
				if(isLocal(ipDest)){
					return true;
				}else{
					return false;
				}
			}else{
				return true;
			}
		}else{
			return false;
		}
	}
	
	public boolean isLinkedTo(String ipDest){
		return true;
	}
	
	
	
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
	
	public static String listToString(){
		  String str = "";
		  int i = 0;
		  for(i=0; i < list.size(); i += 1){
		  	if(i > 0){
		  		str += "\n";
		  	}
		  	str += Integer.toString(i+1) + ". " + list.get(i).toString();
		  }
		  return str;
	  }
}