import java.util.Scanner;

public class ConsoleMain {
	private static Scanner cin = new Scanner(System.in);
	
	public static void main(String[] args){
		int select;
		boolean stop = false;
		while(!stop){
			select = mainMenu();
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
			select = machineMenu();
			System.out.println("");
			
			if(select == 0){
				stop = true;
			}else if(select == 1){
				addOrdi();
			}else if(select == 2){
				addRouter();
			}else if(select == 3){
				addSwitch();
			}else if(select == 4){
				addAccessPoint();
			}else{
				System.out.println("[ERREUR] Votre choix est incorrecte");
			}
		}
	}
	
	public static int mainMenu(){
		System.out.println("| MENU PRINCIPAL >");
		System.out.println("|");
		System.out.println("| 1. Ajouter une machine");
		System.out.println("| 2. Retirer une machine");
		System.out.println("| 3. Modifier une machine");
		System.out.println("| 0. Quitter l'application");
		System.out.println("");
		
		return cin.nextInt();
	}
	
	public static int machineMenu(){
		System.out.println("| MENU PRINCIPAL > AJOUTER UNE MACHINE >");
		System.out.println("|");
		System.out.println("| 1. Ordinateur");
		System.out.println("| 2. Routeur");
		System.out.println("| 3. Switch");
		System.out.println("| 4. AccessPoint");
		System.out.println("| 0. Retour");
		System.out.println("");
		
		return cin.nextInt();
	}
	
	public static Ordi addOrdi(){
		Ordi newOrdi = new Ordi();
		return newOrdi;
	}
	
	public static Router addRouter(){
		Router newRouter = new Router();
		return newRouter;
	}
	
	public static Switch addSwitch(){
		Switch newSwitch = new Switch();
		return newSwitch;
	}
	
	public static AccessPoint addAccessPoint(){
		AccessPoint newAP = new AccessPoint();
		return newAP;
	}
}
