package machines;
import java.util.ArrayList;

import interfaces.InterfaceMac;

public class Switch extends Machine{
	
  public static ArrayList<Switch> list = new ArrayList<Switch>();
	
  private ArrayList<InterfaceMac> interfaceList;


  //*******************
  //** Constructeurs **
  //*******************
  public Switch(){
    super();
    interfaceList = new ArrayList<InterfaceMac>();
    list.add(this);
  }

  public Switch(String newName){
    super(newName);
    interfaceList = new ArrayList<InterfaceMac>();
    list.add(this);
  }

  //********************
  //***** Mutateur *****
  //********************
  public void setInterfaceList(ArrayList<InterfaceMac> newInterfaceList){
	  this.interfaceList = newInterfaceList;
  }

  public void addInterface(InterfaceMac newInterface){
	  interfaceList.add(newInterface);
  }
  
  public void setSwitchsList(ArrayList<Switch> switchsList){
	  Switch.list = switchsList;
  }


  //*******************
  //***** Lecture *****
  //*******************
  public ArrayList<InterfaceMac> getInterfaceList(){
	  return interfaceList;
  }
  
  public ArrayList<Switch> getSwitchsList(){
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
