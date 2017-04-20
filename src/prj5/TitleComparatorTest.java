package prj5;

import student.TestCase;
/**
 * Test class for title comparator
 * @author group48
 * @version 4/20/2017
 *
 */
public class TitleComparatorTest extends TestCase {

    private TitleComparator comp;
    /**
     * Set up testing
     */
    public void setUp()
    {
        comp = new TitleComparator();
    }
    /**
     * test the compare method
     */
    public void testCompareTitle()
    {
        Song song1 = new Song("Sorry", "Justin", 2005, "Pop");
        Song song2 = new Song("Bad Blood", "Taylor", 2015, "Pop");
        int x = comp.compare(song1, song2);
        assertTrue(x > 0);
    }

}
