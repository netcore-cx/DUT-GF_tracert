public class ConsoleMain {
	public static void main(String[] args){
		int select;
		boolean stop = false;
		while(!stop){
			select = Menus.main("MENU PRINCIPAL >");
			System.out.println("");
			if(select == 0){
				stop = true;
			}else if(select == 1){
				addMachines();
			}else if(select == 2){
				removeMachines();
			}else if(select == 3){
				//editMachines();
			}else if(select == 4){
				listMachines();
			}
		}
	}
	
	public static void addMachines(){
		int select;
		boolean stop = false;
		while(!stop){
			select = Menus.machine("MENU PRINCIPAL > AJOUTER UNE MACHINE >");
			System.out.println("");
			
			if(select == 0){
				stop = true;
			}else if(select == 1){
				AddMachine.Ordi();
			}else if(select == 2){
				AddMachine.Router();
			}else if(select == 3){
				AddMachine.Switch();
			}else if(select == 4){
				AddMachine.AccessPoint();
			}else{
				System.out.println("[ERREUR] Votre choix est incorrecte");
			}
		}
	}
	
	public static void removeMachines(){
		int select;
		boolean stop = false;
		while(!stop){
			select = Menus.machine("MENU PRINCIPAL > RETIRER UNE MACHINE >");
			System.out.println("");
			
			if(select == 0){
				stop = true;
			}else if(select == 1){
				DelMachine.Ordi();
			}else if(select == 2){
				DelMachine.Router();
			}else if(select == 3){
				DelMachine.Switch();
			}else if(select == 4){
				DelMachine.AccessPoint();
			}else{
				System.out.println("[ERREUR] Votre choix est incorrecte");
			}
			System.out.println("");
		}
	}
	
	public static void listMachines(){
		int select;
		boolean stop = false;
		while(!stop){
			select = Menus.machine("MENU PRINCIPAL > LISTER LES MACHINES >");
			System.out.println("");
			
			if(select == 0){
				stop = true;
			}else if(select == 1){
				System.out.println(Ordi.listToString());
			}else if(select == 2){
				System.out.println(Router.listToString());
			}else if(select == 3){
				System.out.println(Switch.listToString());
			}else if(select == 4){
				System.out.println(AccessPoint.listToString());
			}else{
				System.out.println("[ERREUR] Votre choix est incorrecte");
			}
			System.out.println("");
		}
	}
}
