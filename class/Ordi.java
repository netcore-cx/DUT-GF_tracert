import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Ordi extends Machine {
  public static final String SERVICE = "Un service";
  private ArrayList<String> service;
  private List<InterfaceOrdi> intOrdi;

  //Constructeur
  public Ordi(){
    super();
    intOrdi = new ArrayList<InterfaceOrdi>();
    service = new ArrayList<String>();
  }
  public Ordi(String newName){
    super(newName);
    intOrdi = new ArrayList<InterfaceOrdi>();
    service = new ArrayList<String>();
  }

  //Ecriture
  public void setAddInt(InterfaceOrdi inter){
	  intOrdi.add(inter);
  }
  
  //Lecture
  public List<InterfaceOrdi> getInt(){
    return intOrdi;
  }
  public ArrayList<String> getService(){
    return service;
  }

  public String toString(){
    return super.toString();
  }
}
