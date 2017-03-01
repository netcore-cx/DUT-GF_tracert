import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Router extends Machine{
  private List<InterfaceActive> intActive;

  //Constructeur
  public Router(){
    super();
    intActive= new ArrayList<InterfaceActive>();
  }
  public Router(String newName){
    super(newName);
    intActive = new ArrayList<InterfaceActive>();
  }

  //Accesseur Lecture
  public List<InterfaceActive> getInterface(){
    return intActive;
  }
}
