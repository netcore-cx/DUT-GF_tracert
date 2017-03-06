import java.util.ArrayList;

public class Router extends Machine{

  private ArrayList<InterfaceActive> interfaceList;

	//*******************
  //** Constructeurs **
  //*******************
  public Router(){
    super();
    interfaceList = new ArrayList<InterfaceActive>();
  }
  public Router(String newName){
    super(newName);
    interfaceList = new ArrayList<InterfaceActive>();
  }

	//********************
  //***** Mutateur *****
  //********************
  public void setInterfaceList(ArrayList<InterfaceActive> newInterfaceList){
	  this.interfaceList = newInterfaceList;
  }

  public void addInterface(InterfaceActive newInterfaceActive){
	  interfaceList.add(newInterfaceActive);
  }

  public void setInterfaceById(int id, InterfaceActive newInterfaceActive){
	  interfaceList.set(id, newInterfaceActive);
  }

	//*******************
  //***** Lecture *****
  //*******************
  public ArrayList<InterfaceActive> getInterfaceList(){
	  return interfaceList;
  }
  public InterfaceActive getInterfaceById(int id){
	  return interfaceList.get(id);
  }

  public String interfacesToString(){
	  String str = "";
	  int i = 0;
	  for(i=0; i < interfaceList.size(); i += 1){
	  	if(i > 0){
	  		str += "|";
	  	}
	  	str += "int" + i + "|" + getInterfaceById(i).toString();
	  }
	  return str;
  }
}
