import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;
import java.util.*;

public class DefinitionTest {

  @Test
  public void Definition_instantiatesNewDefinition_true() {
    Definition myDefinition = new Definition("really tall");
    assertEquals(true, myDefinition instanceof Definition);
  }

  @Test
  public void Definition_getName() {
    Definition myDefinition = new Definition("happy beyond belief");
    assertEquals("happy beyond belief", myDefinition.getName());
  }

  @Test
  public void all_returnsAllInstancesOfDefinition_true() {
    Definition firstDefinition = new Definition("sky is the limit");
    Definition secondDefinition = new Definition("this is a type of archive");
    assertEquals(true, Definition.all().contains(firstDefinition));
    assertEquals(true, Definition.all().contains(secondDefinition));
  }

  @Test
  public void clear_emptiesAllDefinitionFromArrayList_0() {
    Definition myDefinition = new Definition("very round");
    Definition.clear();
    assertEquals(Definition.all().size(), 0);
  }

  @Test
  public void getId_DefinitionInstantiateWithAnID_1() {
    Definition.clear();
    Definition myDefinition = new Definition("very thoughtful");
    assertEquals(1, myDefinition.getId());
  }

  @Test
  public void find_returnsDefinitionWithSameId_secondTask() {
    Definition firstDefinition = new Definition("difficult to handle");
    Definition secondDefinition = new Definition("having fun");
    assertEquals(Definition.find(secondDefinition.getId()), secondDefinition);
   }
}
