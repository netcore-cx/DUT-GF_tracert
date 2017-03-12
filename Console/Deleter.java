import java.util.ArrayList;
import java.util.Scanner;

public class Deleter {
	private static Scanner cin = new Scanner(System.in);
	public Deleter(){}
	
	public static void Ordi(){
		int select = cin.nextInt();
		Ordi ordi = new Ordi("ReadOnly");
		System.out.print("test");
		System.out.println(ordi.ordisToString());
		System.out.print("Supprimer l'ordinateur numéro: ");
		select = cin.nextInt();
		ArrayList<Ordi> list = ordi.getOrdisList();
		list.remove(select + 1);
		ordi.setOrdisList(list);
		System.out.println("[MESSAGE] L'ordinateur à été reitré avec succès !");
	}
	
	public static void Router(){
		int select = cin.nextInt();
		Router router = new Router("ReadOnly");
		System.out.println(router.routersToString());
		System.out.print("Supprimer le routeur numéro: ");
		select = cin.nextInt();
		ArrayList<Router> list = router.getRoutersList();
		list.remove(select + 1);
		router.setRoutersList(list);
		System.out.println("[MESSAGE] Le routeur à été reitré avec succès !");
	}
	
	public static void Switch(){
		int select = cin.nextInt();
		Switch newSwitch = new Switch("ReadOnly");
		System.out.println(newSwitch.switchsToString());
		System.out.print("Supprimer le switch numéro: ");
		select = cin.nextInt();
		ArrayList<Switch> list = newSwitch.getSwitchsList();
		list.remove(select + 1);
		newSwitch.setSwitchsList(list);
		System.out.println("[MESSAGE] Le switch à été reitré avec succès !");
	}
	
	public static void AccessPoint(){
		int select = cin.nextInt();
		AccessPoint AP = new AccessPoint("ReadOnly");
		System.out.println(AP.APsToString());
		System.out.print("Supprimer le point d'accès numéro: ");
		select = cin.nextInt();
		ArrayList<AccessPoint> list = AP.getAPsList();
		list.remove(select + 1);
		AP.setAPsList(list);
		System.out.println("[MESSAGE] Le point d'accès à été reitré avec succès !");
	}
}
