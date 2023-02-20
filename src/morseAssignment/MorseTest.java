package morseAssignment;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class MorseTest {

    //Test letter 'E' to morse code
    @Test
    public void testToMorse(){

        //Arrange
        Morse mt = new Morse();
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
        Morse mt = new Morse();
        String testData = "-";

        String expected = "T";

        //Act
        String actual = mt.translate(testData);

        //Assert
        assertEquals(expected, actual);

    }
    //Test translation of English Sentence to morse.
    @Test
    public void testToMorseSentence(){

        //Arrange
        Morse mt = new Morse();
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
        Morse mt = new Morse();
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
        Morse mt = new Morse();
        String testData = "%#)($&";

        String expected = "### - Invalid Input - ###";

        //Act
        String actual = mt.translate(testData);
        //Assert
        assertEquals(expected, actual);

    }
}
