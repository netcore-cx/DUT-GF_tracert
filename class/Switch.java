import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Switch extends Machine{
  private ArrayList<InterfaceMac> interfaceList;

  //Constructeur
  
  public Switch(){
    super();
    interfaceList = new ArrayList<InterfaceMac>();
  }
  
  public Switch(String newName){
    super(newName);
    interfaceList = new ArrayList<InterfaceMac>();
  }
  
//Ecriture
  
  public void setInterfaceList(ArrayList<InterfaceMac> newInterfaceList){
	  this.interfaceList = newInterfaceList;
  }
  
  public void addInterface(InterfaceMac newInterface){
	  interfaceList.add(newInterface);
  }
  
  public void setInterfaceById(int id, InterfaceMac newInterface){
	  interfaceList.set(id, newInterface);
  }

 //Lecture
  
  public ArrayList<InterfaceMac> getInterfaceList(){
	  return interfaceList;
  }
  
  public InterfaceMac getInterfaceById(int id){
	  return interfaceList.get(id);
  }
  
  public String interfacesToString(){
	  String str = "";
	  int i = 0;
	  for(i=0; i < interfaceList.size(); i += 1){
	  	if(i > 0){
	  		str += ":";
	  	}
	  	str += "int" + i + ":" + getInterfaceById(i).toString();
	  }
	  return str;
  }
}
