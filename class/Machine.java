public class Machine {
	public static final String DEFAULT_NAME = "Machine";
	private String name;

	//*******************
  //** Constructeurs **
  //*******************
	public Machine(){
		this.name = DEFAULT_NAME;
	}
	public  Machine(String newName){
		this.name = newName;
	}


	//********************
  //***** Mutateur *****
  //********************
	public void setName(String newName){
		this.name = newName;
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
}
