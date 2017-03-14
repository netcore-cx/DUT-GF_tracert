import java.util.Scanner;

public class Menus {
	private static Scanner cin = new Scanner(System.in);

	public static int main(String title){
		System.out.println("| " + title);
		System.out.println("|");
		System.out.println("| 1. Ajouter une machine");
		System.out.println("| 2. Retirer une machine");
		System.out.println("| 3. Modifier une machine");
		System.out.println("| 4. Lister les machines");
		System.out.println("| 0. Quitter l'application");
		System.out.println("");

		System.out.print("Choix: ");
		return cin.nextInt();
	}
	
	public static int machine(String title){
		System.out.println("| " + title);
		System.out.println("|");
		System.out.println("| 1. Ordinateur");
		System.out.println("| 2. Routeur");
		System.out.println("| 3. Switch");
		System.out.println("| 4. AccessPoint");
		System.out.println("| 0. Retour");
		System.out.println("");
		
		System.out.print("Choix: ");
		return cin.nextInt();
	}
}
