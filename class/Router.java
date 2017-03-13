import java.util.ArrayList;

public class Router extends Machine{

  static ArrayList<Router> list = new ArrayList<Router>(); 
	
  private ArrayList<InterfaceActive> interfaceList;

	//*******************
  //** Constructeurs **
  //*******************
  public Router(){
    super();
    interfaceList = new ArrayList<InterfaceActive>();
    list.add(this);
  }
  public Router(String newName){
    super(newName);
    interfaceList = new ArrayList<InterfaceActive>();
    list.add(this);
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
  public void setRoutersList(ArrayList<Router> routerList){
	  Router.list = routerList;
  }

	//*******************
  //***** Lecture *****
  //*******************
  public ArrayList<InterfaceActive> getInterfaceList(){
	  return interfaceList;
  }
  public ArrayList<Router> getRoutersList(){
	  return list;
  }
  
  public static String routersToString(){
	  String str = "";
	  int i = 0;
	  for(i=0; i < list.size(); i += 1){
	  	if(i > 0){
	  		str += "\n";
	  	}
	  	str += Integer.toString(i+1) + ". " + list.get(i).toString();
	  }
	  return str;
  }

  public String interfacesToString(){
	  String str = "";
	  int i = 0;
	  for(i=0; i < interfaceList.size(); i += 1){
	  	if(i > 0){
	  		str += "\n";
	  	}
	  	str += Integer.toString(i+1) + ". " + getInterfaceList().get(i).toString();
	  }
	  return str;
  }
}
