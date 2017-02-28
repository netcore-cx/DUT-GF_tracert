import java.util.ArrayList;

public class Ordi extends Machine {
  public static final String SERVICE = "Un service";
  private ArrayList service;
  private ArrayList interface;

  public Ordi(){
    super();
    ArrayList interface = new ArrayList();
    ArrayList service = new ArrayList();
  }
  public Ordi(String newMac){
    super(newMac);
    ArrayList interface = new ArrayList();
    ArrayList service = new ArrayList();
  }

  public ArrayList getInterface(){
    return interface;
  }
  public ArrayList getService(){
    return service;
  }
}
