import java.util.Scanner;

public class Adder {
	private static Scanner cin = new Scanner(System.in);
	public Adder(){}
	
	public static Ordi Ordi(){
		System.out.println("Nom: ");
		String name = cin.nextLine();
		return new Ordi(name);
	}
	
	public static Router Router(){
		System.out.println("Nom: ");
		String name = cin.nextLine();
		return new Router(name);
	}
	
	public static Switch Switch(){
		System.out.println("Nom: ");
		String name = cin.nextLine();
		return new Switch(name);
	}
	
	public static AccessPoint AccessPoint(){
		System.out.println("Nom: ");
		String name = cin.nextLine();
		return new AccessPoint(name);
	}
}
