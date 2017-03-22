import machines.*;
import machines.Switch;
import machines.Router;

public class ConsoleMain {
	public static void main(String[] args){
		String select;
		boolean stop = false;
		while(!stop){
			select = Menus.main("MENU PRINCIPAL >");
			System.out.println("");
			if(select.toLowerCase().equals("exit")){
				stop = true;
			}else if(select.toLowerCase().equals("add")){
				Add.machines();
			}else if(select.toLowerCase().equals("remove")){
				removeMachines();
			}else if(select.toLowerCase().equals("edit")){
				Edit.machines();
			}else if(select.toLowerCase().equals("list")){
				listMachines();
			}
		}
	}
	
	public static void removeMachines(){
		String select;
		boolean stop = false;
		while(!stop){
			select = Menus.machine("MENU PRINCIPAL > RETIRER UNE MACHINE >");
			System.out.println("");
			
			if(select.toLowerCase().equals("exit")){
				stop = true;
			}else if(select.toLowerCase().equals("pc")){
				Delete.Ordi();
			}else if(select.toLowerCase().equals("router")){
				Delete.Router();
			}else if(select.toLowerCase().equals("switch")){
				Delete.Switch();
			}else if(select.toLowerCase().equals("ap")){
				Delete.AccessPoint();
			}else{
				System.out.println("[ERREUR] Votre choix est incorrecte");
			}
			System.out.println("");
		}
	}
	
	public static void listMachines(){
		String select;
		boolean stop = false;
		while(!stop){
			select = Menus.machine("MENU PRINCIPAL > LISTER LES MACHINES >");
			System.out.println("");
			
			if(select.toLowerCase().equals("exit")){
				stop = true;
			}else if(select.toLowerCase().equals("pc")){
				System.out.println(PC.listToString());
			}else if(select.toLowerCase().equals("router")){
				System.out.println(Router.listToString());
			}else if(select.toLowerCase().equals("router")){
				System.out.println(Switch.listToString());
			}else if(select.toLowerCase().equals("ap")){
				System.out.println(AP.listToString());
			}else{
				System.out.println("[ERREUR] Votre choix est incorrecte");
			}
			System.out.println("");
		}
	}
}
