import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;
import java.util.*;

public class WordTest {

  @Test
  public void word_instantiatesNewWord_true() {
    Word wordData = new Word("yellow");
    assertEquals(true, wordData instanceof Word);
  }

  @Test
  public void word_getName_typeOfColor() {
    Word wordData = new Word("type of color");
    assertEquals("type of color", wordData.getName());
  }

  @Test
  public void clear_emptiesAllWordsFromList_0() {
    Word wordData = new Word("yellow");
    Word.clear();
    assertEquals(wordData.all().size(), 0);
  }

  @Test
  public void getId_wordsInstantiateWithAnId_1() {
    Word.clear();
    Word wordData = new Word("yellow");
    assertEquals(1, wordData.getId());
  }

  @Test
  public void find_ReturnsWordWithSameId_secondWordSameId() {
    Word.clear();
    Word first = new Word("book");
    Word second = new Word("lost");
    assertEquals(second, Word.find(second.getId()));
  }

  @Test
  public void getDefinitions_initiallyReturnsEmptyList_ArrayList() {
    Word.clear();
    Word testWord = new Word("entrepeneur");
    assertEquals(0, testWord.getDefinitions().size());
  }

  @Test
  public void addDefinition_addsDefinitionsToList_true() {
    Word testWord = new Word("runway");
    Definition testDefinition = new Definition("long");
    testWord.addDefinition(testDefinition);
    assertTrue(testWord.getDefinitions().contains(testDefinition));
  }
}
