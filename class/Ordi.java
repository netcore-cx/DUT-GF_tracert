import java.util.ArrayList;

public class Ordi extends Machine {
  public static final String SERVICE = "Un service";
  private ArrayList service;
  private ArrayList interfaces;

  public Ordi(){
    super();
    ArrayList interfaces = new ArrayList();
    ArrayList service = new ArrayList();
  }
  public Ordi(String newName){
    super(newName);
    ArrayList interfaces = new ArrayList();
    ArrayList service = new ArrayList();
  }

  public ArrayList getInterface(){
    return interfaces;
  }
  public ArrayList getService(){
    return service;
  }

  public String toSting(){
    return super.toString();
  }
}
