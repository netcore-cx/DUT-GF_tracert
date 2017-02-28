import java.util.ArrayList;

public class AccessPoint extends Machine{
  public static final String DEFAULT_SSID = "None";
  public static final String DEFAULT_KEY = "None";
  private String ssid;
  private String key;
  private ArrayList interfacesMac;
  
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
  
  public interfaceMac getInterfaceById(int Id){
    return interfaces.get(Id);
  }
  
//Accesseurs en écriture
  public void setSsid(String newSsid){
    this.ssid = newSsid;
  }
  
  public void setKey(String newKey){
    this.ssid = newKey;
  }
  
  public interfaceMac addInterface(interfaceMac newInterface){
    return interfaces.add(newInterface);
  }
  
  public interfaceMac setInterfaceById(int id, interfaceMac newInterface){
    return interfaces.set(id, newInterface);
  }
  
  public interfaceMac delInterfaceById(int id){
    return interfaces.remove(id);
  }
  
//toString
  public String toString(){
    return super.toString() + ":" + this.ssid + ":" + this.key;
  }
}
