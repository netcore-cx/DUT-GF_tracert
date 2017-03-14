import java.util.Scanner;

public class DelMachine {
	private static Scanner cin = new Scanner(System.in);
	
	public static void Ordi(){
		System.out.println(Ordi.listToString());
		System.out.print("\nSupprimer l'ordinateur numéro: ");
		String select = cin.nextLine(); 
		if(AlphaNum.isInt(select)){
			if(Integer.parseInt(select) - 1 < Ordi.list.size() && Integer.parseInt(select) - 1 >= 0){
				Ordi.list.remove(Integer.parseInt(select) - 1);
				System.out.println("\n[MESSAGE] L'ordinateur à été reitré avec succès !");
			}else{
				System.out.println("\n[ERREUR] Choix non valide.");
			}
		}else{
			System.out.println("\n[ERREUR] Choix non valide.");
		}
	}
	
	public static void Router(){
		System.out.println(Router.listToString());
		System.out.print("\nSupprimer le routeur numéro: ");
		String select = cin.nextLine(); 
		if(AlphaNum.isInt(select)){
			if(Integer.parseInt(select) - 1 < Router.list.size() && Integer.parseInt(select) - 1 >= 0){
				Router.list.remove(Integer.parseInt(select) - 1);
				System.out.println("\n[MESSAGE] Le routeur à été reitré avec succès !");
			}else{
				System.out.println("\n[ERREUR] Choix non valide.");
			}
		}else{
			System.out.println("\n[ERREUR] Choix non valide.");
		}
	}
	
	public static void Switch(){
		System.out.println(Switch.listToString());
		System.out.print("\nSupprimer le switch numéro: ");
		String select = cin.nextLine();
		if(AlphaNum.isInt(select)){
			if(Integer.parseInt(select) - 1 < Switch.list.size() && Integer.parseInt(select) - 1 >= 0){
				Switch.list.remove(Integer.parseInt(select) - 1);
				System.out.println("\n[MESSAGE] Le switch à été reitré avec succès !");
			}else{
				System.out.println("\n[ERREUR] Choix non valide.");
			}
		}else{
			System.out.println("\n[ERREUR] Choix non valide.");
		}
	}
	
	public static void AccessPoint(){
		System.out.println(AccessPoint.listToString());
		System.out.print("\nSupprimer le point d'accès numéro: ");
		String select = cin.nextLine(); 
		if(AlphaNum.isInt(select)){
			if(Integer.parseInt(select) - 1 < AccessPoint.list.size() && Integer.parseInt(select) - 1 >= 0){
				AccessPoint.list.remove(Integer.parseInt(select) - 1);
				System.out.println("\n[MESSAGE] Le point d'accès à été reitré avec succès !");
			}else{
				System.out.println("\n[ERREUR] Choix non valide.");
			}
		}else{
			System.out.println("\n[ERREUR] Choix non valide.");
		}
	}
}
