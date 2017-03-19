import machines.*;

public class Edit {
	
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
