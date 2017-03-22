import java.util.Scanner;
import machines.*;
import interfaces.*;

public class Add {
	private static Scanner cin = new Scanner(System.in);

	public static void machines(){
		String select;
		boolean stop = false;
		while(!stop){
			select = Menus.machine("MENU PRINCIPAL > AJOUTER UNE MACHINE >");
			System.out.println("");
			
			if(select.toLowerCase().equals("exit")){
				stop = true;
			}else if(select.toLowerCase().equals("pc")){
				Add.PC();
			}else if(select.toLowerCase().equals("router")){
				Add.Router();
			}else if(select.toLowerCase().equals("switch")){
				Add.Switch();
			}else if(select.toLowerCase().equals("ap")){
				Add.AP();
			}else{
				System.out.println("[ERREUR] Votre choix est incorrecte");
			}
		}
	}
	
	public static PC PC(){
		System.out.print("Nom: ");
		String name = cin.nextLine();
		System.out.println("\n[MESSAGE] L'ordinateur " + name + " à été ajouté avec succès !\n");
		return new PC(name);
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
	
	public static AP AP(){
		System.out.print("Nom: ");
		String name = cin.nextLine();
		System.out.println("");
		System.out.print("SSID: ");
		String ssid = cin.nextLine();
		System.out.println("");
		System.out.print("Clé: ");
		String key = cin.nextLine();
		System.out.println("\n[MESSAGE] Le point d'accès " + name + " à été ajouté avec succès !\n");
		return new AP(name, ssid, key);
	}
	
	public static InterfaceMac interfaceMac(){
		System.out.print("Nom: ");
		String name = cin.nextLine();
		System.out.println("");
		System.out.print("Adresse MAC: ");
		String mac = cin.nextLine();
		System.out.println("");
		return new InterfaceMac(name, mac);
	}
	
	public static InterfaceIP interfaceIP(){
		System.out.print("Nom: ");
		String name = cin.nextLine();
		System.out.println("");
		System.out.print("Adresse MAC: ");
		String mac = cin.nextLine();
		System.out.println("");
		System.out.print("Adresse IP: ");
		String ip = cin.nextLine();
		System.out.println("");
		System.out.print("Mask: ");
		String mask = cin.nextLine();
		System.out.println("");
		return new InterfaceIP(name, mac, ip, mask);
	}
	
	public static InterfacePC interfacePC(){
		System.out.print("Nom: ");
		String name = cin.nextLine();
		System.out.println("");
		System.out.print("Adresse MAC: ");
		String mac = cin.nextLine();
		System.out.println("");
		System.out.print("Adresse IP: ");
		String ip = cin.nextLine();
		System.out.println("");
		System.out.print("Mask: ");
		String mask = cin.nextLine();
		System.out.println("");
		System.out.print("Adresse IP de la passerelle: ");
		String addrPass = cin.nextLine();
		System.out.println("");
		System.out.print("Adresse IP du serveur DNS: ");
		String addrDNS = cin.nextLine();
		System.out.println("");
		return new InterfacePC(name, mac, ip, mask, addrPass, addrDNS);
	}
}
