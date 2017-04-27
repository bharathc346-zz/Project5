package prj5;

import student.TestCase;

/**
 * Test Class for the major percent class
 * 
 * @author group48
 * @version 4/27/2017
 *
 */
public class MajorPercentTest extends TestCase {
    private MajorPercent major;


    /**
     * Set up the object for testing
     */
    public void setUp() {
        major = new MajorPercent();
    }


    /**
     * test the increment method
     */
    public void testIncrement() {
        major.increment("Computer Science", "Yes", "Yes");
        major.increment("Computer Science", "Yes", "No");
        major.increment("Computer Science", "No", "Yes");
        major.increment("Computer Science", "No", "No");
        major.increment("Other Engineering", "Yes", "Yes");
        major.increment("Other Engineering", "Yes", "No");
        major.increment("Other Engineering", "No", "Yes");
        major.increment("Other Engineering", "No", "No");
        major.increment("Math or CMDA", "Yes", "Yes");
        major.increment("Math or CMDA", "Yes", "No");
        major.increment("Math or CMDA", "No", "Yes");
        major.increment("Math or CMDA", "No", "No");
        major.increment("Other", "Yes", "Yes");
        major.increment("Other", "Yes", "No");
        major.increment("Other", "No", "Yes");
        major.increment("Other", "No", "No");
        
        major.increment("Apple", "", "no");
        major.increment("zebra", "Yeah", "Naw");
        major.increment("Computer Science", "Hmm", "Hmm");
        major.increment("Other Engineering", "Hmm", "Hmm");
        major.increment("Math or CMDA", "Hmm", "Hmm");
        major.increment("Other", "Hmm", "Hmm");
        major.increment("Computer Science", "Zee", "Zee");
        major.increment("Other Engineering", "Zee", "Zee");
        major.increment("Math or CMDA", "Zee", "Zee");
        major.increment("Other", "Zee", "Zee");

        assertEquals(major.getHeard()[0], 50);
        assertEquals(major.getHeard()[1], 50);
        assertEquals(major.getHeard()[2], 50);
        assertEquals(major.getHeard()[3], 50);
        assertEquals(major.getLike()[0], 50);
        assertEquals(major.getLike()[1], 50);
        assertEquals(major.getLike()[2], 50);
        assertEquals(major.getLike()[3], 50);
    }
}
