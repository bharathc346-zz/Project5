package prj5;

import student.TestCase;

/**
 * Test class for the region percent class
 * 
 * @author group48
 * @version 4/27/2017
 *
 */
public class RegionPercentTest extends TestCase {
    private RegionPercent region;


    /**
     * Set up the object for testing
     */
    public void setUp() {
        region = new RegionPercent();
    }


    /**
     * test the increment method
     */
    public void testIncrement() {
        region.increment("Northeast", "Yes", "Yes");
        region.increment("Northeast", "Yes", "No");
        region.increment("Northeast", "No", "Yes");
        region.increment("Northeast", "No", "No");
        region.increment("Southeast", "Yes", "Yes");
        region.increment("Southeast", "Yes", "No");
        region.increment("Southeast", "No", "Yes");
        region.increment("Southeast", "No", "No");
        region.increment("United States (other than Southeast or Northwest)",
            "Yes", "Yes");
        region.increment("United States (other than Southeast or Northwest)",
            "Yes", "No");
        region.increment("United States (other than Southeast or Northwest)",
            "No", "Yes");
        region.increment("United States (other than Southeast or Northwest)",
            "No", "No");
        region.increment("Outside of United States", "Yes", "Yes");
        region.increment("Outside of United States", "Yes", "No");
        region.increment("Outside of United States", "No", "Yes");
        region.increment("Outside of United States", "No", "No");
        
        region.increment("Apple", "", "no");
        region.increment("zebra", "Yeah", "Naw");
        region.increment("Northeast", "Hmm", "Hmm");
        region.increment("Southeast", "Hmm", "Hmm");
        region.increment("United States "
            + "(other than Southeast or Northwest)", "Hmm", "Hmm");
        region.increment("Outside of United States", "Hmm", "Hmm");
        region.increment("Northeast", "Zee", "Zee");
        region.increment("Southeast", "Zee", "Zee");
        region.increment("United States "
            + "(other than Southeast or Northwest)", "Zee", "Zee");
        region.increment("Outside of United State", "Zee", "Zee");

        assertEquals(region.getHeard()[0], 50);
        assertEquals(region.getHeard()[1], 50);
        assertEquals(region.getHeard()[2], 50);
        assertEquals(region.getHeard()[3], 50);
        assertEquals(region.getLike()[0], 50);
        assertEquals(region.getLike()[1], 50);
        assertEquals(region.getLike()[2], 50);
        assertEquals(region.getLike()[3], 50);
    }
}
