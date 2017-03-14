import java.util.Scanner;

public class AddMachine {
	private static Scanner cin = new Scanner(System.in);
	
	public static Ordi Ordi(){
		System.out.print("Nom: ");
		String name = cin.nextLine();
		System.out.println("\n[MESSAGE] L'ordinateur " + name + " à été ajouté avec succès !\n");
		return new Ordi(name);
	}
	
	public static Router Router(){
		System.out.print("Nom: ");
		String name = cin.nextLine();
		System.out.println("\n[MESSAGE] Le routeur " + name + " à été ajouté avec succès !\n");
		return new Router(name);
	}
	
	public static Switch Switch(){
		System.out.print("Nom: ");
		String name = cin.nextLine();
		System.out.println("\n[MESSAGE] Le switch " + name + " à été ajouté avec succès !\n");
		return new Switch(name);
	}
	
	public static AccessPoint AccessPoint(){
		System.out.print("Nom: ");
		String name = cin.nextLine();
		System.out.println("");
		System.out.print("SSID: ");
		String ssid = cin.nextLine();
		System.out.println("");
		System.out.print("Clé: ");
		String key = cin.nextLine();
		System.out.println("\n[MESSAGE] Le point d'accès " + name + " à été ajouté avec succès !\n");
		return new AccessPoint(name, ssid, key);
	}
}
