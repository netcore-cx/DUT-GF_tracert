import java.util.ArrayList;

public class test{
  public static void main(String[] args){
    Ordi pc = new Ordi("PcLinux");
    System.out.println(pc.toString());
    InterfaceOrdi temp = new InterfaceOrdi("ad4e.4a5f.c9af", "192.168.1.1", "255.255.255.0", "192.168.1.254","8.8.8.8");
  	System.out.println(temp.getDns());
  	System.out.println(temp.getPasserelle());
  	System.out.println(temp.getIp());
  	System.out.println(temp.getMask());
  	System.out.println(temp.getMac());
}
}
