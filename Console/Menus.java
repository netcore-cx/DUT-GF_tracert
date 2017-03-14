import java.util.Scanner;

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
}
