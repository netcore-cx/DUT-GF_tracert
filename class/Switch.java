import java.util.ArrayList;

public class Switch extends Machine{
	
  static ArrayList<Switch> switchList = new ArrayList<Switch>();
	
  private ArrayList<InterfaceMac> interfaceList;


  //*******************
  //** Constructeurs **
  //*******************
  public Switch(){
    super();
    interfaceList = new ArrayList<InterfaceMac>();
    switchList.add(this);
  }

  public Switch(String newName){
    super(newName);
    interfaceList = new ArrayList<InterfaceMac>();
    if(newName != "ReadOnly"){
    	switchList.add(this);
    }
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
  
  public void setSwitchList(ArrayList<Switch> switchList){
	  this.switchList = switchList;
  }


  //*******************
  //***** Lecture *****
  //*******************
  public ArrayList<InterfaceMac> getInterfaceList(){
	  return interfaceList;
  }
  
  public ArrayList<Switch> getSwitchList(){
	  return switchList;
  }
  
  public String switchsToString(){
	  String str = "";
	  int i = 0;
	  for(i=0; i < switchList.size(); i += 1){
	  	if(i > 0){
	  		str += "\n";
	  	}
	  	str += getSwitchList().get(i).toString();
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
	  	str += getInterfaceList().get(i).toString();
	  }
	  return str;
  }
}
