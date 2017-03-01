import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class AccessPoint extends Machine{
  public static final String DEFAULT_SSID = "None";
  public static final String DEFAULT_KEY = "None";
  private String ssid;
  private String key;
  private List<InterfaceMac> intWifi;

//Constructeurs
  public AccessPoint(){
    super();
    intWifi = new ArrayList<InterfaceMac>();
    this.ssid = DEFAULT_SSID;
    this.key = DEFAULT_KEY;
  }

  public AccessPoint(String newName, String newSsid){
    super(newName);
    intWifi = new ArrayList<InterfaceMac>();
    this.ssid = newSsid;
    this.key = DEFAULT_KEY;
  }

  public AccessPoint(String newName, String newSsid, String newKey){
    super(newName);
    intWifi = new ArrayList<InterfaceMac>();
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

  public List<InterfaceMac> getInt(){
    return intWifi;
  }

  
//Accesseurs en écriture
  public void setSsid(String newSsid){
    this.ssid = newSsid;
  }

  public void setKey(String newKey){
    this.ssid = newKey;
  }

  
//toString
  public String toString(){
    return super.toString() + ":" + ssid + ":" + key;
  }
  
}
