package prj5;

import student.TestCase;

/**
 * Test class for Hobby Percent class
 * @author group48
 * @version 4/27/2017
 *
 */
public class HobbyPercentTest extends TestCase {
    private HobbyPercent hobby;


    /**
     * Set up the object for testing
     */
    public void setUp() {
        hobby = new HobbyPercent();
    }


    /**
     * test the increment method
     */
    public void testIncrement() {
        hobby.increment("reading", "Yes", "Yes");
        hobby.increment("reading", "Yes", "No");
        hobby.increment("reading", "No", "Yes");
        hobby.increment("reading", "No", "No");
        hobby.increment("art", "Yes", "Yes");
        hobby.increment("art", "Yes", "No");
        hobby.increment("art", "No", "Yes");
        hobby.increment("art", "No", "No");
        hobby.increment("sports", "Yes", "Yes");
        hobby.increment("sports", "Yes", "No");
        hobby.increment("sports", "No", "Yes");
        hobby.increment("sports", "No", "No");
        hobby.increment("music", "Yes", "Yes");
        hobby.increment("music", "Yes", "No");
        hobby.increment("music", "No", "Yes");
        hobby.increment("music", "No", "No");

        assertEquals(hobby.getHeard()[0], 50);
        assertEquals(hobby.getHeard()[1], 50);
        assertEquals(hobby.getHeard()[2], 50);
        assertEquals(hobby.getHeard()[3], 50);
    }
}
