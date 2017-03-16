package machines;
import java.util.ArrayList;

import interfaces.InterfacePC;

public class PC extends Machine {
  public static final String SERVICE = "Un service";
  
  public static ArrayList<PC> list = new ArrayList<PC>();
  
  private ArrayList<String> serviceList;
  private ArrayList<InterfacePC> interfaceList;

  //*******************
  //** Constructeurs **
  //*******************
  public PC(){
    super();
    interfaceList = new ArrayList<InterfacePC>();
    serviceList = new ArrayList<String>();
    list.add(this);
  }
  public PC(String name){
    super(name);
    interfaceList = new ArrayList<InterfacePC>();
    serviceList = new ArrayList<String>();
    list.add(this);
  }

  //********************
  //***** Mutateur *****
  //********************
  public void setInterfaceList(ArrayList<InterfacePC> newInterfaceList){
	  this.interfaceList = newInterfaceList;
  }

  public void setServiceList(ArrayList<String> newServiceList){
	  this.serviceList = newServiceList;
  }

  public void addInterface(InterfacePC newInterface){
	  interfaceList.add(newInterface);
  }

  public void addService(String newService){
	  serviceList.add(newService);
  }
  public void setOrdisList(ArrayList<PC> list){
	  PC.list = list;
  }


  //*******************
  //***** Lecture *****
  //*******************
  public ArrayList<InterfacePC> getInterfaceList(){
    return interfaceList;
  }
  public ArrayList<String> getServiceList(){
    return serviceList;
  }
  public ArrayList<PC> getOrdisList(){
	  return list;
  }

 //toString
  public String toString(){
    return super.toString();
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
