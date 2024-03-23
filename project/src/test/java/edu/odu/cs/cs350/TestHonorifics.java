package edu.odu.cs.cs350;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestHonorifics {
        /**
     * Test to make sure Honorifics constructor
     * is properly creating new instance of Honorifics
     */
    @Test
    public void testHonorificsConstructor(){
        Honorifics honorificsFeature = new Honorifics();
        assertNotNull(honorificsFeature);
    }

    /**
     * Tests that both reference files are both valid
     * and that function returns open file
     */
    @Test
    public void testOpenFile()
        throws FileNotFoundException
    {
        CommonNames testInput = new CommonNames();

        String inputFileOne = "src/test/data/Dictionary.honorifics.txt";
        assertNotNull(testInput.openFile(inputFileOne));
    }

    /**
     * Test to see that token value is accepted and verified 
     * as true or false dependent on the string value being
     * located within Dictionary.honorifics.txt
     */
    @Test
    public void testContainsHonorifics() 
        throws IOException
    {
        Honorifics honorificsOne = new Honorifics();
        Token token = new Token("Mr");
        assertEquals(honorificsOne.containsHonorifics(token.getValue()) , true);
        
        Honorifics honorificsTwo = new Honorifics();
        Token tokenTwo = new Token("SyntaxSages");
        assertNotEquals(honorificsTwo.containsHonorifics(tokenTwo.getValue()), true);
    }
}
