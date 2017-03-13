import java.util.ArrayList;

public class Machine {
	public static final String DEFAULT_NAME = "Machine";
	
	static ArrayList<Machine> list = new ArrayList<Machine>();
	
	private String name;

	//*******************
  //** Constructeurs **
  //*******************
	public Machine(){
		this.name = DEFAULT_NAME;
		list.add(this);
	}
	public  Machine(String newName){
		this.name = newName;
		list.add(this);
	}


	//********************
  //***** Mutateur *****
  //********************
	public void setName(String newName){
		this.name = newName;
	}
	public void setMachinList(ArrayList<Machine> list){
		Machine.list = list;
	}

	//*******************
  //***** Lecture *****
  //*******************
	public String toString(){
		return this.name;
	}

	public String getName(){
		return this.name;
	}
	
	public ArrayList<Machine> getMachineList(){
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
}
