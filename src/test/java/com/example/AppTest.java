package com.example;

import com.example.business.Personne;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testConvert() {
        Personne testObject = new Personne("valentin", "delomenie");
        String expectedJson = "{\"firstname\":\"valentin\",\"lastName\":\"delomenie\"}";
        String actualJson = App.convertToJson(testObject);
        Assert.assertEquals(actualJson, expectedJson);
    }
    public void testCapitalize() {
        Personne testObject = new Personne("valentin", "delomenie");
        String expectedJson = "Valentin";
        String actualJson = App.capitalizeString(testObject.getFirstname());
        Assert.assertEquals(actualJson, expectedJson);
    }

}
