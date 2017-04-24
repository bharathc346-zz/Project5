/**
 * 
 */
package prj5;

/**
 * @author bharathchintagunta
 * @version 2017-04-20
 */
public class SongTest extends student.TestCase {
    private Song s1;
    private TitleComparator tc;
    private GenreComparator gc;


    /**
     * setUp method
     */
    public void setUp() {
        s1 = new Song("A", "me", 2017, "rap");
        tc = new TitleComparator();
        gc = new GenreComparator();
    }


    /**
     * test getName()
     */
    public void testGetName() {
        assertEquals("A", s1.getName());
    }


    /**
     * test getArtist()
     */
    public void testGetArtist() {
        assertEquals("me", s1.getArtist());
    }


    /**
     * test getYear()
     */
    public void testGetYear() {
        assertEquals(2017, s1.getYear());
    }


    /**
     * test getGenre()
     */
    public void testGetGenre() {
        assertEquals("rap", s1.getGenre());
    }


    /**
     * test set and getSportsHeardPercent
     */
    public void testSetGetSportsHeardPercent() {
        s1.setSportsHeardPercent(50);
        assertEquals(50, s1.getSportsHeardPercent());
    }


    /**
     * test set and getSportsLikedPercent
     */
    public void testSetGetSportsLikedPercent() {
        s1.setSportsLikedPercent(50);
        assertEquals(50, s1.getSportsLikedPercent());
    }


    /**
     * test set and getReadingHeardPercent
     */
    public void testSetGetReadingHeardPercent() {
        s1.setReadingHeardPercent(60);
        assertEquals(60, s1.getReadingHeardPercent());
    }


    /**
     * test set and getReadingLikedPercent
     */
    public void testSetGetReadingLikedPercent() {
        s1.setReadingLikedPercent(60);
        assertEquals(60, s1.getReadingLikedPercent());
    }


    /**
     * test set and getMusicHeardPercent
     */
    public void testSetGetMusicHeardPercent() {
        s1.setMusicHeardPercent(70);
        assertEquals(70, s1.getMusicHeardPercent());
    }


    /**
     * test set and getMusicLikedPercent
     */
    public void testSetGetMusicLikedPercent() {
        s1.setMusicLikedPercent(70);
        assertEquals(70, s1.getMusicLikedPercent());
    }


    /**
     * test set and getArtHeardPercent
     */
    public void testSeArtMusicHeardPercent() {
        s1.setArtHeardPercent(80);
        assertEquals(80, s1.getArtHeardPercent());
    }


    /**
     * test set and getArtLikedPercent
     */
    public void testSetGetArtLikedPercent() {
        s1.setArtLikedPercent(80);
        assertEquals(80, s1.getArtLikedPercent());
    }


    /**
     * test genreComparator and titleComparator
     */
    public void testGenreComparator() {
        Song s2 = new Song("B", "you", 2016, "pop");
        Song s3 = new Song("C", "someone", 2018, "EDM");
        assertEquals(-1, tc.compare(s2, s3));
        assertEquals(2, tc.compare(s3, s1));
        assertEquals(43, gc.compare(s2, s3));
        assertEquals(-45, gc.compare(s3, s1));
    }

}
