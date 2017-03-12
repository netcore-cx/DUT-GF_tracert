import java.util.ArrayList;

public class ConsoleMain {
	private static Menus menu = new Menus();
	private static Adder add = new Adder();
	
	public static void main(String[] args){
		int select;
		boolean stop = false;
		while(!stop){
			select = menu.main("MENU PRINCIPAL >");
			System.out.println("");
			if(select == 0){
				stop = true;
			}else if(select == 1){
				addMachines();
			}else if(select == 2){
				//removeMachines();
			}else if(select == 3){
				//removeMachines();
			}else if(select == 4){
				listMachines();
			}
		}
	}
	
	public static void addMachines(){
		int select;
		boolean stop = false;
		while(!stop){
			select = menu.machine("MENU PRINCIPAL > AJOUTER UNE MACHINE >");
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
	
	public static void listMachines(){
		int select;
		boolean stop = false;
		while(!stop){
			select = menu.machine("MENU PRINCIPAL > LISTER LES MACHINES >");
			System.out.println("");
			
			if(select == 0){
				stop = true;
			}else if(select == 1){
				System.out.println(new Ordi("ReadOnly").ordisToString());
			}else if(select == 2){
				System.out.println(new Router("ReadOnly").routersToString());
			}else if(select == 3){
				System.out.println(new Switch("ReadOnly").switchsToString());
			}else if(select == 4){
				System.out.println(new AccessPoint("ReadOnly").APsToString());
			}else{
				System.out.println("[ERREUR] Votre choix est incorrecte");
			}
			System.out.println("");
		}
	}
}
