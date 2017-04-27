package prj5;

import student.TestCase;

/**
 * Test the genre comparison class
 * 
 * @author Group48
 * @version 4/20/2017
 *
 */
public class GenreComparatorTest extends TestCase {
    private Song song1;
    private Song song2;
    private GenreComparator compared;


    /**
     * Set up tests
     */
    public void setUp() {
        compared = new GenreComparator();
        song1 = new Song("Up", "Bry", 2007, "Alternate");
        song2 = new Song("Down", "Collin", 1998, "Metal");
    }


    /**
     * Test the compare method
     */
    public void testCompareTo() {
        int x = compared.compare(song1, song2);
        assertTrue(x < 0);
    }
}
