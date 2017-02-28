import java.util.ArrayList;
public class Switch extends Machine{
  private ArrayList interfaces;

  public Switch(){
    super();
    ArrayList interfaces = new ArrayList();
  }
  public Switch(String newName){
    super(newName);
    ArrayList interfaces = new ArrayList();
  }

  public String toSting(){
    return super.toString();
  }
}
