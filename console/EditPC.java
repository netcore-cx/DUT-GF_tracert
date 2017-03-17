import java.util.Scanner;
import machines.*;

public class EditPC {
	private static Scanner cin = new Scanner(System.in);
	
	public static PC global(int i){
		String select;
		boolean stop = false;
		while(!stop){
			select = Menus.editPC(i, "MENU PRINCIPAL > EDITER UNE MACHINE > PC > " + PC.list.get(i).getName());
			System.out.println("");
			if(select.toLowerCase().equals("exit")){
				stop = true;
			}else if(select.toLowerCase().equals("name")){
				EditPC.name(i);
			}else if(select.toLowerCase().equals("router")){
				EditMachine.Router();
			}else if(select.toLowerCase().equals("switch")){
				EditMachine.Switch();
			}else if(select.toLowerCase().equals("ap")){
				EditMachine.AccessPoint();
			}else{
				System.out.println("[ERREUR] Votre choix est incorrecte");
			}
			System.out.println("");
		}
		return PC.list.get(i);
	}
	
	public static void name(int i){
		System.out.print("Nouveau nom: ");
		String newName = cin.nextLine();
		PC copyPC = PC.list.get(i);
		copyPC.setName(newName);
		System.out.println("\n[MESSAGE] L'ordinateur " + PC.list.get(i).getName() + " à été renommé en " + newName);
		PC.list.set(i, copyPC);
	}
}
