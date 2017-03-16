package links;
import java.util.ArrayList;

public class Link{
  static final String DEFAULT_MAC = "0000.0000.0000.0000"; 
  public static ArrayList<Link> list = new ArrayList<Link>();
  private String link1;
  private String link2;
  
  public Link(){
    this.link1 = DEFAULT_MAC;
    this.link2 = DEFAULT_MAC;
    list.add(this);
  }
  public Link(String link1, String link2){
    this.link1 = link1;
    this.link2 = link2;
    list.add(this);
  }
  
  // Ecriture
  
  public void setLink1(String link1){
    this.link1 = link1;
  }
  public void setLink2(String link2){
    this.link2 = link2;
  }
  public void setLinks(String link1, String link2){
    this.link1 = link1;
    this.link2 = link2;
  }
  
  // Lecture
  
  public String getLink1(){
    return link1;
  }  
  public String getLink2(){
    return link2;
  }
  public ArrayList<Link> getLinksList(){
    return list;
  }
}
