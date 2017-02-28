import java.util.ArrayList;
public class Router extends Machine{
  private ArrayList interfaces;

  public Router(){
    super();
    ArrayList interfaces = new ArrayList();
  }
  public Router(String newName){
    super(newName);
    ArrayList interfaces = new ArrayList();
  }

  public ArrayList getInterface(){
    return interfaces;
  }
}
