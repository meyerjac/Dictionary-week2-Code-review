import java.util.List;
import java.util.ArrayList;

public class Word {
  private String mName;
  private static List<Word> instances = new ArrayList<Word>();
  private int mId;
  private List<Definition> mDefinition;

  public Word(String name) {
    mName = name;
    instances.add(this);
    mId = instances.size();
    mDefinition = new ArrayList<Definition>();
  }

  public String getName() {
    return mName;
  }
  public static List<Word> all() {
    return instances;
  }
  public static void clear() {
    instances.clear();
  }
  public int getId() {
    return mId;
  }
  public static Word find(int id) {
    return instances.get(id-1);
  }
  public List<Definition> getDefinitions() {
    return mDefinition;
  }
}
