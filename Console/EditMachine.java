import java.util.Scanner;
import machines.*;

public class EditMachine {
	private static Scanner cin = new Scanner(System.in);
	
	public static void Ordi(){
		int select = cin.nextInt();
		System.out.println(PC.listToString());
		System.out.print("Editer l'ordinateur numéro: ");
		select = cin.nextInt();
		EditPC.edit(PC.list.get(select + 1));
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
		System.out.println(AP.listToString());
		System.out.print("Supprimer le point d'accès numéro: ");
		select = cin.nextInt();
		AP.list.remove(select + 1);
		System.out.println("[MESSAGE] Le point d'accès à été reitré avec succès !");
	}
}
