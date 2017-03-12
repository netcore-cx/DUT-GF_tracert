import java.util.ArrayList;

public class Router extends Machine{

  static ArrayList<Router> routerList = new ArrayList<Router>(); 
	
  private ArrayList<InterfaceActive> interfaceList;

	//*******************
  //** Constructeurs **
  //*******************
  public Router(){
    super();
    interfaceList = new ArrayList<InterfaceActive>();
    routerList.add(this);
  }
  public Router(String newName){
    super(newName);
    interfaceList = new ArrayList<InterfaceActive>();
    routerList.add(this);
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
  public void setRouterList(ArrayList<Router> routerList){
	  this.routerList = routerList;
  }

	//*******************
  //***** Lecture *****
  //*******************
  public ArrayList<InterfaceActive> getInterfaceList(){
	  return interfaceList;
  }
  public ArrayList<Router> getRouterList(){
	  return routerList;
  }

  public String interfacesToString(){
	  String str = "";
	  int i = 0;
	  for(i=0; i < interfaceList.size(); i += 1){
	  	if(i > 0){
	  		str += "|";
	  	}
	  	str += "int" + i + "|" + getInterfaceList().get(i).toString();
	  }
	  return str;
  }
}
