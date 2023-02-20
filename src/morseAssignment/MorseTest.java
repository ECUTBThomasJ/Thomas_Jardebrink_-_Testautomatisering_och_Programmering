package morseAssignment;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class MorseTest {
    private Morse mt = new Morse();

    //Test letter 'E' to morse code
    @Test
    public void testToMorse(){

        //Arrange
        String testData = "E";

        String expected = "*";

        //Act
        String actual = mt.translate(testData);

        //Assert
        assertEquals(expected, actual);

    }
    //Test morse * to English
    @Test
    public void testToEnglish(){

        //Arrange
        String testData = "*";

        String expected = "E";

        //Act
        String actual = mt.translate(testData);

        //Assert
        assertEquals(expected, actual);

    }
    //Test translation of English Sentence to morse.
    @Test
    public void testToMorseSentence(){

        //Arrange
        String testData = "Hello World, is this working?";

        String expected = "**** * *-** *-** --- |" +
                " *-- --- *-* *-** -** --**-- | " +
                "** *** | - **** ** *** | " +
                "*-- --- *-* -*- ** -* --* **--**";

        //Act
        String actual = mt.translate(testData);

        //Assert
        assertEquals(expected, actual);

    }
    //Test translation of English Sentence to morse.
    @Test
    public void testToEnglishSentence(){

        //Arrange
        String testData = "**** * *-** *-** --- |" +
                " *-- --- *-* *-** -** --**-- | " +
                "** *** | - **** ** *** | " +
                "*-- --- *-* -*- ** -* --* **--**";

        String expected = "HELLO WORLD, IS THIS WORKING?";

        //Act
        String actual = mt.translate(testData);
        //Assert
        assertEquals(expected, actual);

    }
    @Test
    public void testSpecialCharacters(){

        //Arrange
        String testData = "%#)($&";

        String expected = "";

        //Act
        String actual = mt.translate(testData);
        //Assert
        assertEquals(expected, actual);

    }
}
