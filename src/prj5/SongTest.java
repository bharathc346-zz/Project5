package prj5;

import student.TestCase;
/**
 * Test the song class and its methods
 * @author Group 48
 * @version 4/20/2017
 *
 */
public class SongTest extends TestCase {

    private Song song;
    /**
     * Set up testing
     */
    public void setUp()
    {
        song = new Song("Sadness", "Bryan", 1997, "Classical");
    }
    /**
     * Test the getname method
     */
    public void testGetTitle()
    {
        assertEquals("Sadness", song.getName());
    }
    /**
     * Get the writer
     */
    public void testGetAuthor()
    {
        assertEquals("Bryan", song.getArtist());
    }
    /**
     * Get the year song was made
     */
    public void testGetYear()
    {
        assertEquals(1997, song.getYear());
    }
    /**
     * Get the type of song
     */
    public void testGetGenre()
    {
        assertEquals("Classical", song.getGenre());
    }

}
