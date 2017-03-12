import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleMain {
	private static Scanner cin = new Scanner(System.in);
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
	
	public static void removeMachines(){
		int select;
		boolean stop = false;
		Deleter del = new Deleter();
		while(!stop){
			select = menu.machine("MENU PRINCIPAL > RETIRER UNE MACHINE >");
			System.out.println("");
			
			if(select == 0){
				stop = true;
			}else if(select == 1){
				del.Ordi();
			}else if(select == 2){
				del.Router();
			}else if(select == 3){
				del.Switch();
			}else if(select == 4){
				del.AccessPoint();
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
