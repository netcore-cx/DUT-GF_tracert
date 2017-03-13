import java.util.ArrayList;

public class AccessPoint extends Machine{

  public static final String DEFAULT_SSID = "None";
  public static final String DEFAULT_KEY = "None";
  
  static ArrayList<AccessPoint> list = new ArrayList<AccessPoint>();

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
    list.add(this);
  }
  
  public AccessPoint(String newName){
	    super(newName);
	    interfaceList = new ArrayList<InterfaceMac>();
	    this.ssid = DEFAULT_SSID;
	    this.key = DEFAULT_KEY;
		list.add(this);
	  }

  public AccessPoint(String newName, String newSsid){
    super(newName);
    interfaceList = new ArrayList<InterfaceMac>();
    this.ssid = newSsid;
    this.key = DEFAULT_KEY;
    list.add(this);
  }

  public AccessPoint(String newName, String newSsid, String newKey){
    super(newName);
    interfaceList = new ArrayList<InterfaceMac>();
    this.ssid = newSsid;
    this.key = newKey;
    list.add(this);
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
  public void setAPsList(ArrayList<AccessPoint> APsList){
	  AccessPoint.list = APsList;
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
	  return list;
  }

//toString
  public String toString(){
    return super.toString() + "|" + ssid + "|" + key;
  }

  public static String APsToString(){
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
