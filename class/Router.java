import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Router extends Machine{
  private ArrayList<InterfaceActive> interfaceList;
  //Constructeur
  public Router(){
    super();
    interfaceList = new ArrayList<InterfaceActive>();
  }
  public Router(String newName){
    super(newName);
    interfaceList = new ArrayList<InterfaceActive>();
  }
  
  //Ecriture
  
  public void setInterfaceList(ArrayList<InterfaceActive> newInterfaceList){
	  this.interfaceList = newInterfaceList;
  }
  
  public void addInterface(InterfaceActive newInterfaceActive){
	  interfaceList.add(newInterfaceActive);
  }
  
  public void setInterfaceById(int id, InterfaceActive newInterfaceActive){
	  interfaceList.set(id, newInterfaceActive);
  }
  
  //Lecture
  public ArrayList<InterfaceActive> getInterfaceList(){
	  return interfaceList;
  }
  public InterfaceActive getInterfaceById(int id){
	  return interfaceList.get(id);
  }
}
