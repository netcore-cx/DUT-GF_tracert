import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Switch extends Machine{
  private List<InterfaceMac> intMac;

  //Constructeur
  public Switch(){
    super();
    intMac = new ArrayList<InterfaceMac>();
  }
  public Switch(String newName){
    super(newName);
    intMac = new ArrayList<InterfaceMac>();
  }

  public List<InterfaceMac> getInt(){
	  return intMac;
  }
}
