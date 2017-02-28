public class Machine {
	public static final String DEFAULT_NAME = "Machine";
	private String name;

//Constructeurs
	public Machine(){
		this.name = DEFAULT_NAME;
	}
	public  Machine(String newName){
		this.name = newName;
	}
	
//Accesseur en lecture
	public String toString(){
		return this.name;
	}
	
	public String getName(){
		return this.name;
	}
	
//Accesseurs en ecriture
	public void setName(String newName){
		this.name = newName;
	}
}
