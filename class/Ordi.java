import java.util.ArrayList;

public class Ordi extends Machine {
  public static final String SERVICE = "Un service";
  
  static ArrayList<Ordi> ordiList = new ArrayList<Ordi>();
  
  private ArrayList<String> serviceList;
  private ArrayList<InterfaceOrdi> interfaceList;

  //*******************
  //** Constructeurs **
  //*******************
  public Ordi(){
    super();
    interfaceList = new ArrayList<InterfaceOrdi>();
    serviceList = new ArrayList<String>();
    ordiList.add(this);
  }
  public Ordi(String newName){
    super(newName);
    interfaceList = new ArrayList<InterfaceOrdi>();
    serviceList = new ArrayList<String>();
    ordiList.add(this);
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
  public void setOrdiList(ArrayList<Ordi> ordiList){
	  this.ordiList = ordiList;
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
  public ArrayList<Ordi> getOrdiList(){
	  return ordiList;
  }

 //toString
  public String toString(){
    return super.toString();
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
