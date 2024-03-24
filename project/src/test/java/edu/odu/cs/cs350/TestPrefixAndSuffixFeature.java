package edu.odu.cs.cs350;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class TestPrefixAndSuffixFeature {

    /**
     * Tests the constructor for PrefixAndSuffixFeature, making sure that
     * the instantiation of the class of as an object actually happens.
     */
    @Test
    public void testPrefixAndSuffixFeatureConstructor(){
        PrefixAndSuffixFeature firstPrefixAndSuffixFeature = new PrefixAndSuffixFeature();
        assertNotNull(firstPrefixAndSuffixFeature);
    }

    /**
     * Tests the determinePrefixFeature method for the accuracy
     * of the returned boolean values.
     * 
     * @throws FileNotFoundException
     * @throws IOException
     */
    @Test
    public void testDeterminePrefixFeature() throws FileNotFoundException, IOException
    {
        PrefixAndSuffixFeature secondPrefixAndSuffixFeature = new PrefixAndSuffixFeature();
        Token firstToken = new Token("berg");

        assertEquals(secondPrefixAndSuffixFeature.determinePrefixFeature(firstToken.getValue()) , true);
        
        Token secondToken = new Token("HalfLife3IsntReal");

        assertNotEquals(secondPrefixAndSuffixFeature.determinePrefixFeature(secondToken.getValue()), true);
    }

    /**
     * Tests the determineSuffixFeature method for the accuracy
     * of the returned boolean values.
     * 
     * @throws FileNotFoundException
     * @throws IOException
     */
    @Test
    public void testDetermineSuffixFeature() throws FileNotFoundException, IOException
    {
        PrefixAndSuffixFeature thirdPrefixAndSuffixFeature = new PrefixAndSuffixFeature();
        Token secondToken = new Token("Sr");

        assertEquals(thirdPrefixAndSuffixFeature.determineSuffixFeature(secondToken.getValue()) , true);
        
        Token thirdToken = new Token("TheCakeIsALie");

        assertNotEquals(thirdPrefixAndSuffixFeature.determineSuffixFeature(thirdToken.getValue()), true);
    }
}