import java.util.Scanner;

public class DelMachine {
	private static Scanner cin = new Scanner(System.in);
	public DelMachine(){}
	
	public static void Ordi(){
		int select = cin.nextInt(); 
		System.out.println(Ordi.listToString());
		System.out.print("Supprimer l'ordinateur numéro: ");
		select = cin.nextInt();
		Ordi.list.remove(select + 1);
		System.out.println("[MESSAGE] L'ordinateur à été reitré avec succès !");
	}
	
	public static void Router(){
		int select = cin.nextInt();
		System.out.println(Router.listToString());
		System.out.print("Supprimer le routeur numéro: ");
		select = cin.nextInt();
		Router.list.remove(select + 1);
		System.out.println("[MESSAGE] Le routeur à été reitré avec succès !");
	}
	
	public static void Switch(){
		int select = cin.nextInt();
		System.out.println(Switch.listToString());
		System.out.print("Supprimer le switch numéro: ");
		select = cin.nextInt();
		Switch.list.remove(select + 1);
		System.out.println("[MESSAGE] Le switch à été reitré avec succès !");
	}
	
	public static void AccessPoint(){
		int select = cin.nextInt();
		System.out.println(AccessPoint.listToString());
		System.out.print("Supprimer le point d'accès numéro: ");
		select = cin.nextInt();
		AccessPoint.list.remove(select + 1);
		System.out.println("[MESSAGE] Le point d'accès à été reitré avec succès !");
	}
}
