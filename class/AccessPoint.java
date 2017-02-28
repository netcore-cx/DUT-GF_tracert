import java.util.ArrayList;

public class AccessPoint extends Machine{
  public static final String DEFAULT_SSID = "None";
  public static final String DEFAULT_KEY = "None";
  private String ssid;
  private String key;
  private ArrayList interfaces;

//Constructeurs
  public AccessPoint(){
    super();
    ArrayList interfaces = new ArrayList();
    this.ssid = DEFAULT_SSID;
    this.key = DEFAULT_KEY;
  }

  public AccessPoint(String newName, String newSsid){
    super(newName);
    ArrayList interfaces = new ArrayList();
    this.ssid = newSsid;
    this.key = DEFAULT_KEY;
  }

  public AccessPoint(String newName, String newSsid, String newKey){
    super(newName);
    ArrayList interfaces = new ArrayList();
    this.ssid = newSsid;
    this.key = newKey;
  }

//Accesseurs en lecture
  public String getSsid(){
    return this.ssid;
  }

  public String getKey(){
    return this.key;
  }
/*
  public InterfaceMac getInterfaceById(int id){
    return interfaces.get(id);
  }*/

//Accesseurs en écriture
  public void setSsid(String newSsid){
    this.ssid = newSsid;
  }

  public void setKey(String newKey){
    this.ssid = newKey;
  }
/*
  public InterfaceMac addInterface(InterfaceMac newInterface){
    return interfaces.add(newInterface);
  }

  public InterfaceMac setInterfaceById(int id, InterfaceMac newInterface){
    return interfaces.set(id, newInterface);
  }

  public InterfaceMac delInterfaceById(int id){
    return interfaces.remove(id);
  }*/

//toString
  public String toString(){
    return super.toString() + ":" + this.ssid + ":" + this.key;
  }
}
