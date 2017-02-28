import java.util.ArrayList;
public class Router extends Machine{
  private ArrayList interface;

  public Router(){
    super();
    ArrayList interface = new ArrayList();
  }
  public Router(String newName){
    super(newName);
    ArrayList interface = new ArrayList();
  }

  public ArrayList getInterface(){
    return interface
  }
}
