import java.util.Scanner;
import machines.*;
import interfaces.*;

public class Menus {
	private static Scanner cin = new Scanner(System.in);

	public static String main(String title){
		System.out.println("| " + title);
		System.out.println("|");
		System.out.println("| Add: Ajouter une machine");
		System.out.println("| Remove: Retirer une machine");
		System.out.println("| Edit: Modifier une machine");
		System.out.println("| List: Lister les machines");
		System.out.println("| Exit: Quitter l'application");
		System.out.println("");

		System.out.print("Choix: ");
		return cin.nextLine();
	}
	
	public static String machine(String title){
		System.out.println("| " + title);
		System.out.println("|");
		System.out.println("| PC (Ordinateur)");
		System.out.println("| Router");
		System.out.println("| Switch");
		System.out.println("| AP (Point d'accès)");
		System.out.println("| Exit: Retour");
		System.out.println("");
		
		System.out.print("Choix: ");
		return cin.nextLine();
	}
	
	public static String editPC(String title){
		System.out.println("| " + title);
		System.out.println("|");
		System.out.println("| Name: Modifier le nom de l'ordinateur");
		System.out.println("| Add: Ajouter une interface");
		System.out.println("| Remove: Retirer une interface");
		System.out.println("| Edit: Modifier une interface");
		System.out.println("| List: Lister les interfaces");
		System.out.println("| Service: Modifier les services");
		System.out.println("| Exit: Retour");
		System.out.println("");
		
		System.out.print("Choix: ");
		return cin.nextLine();
	}
	
	public static String editPCServices(String title){
		System.out.println("| " + title);
		System.out.println("|");
		System.out.println("| Add: Ajouter un services");
		System.out.println("| Remove: Retirer un services");
		System.out.println("| Edit: Modifier un services");
		System.out.println("| List: Lister les services");
		System.out.println("| Exit: Retour");
		System.out.println("");
		
		System.out.print("Choix: ");
		return cin.nextLine();
	}
	
	public static String editRouter(String title){
		System.out.println("| " + title);
		System.out.println("|");
		System.out.println("| Name: Modifier le nom du routeur");
		System.out.println("| Add: Ajouter une interface");
		System.out.println("| Remove: Retirer une interface");
		System.out.println("| Edit: Modifier une interface");
		System.out.println("| List: Lister les interfaces");
		System.out.println("| Exit: Retour");
		System.out.println("");
		
		System.out.print("Choix: ");
		return cin.nextLine();
	}
	
	public static String editSwitch(String title){
		System.out.println("| " + title);
		System.out.println("|");
		System.out.println("| Name: Modifier le nom du switch");
		System.out.println("| Add: Ajouter une interface");
		System.out.println("| Remove: Retirer une interface");
		System.out.println("| Edit: Modifier une interface");
		System.out.println("| List: Lister les interfaces");
		System.out.println("| Exit: Retour");
		System.out.println("");
		
		System.out.print("Choix: ");
		return cin.nextLine();
	}
	
	public static String editAP(int i, String title){
		System.out.println("| " + title);
		System.out.println("|");
		System.out.println("| Name: Modifier le nom du point d'accès (" + AP.list.get(i).getName() + ")");
		System.out.println("| SSID: Modifier le SSID du point d'accès(" + AP.list.get(i).getSsid() + ")");
		System.out.println("| Key: Modifier la clé du point d'accès(" + AP.list.get(i).getKey() + ")");
		System.out.println("| Add: Ajouter une interface");
		System.out.println("| Remove: Retirer une interface");
		System.out.println("| Edit: Modifier une interface");
		System.out.println("| List: Lister les interfaces");
		System.out.println("| Exit: Retour");
		System.out.println("");
		
		System.out.print("Choix: ");
		return cin.nextLine();
	}
}
