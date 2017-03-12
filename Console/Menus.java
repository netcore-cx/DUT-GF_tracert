import java.util.Scanner;

public class Menus {
	private static Scanner cin = new Scanner(System.in);
	public Menus() {}

	public static int main(){
		System.out.println("| MENU PRINCIPAL >");
		System.out.println("|");
		System.out.println("| 1. Ajouter une machine");
		System.out.println("| 2. Retirer une machine");
		System.out.println("| 3. Modifier une machine");
		System.out.println("| 0. Quitter l'application");
		System.out.println("");
		
		return cin.nextInt();
	}
	
	public static int machine(){
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
}
