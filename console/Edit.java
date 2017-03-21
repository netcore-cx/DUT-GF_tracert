import machines.*;

public class Edit {
	
	public static void editMachines(){
		String select;
		boolean stop = false;
		while(!stop){
			select = Menus.machine("MENU PRINCIPAL > EDITER UNE MACHINE >");
			System.out.println("");
			
			if(select.toLowerCase().equals("exit")){
				stop = true;
			}else if(select.toLowerCase().equals("pc")){
				Edit.PC();
			}else if(select.toLowerCase().equals("router")){
				//Edit.Router();
			}else if(select.toLowerCase().equals("switch")){
				//Edit.Switch();
			}else if(select.toLowerCase().equals("ap")){
				//Edit.AccessPoint();
			}else{
				System.out.println("[ERREUR] Votre choix est incorrecte");
			}
			System.out.println("");
		}
	}
	
	public static void PC(){
		int i = Menus.selectPC("MENU PRINCIPAL > EDITER UNE MACHINE > PC >");
		if(i != 0){
			String select;
			boolean stop = false;
			while(!stop){
				select = Menus.editPC(i, "MENU PRINCIPAL > EDITER UNE MACHINE > PC > " + PC.list.get(i).getName());
				System.out.println("");
				if(select.toLowerCase().equals("exit")){
					stop = true;
				}else if(select.toLowerCase().equals("name")){
					EditPC.name(i-1);
				}else if(select.toLowerCase().equals("add")){
					//EditPC.addInt(i-1);
				}else if(select.toLowerCase().equals("remove")){
					//EditPC.removeInt(i-1);
				}else if(select.toLowerCase().equals("edit")){
					//EditPC.editInt(i-1);
				}else if(select.toLowerCase().equals("list")){
					//EditPC.listInt(i-1);
				}else if(select.toLowerCase().equals("service")){
					//EditPC.services(i-1);
				}else{
					System.out.println("[ERREUR] Votre choix est incorrecte");
				}
				System.out.println("");
			}
		}
	}
}
