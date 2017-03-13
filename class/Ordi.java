import java.util.ArrayList;

public class Ordi extends Machine {
  public static final String SERVICE = "Un service";
  
  static ArrayList<Ordi> list = new ArrayList<Ordi>();
  
  private ArrayList<String> serviceList;
  private ArrayList<InterfaceOrdi> interfaceList;

  //*******************
  //** Constructeurs **
  //*******************
  public Ordi(){
    super();
    interfaceList = new ArrayList<InterfaceOrdi>();
    serviceList = new ArrayList<String>();
    list.add(this);
  }
  public Ordi(String name){
    super(name);
    interfaceList = new ArrayList<InterfaceOrdi>();
    serviceList = new ArrayList<String>();
    list.add(this);
  }

  //********************
  //***** Mutateur *****
  //********************
  public void setInterfaceList(ArrayList<InterfaceOrdi> newInterfaceList){
	  this.interfaceList = newInterfaceList;
  }

  public void setServiceList(ArrayList<String> newServiceList){
	  this.serviceList = newServiceList;
  }

  public void addInterface(InterfaceOrdi newInterface){
	  interfaceList.add(newInterface);
  }

  public void addService(String newService){
	  serviceList.add(newService);
  }
  public void setOrdisList(ArrayList<Ordi> ordiList){
	  Ordi.list = ordiList;
  }


  //*******************
  //***** Lecture *****
  //*******************
  public ArrayList<InterfaceOrdi> getInterfaceList(){
    return interfaceList;
  }
  public ArrayList<String> getServiceList(){
    return serviceList;
  }
  public ArrayList<Ordi> getOrdisList(){
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
