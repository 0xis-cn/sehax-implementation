package fit.matling.sehax;

import java.util.Arrays;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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
        assertTrue(Arrays.equals(
		new int[]{0, 3, 5, 3, 6, 2, 0, 1, 6, 3, 6, 3, 3, 3, 2, 2, 3, 5, 3, 5, 4, 5, 6, 3, 3, 6, 2, 4, 1, 6, 6, 3, 3, 3, 4, 5, 0, 5, 0, 0, 2, 1, 3, 6, 5},
                new Sehax45s().digestUnguarded("this is a test", false)
	));
    }
}
