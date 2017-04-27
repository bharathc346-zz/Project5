package prj5;

import student.TestCase;

/**
 * Test class for song
 * 
 * @author group48
 * @version 4/27/2017
 *
 */
public class SongTest extends TestCase {
    private Song song;


    /**
     * Set up the song
     */
    public void setUp() {
        song = new Song("NeverGiveUp", "William", "2007", "Classical");
    }


    /**
     * Test all the get methods
     */
    public void testGetters() {
        assertEquals("NeverGiveUp", song.getSongTitle());
        assertEquals("William", song.getArtistName());
        assertEquals("2007", song.getDate());
        assertEquals("Classical", song.getGenre());
    }


    /**
     * Test the increment method
     */
    public void testIncrement() {
        song.increment("reading", "ComputerScience", "Northeast", "Yes", "No");
        assertNotNull(song.getHobbyPercent());
        assertNotNull(song.getMajorPercent());
        assertNotNull(song.getRegionPercent());
    }


    /**
     * test the toString method
     */
    public void testToString() {
        assertEquals("Song Title: NeverGiveUp\nSong Artist:"
            + " William\nSong Genre: Classical\nSong Year: 2007\n", song
                .toString());
    }
}
