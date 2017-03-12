public class ConsoleMain {
	private static Menus menu = new Menus();
	private static Adder add = new Adder();
	
	public static void main(String[] args){
		int select;
		boolean stop = false;
		while(!stop){
			select = menu.main();
			System.out.println("");
			if(select == 0){
				stop = true;
			}else if(select == 1){
				addMachine();
			}
		}
	}
	
	public static void addMachine(){
		int select;
		boolean stop = false;
		while(!stop){
			select = menu.machine();
			System.out.println("");
			
			if(select == 0){
				stop = true;
			}else if(select == 1){
				add.Ordi();
			}else if(select == 2){
				add.Router();
			}else if(select == 3){
				add.Switch();
			}else if(select == 4){
				add.AccessPoint();
			}else{
				System.out.println("[ERREUR] Votre choix est incorrecte");
			}
		}
	}
}
