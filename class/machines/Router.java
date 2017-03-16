package machines;
import java.util.ArrayList;

import interfaces.InterfaceIP;

public class Router extends Machine{

  public static ArrayList<Router> list = new ArrayList<Router>(); 
	
  private ArrayList<InterfaceIP> interfaceList;

	//*******************
  //** Constructeurs **
  //*******************
  public Router(){
    super();
    interfaceList = new ArrayList<InterfaceIP>();
    list.add(this);
  }
  public Router(String newName){
    super(newName);
    interfaceList = new ArrayList<InterfaceIP>();
    list.add(this);
  }

	//********************
  //***** Mutateur *****
  //********************
  public void setInterfaceList(ArrayList<InterfaceIP> newInterfaceList){
	  this.interfaceList = newInterfaceList;
  }

  public void addInterface(InterfaceIP interfaceIP){
	  interfaceList.add(interfaceIP);
  }
  public void setRoutersList(ArrayList<Router> routerList){
	  Router.list = routerList;
  }

	//*******************
  //***** Lecture *****
  //*******************
  public ArrayList<InterfaceIP> getInterfaceList(){
	  return interfaceList;
  }
  public ArrayList<Router> getRoutersList(){
	  return list;
  }
  
  public static String listToString(){
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
