import java.util.ArrayList;

public class AccessPoint extends Machine{

  public static final String DEFAULT_SSID = "None";
  public static final String DEFAULT_KEY = "None";
  
  static ArrayList<AccessPoint> APList = new ArrayList<AccessPoint>();

  private String ssid;
  private String key;
  private ArrayList<InterfaceMac> interfaceList;

	//*******************
  //** Constructeurs **
  //*******************
  public AccessPoint(){
    super();
    interfaceList = new ArrayList<InterfaceMac>();
    this.ssid = DEFAULT_SSID;
    this.key = DEFAULT_KEY;
    APList.add(this);
  }
  
  public AccessPoint(String newName){
	    super(newName);
	    interfaceList = new ArrayList<InterfaceMac>();
	    this.ssid = DEFAULT_SSID;
	    this.key = DEFAULT_KEY;
		if(newName != "ReadOnly"){
			APList.add(this);
		}
	  }

  public AccessPoint(String newName, String newSsid){
    super(newName);
    interfaceList = new ArrayList<InterfaceMac>();
    this.ssid = newSsid;
    this.key = DEFAULT_KEY;
    APList.add(this);
  }

  public AccessPoint(String newName, String newSsid, String newKey){
    super(newName);
    interfaceList = new ArrayList<InterfaceMac>();
    this.ssid = newSsid;
    this.key = newKey;
    APList.add(this);
  }

	//********************
  //***** Mutateur *****
  //********************
  public void setSsid(String newSsid){
    this.ssid = newSsid;
  }

  public void setKey(String newKey){
    this.ssid = newKey;
  }

  public void setInterfaceList(ArrayList<InterfaceMac> newInterfaceList){
	  this.interfaceList = newInterfaceList;
  }

  public void addInterface(InterfaceMac newInterface){
	  interfaceList.add(newInterface);
  }

  public void setInterfaceById(int id, InterfaceMac newInterface){
	  interfaceList.set(id, newInterface);
  }
  public void setAPsList(ArrayList<AccessPoint> APList){
	  this.APList = APList;
  }


	//*******************
  //***** Lecture *****
  //*******************
  public String getSsid(){
    return this.ssid;
  }

  public String getKey(){
    return this.key;
  }

  public ArrayList<InterfaceMac> getInterfaceList(){
    return interfaceList;
  }
  public ArrayList<AccessPoint> getAPsList(){
	  return APList;
  }

//toString
  public String toString(){
    return super.toString() + "|" + ssid + "|" + key;
  }

  public String APsToString(){
	  String str = "";
	  int i = 0;
	  for(i=0; i < APList.size(); i += 1){
	  	if(i > 0){
	  		str += "\n";
	  	}
	  	str += Integer.toString(i+1) + ". " + getAPsList().get(i).toString();
	  }
	  return str;
  }
  
  public String interfacesToString(){
	  String str = "";
	  int i = 0;
	  for(i=0; i < interfaceList.size(); i += 1){
	  	if(i > 0){
	  		str += ":";
	  	}
	  	str += Integer.toString(i+1) + ". " + getInterfaceList().get(i).toString();
	  }
	  return str;
  }
}
