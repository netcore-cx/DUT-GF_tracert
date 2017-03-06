import java.util.ArrayList;

public class Ordi extends Machine {
  public static final String SERVICE = "Un service";
  private ArrayList<String> serviceList;
  private ArrayList<InterfaceOrdi> interfaceList;

  //*******************
  //** Constructeurs **
  //*******************
  public Ordi(){
    super();
    interfaceList = new ArrayList<InterfaceOrdi>();
    serviceList = new ArrayList<String>();
  }

  public Ordi(String newName){
    super(newName);
    interfaceList = new ArrayList<InterfaceOrdi>();
    serviceList = new ArrayList<String>();
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

  public void setInterfaceById(int id, InterfaceOrdi newInterface){
	  interfaceList.set(id, newInterface);
  }

  public void setServiceById(int id, String newService){
	  serviceList.set(id, newService);
  }

  public void removeInterfaceById(int id){
	  interfaceList.remove(id);
  }

  public void removeServiceById(int id){
	  serviceList.remove(id);
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

  public InterfaceOrdi getInterfaceById(int id){
	  return interfaceList.get(id);
  }

  public String getServiceById(int id){
	  return serviceList.get(id);
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
	  	str += "int" + i + "|" + getInterfaceById(i).toString();
	  }
	  return str;
  }
}
