public class InterfaceMac {
	public static final String MAC="0000.0000.0000";
	private String mac;

	//*******************
  //** Constructeurs **
  //*******************
	public InterfaceMac(){
		this.mac=MAC;
	}
	public  InterfaceMac(String newMac){
		this.mac=newMac;
	}

	//********************
  //***** Mutateur *****
  //********************
	public void setMac(String newMac){
		this.mac=newMac;
	}

	//*******************
  //***** Lecture *****
  //*******************
	public String getMac(){
		return mac;
	}

//toString
	public String toString(){
		return mac;
	}
}
