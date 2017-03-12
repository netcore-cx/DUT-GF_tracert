import java.util.ArrayList;

public class Machine {
	public static final String DEFAULT_NAME = "Machine";
	
	static ArrayList<Machine> machineList = new ArrayList<Machine>();
	
	private String name;

	//*******************
  //** Constructeurs **
  //*******************
	public Machine(){
		this.name = DEFAULT_NAME;
		machineList.add(this);
	}
	public  Machine(String newName){
		this.name = newName;
		machineList.add(this);
	}


	//********************
  //***** Mutateur *****
  //********************
	public void setName(String newName){
		this.name = newName;
	}
	public void setMachinList(ArrayList<Machine> maichineList){
		this.machineList = machineList;
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
		return machineList;
	}
}
