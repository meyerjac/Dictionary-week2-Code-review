import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;
import java.util.*;

public class DefinitionTest {

  @Test
  public void Definition_instantiatesNewDefinition_true() {
    Definition myDefinition = new Definition("anything");
    assertEquals(true, myDefinition instanceof Definition);
  }

  @Test
  public void Definition_getName() {
    Definition myDefinition = new Definition("Megadeth: Rust in Peace");
    assertEquals("Megadeth: Rust in Peace", myDefinition.getName());
  }

  @Test
  public void Definition_sortedByName() {
    ArrayList<Definition> newDefinition = new ArrayList<Definition>();
    Definition myDefinition = new Definition("Megadeth: Rust in Peace");
    newDefinition.add(myDefinition);
    myDefinition = new Definition("bob");
    newDefinition.add(myDefinition);
    Collections.sort(newDefinition, Definition.DefinitionSort);
  }
  @Test
  public void all_returnsAllInstancesOfDefinition_true() {
    Definition firstDefinition = new Definition("sky is the limit");
    Definition secondDefinition = new Definition("yellowtown");
    assertEquals(true, Definition.all().contains(firstDefinition));
    assertEquals(true, Definition.all().contains(secondDefinition));
  }

  @Test
  public void clear_emptiesAllDefinitionFromArrayList_0() {
    Definition myDefinition = new Definition("sky is the limit");
    Definition.clear();
    assertEquals(Definition.all().size(), 0);
  }

  @Test
  public void getId_DefinitionInstantiateWithAnID_1() {
    Definition.clear();  // Remember, the test will fail without this line! We need to empty leftover Tasks from previous tests!
    Definition myDefinition = new Definition("sky is the limit");
    assertEquals(1, myDefinition.getId());
  }

  public void find_returnsDefinitionWithSameId_secondTask() {
    Definition firstDefinition = new Definition("sky is the limit");
    Definition secondDefinition = new Definition("yellowtown");
    assertEquals(Definition.find(secondDefinition.getId()), secondDefinition);
   }
}
