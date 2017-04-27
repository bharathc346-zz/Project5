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
    private ArtistComparator ac;
    private YearComparator yc;


    /**
     * setUp method
     */
    public void setUp() {
        s1 = new Song("A", "me", 2017, "rap");
        tc = new TitleComparator();
        gc = new GenreComparator();
        ac = new ArtistComparator();
        yc = new YearComparator();
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
        assertEquals(-1, yc.compare(s2, s3));
        assertEquals(1, yc.compare(s3, s2));
        assertEquals(6, ac.compare(s2, s3));
    }


    /**
     * test set and getCSHeardPercent and set and getCSLikedPercent
     */
    public void testGetSetCSPercent() {
        s1.setComputerScienceHeardPercent(50);
        assertEquals(s1.getComputerScienceHeardPercent(), 50);
        s1.setComputerScienceLikedPercent(60);
        assertEquals(s1.getComputerScienceLikedPercent(), 60);
    }


    /**
     * test set and getOtherEngHeardPercent and set and getOtherEngLikedPercent
     */
    public void testGetSetOtherEngPercent() {
        s1.setOtherEngineeringHeardPercent(50);
        assertEquals(s1.getOtherEngineeringHeardPercent(), 50);
        s1.setOtherEngineeringLikedPercent(60);
        assertEquals(s1.getOtherEngineeringLikedPercent(), 60);
    }


    /**
     * test set and getMathorCMDAPercent and set and getMathOrCMDaLikedPercent
     */
    public void testGetSetMathPercent() {
        s1.setMathOrCMDAHeardPercent(50);
        assertEquals(s1.getMathOrCMDAHeardPercent(), 50);
        s1.setMathOrCMDALikedPercent(60);
        assertEquals(s1.getMathOrCMDALikedPercent(), 60);
    }


    /**
     * test set and getOtherHeardPercent and set and getOtherLikedPercent
     */
    public void testGetSetOtherPercent() {
        s1.setOtherHeardPercent(50);
        assertEquals(s1.getOtherHeardPercent(), 50);
        s1.setOtherLikedPercent(60);
        assertEquals(s1.getOtherLikedPercent(), 60);
    }
    
    /**
     * test set and getSeHeardPercent and set and get SeLikedPercent
     */
    public void testGetSetSePercent() {
        s1.setSeHeardPercent(50);
        assertEquals(s1.getSeHeardPercent(),50);
        s1.setSeLikedPercent(60);
        assertEquals(s1.getSeLikedPercent(), 60);
    }
    
    /**
     * test set and getNeHeardPercent and set and getNeLikedPercent
     */
    public void testGetSetNePercent() {
        s1.setNeHeardPercent(50);
        assertEquals(s1.getNeHeardPercent(),50);
        s1.setNeLikedPercent(60);
        assertEquals(s1.getNeLikedPercent(), 60);
    }
    
    /**
     * test set and getIntlHeardPercent and set and get IntlLikedPercent
     */
    public void testGetSetIntlPercent() {
        s1.setInlHeardPercent(50);
        assertEquals(s1.getInlHeardPercent(),50);
        s1.setInlLikedPercent(60);
        assertEquals(s1.getInlLikedPercent(), 60);
    }
    
    /**
     * test set and getUSHeardPercent and set and getUSLikedPercent
     */
    public void testGetSetUSPercent() {
        s1.setUsHeardPercent(50);
        assertEquals(s1.getUsHeardPercent(),50);
        s1.setUsLikedPercent(60);
        assertEquals(s1.getUsLikedPercent(), 60);
    }
}
