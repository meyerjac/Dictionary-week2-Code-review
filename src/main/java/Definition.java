import java.util.*;

public class Definition {
  private String mName;
  private static ArrayList<Definition> instances = new ArrayList<Definition>();
  private int mID;

  public Definition (String name) {
    mName = name;
    instances.add(this);
    mID = instances.size();
  }

  public String getName() {
    return mName;
  }
  public static ArrayList<Definition> all(){
    return instances;
  }
  public int getId() {
    return mID;
  }
  public static Definition find(int id){
    return instances.get( id - 1 );

  }
}
