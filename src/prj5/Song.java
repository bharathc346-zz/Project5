/**
 * 
 */
package prj5;

/**
 * @author bharathchintagunta
 * @version 2017-04-20
 */
public class Song {
    private String name;
    private String artist;
    private int year;
    private String genre;
    private int sportsHeardPercent;
    private int sportsLikedPercent;
    private int readingHeardPercent;
    private int readingLikedPercent;
    private int artHeardPercent;
    private int artLikedPercent;
    private int musicHeardPercent;
    private int musicLikedPercent;


    /**
     * Song Constructor
     * 
     * @param n
     *            name
     * @param a
     *            artist
     * @param y
     *            year
     * @param g
     *            genre
     */
    public Song(String n, String a, int y, String g) {
        this.name = n;
        this.artist = a;
        this.year = y;
        this.genre = g;
    }


    /**
     * getName of song
     * 
     * @return song name
     */
    public String getName() {
        return this.name;
    }


    /**
     * get Artist
     * 
     * @return artist
     */
    public String getArtist() {
        return this.artist;
    }


    /**
     * get year
     * 
     * @return year
     */
    public int getYear() {
        return this.year;
    }


    /**
     * get genre
     * 
     * @return genre
     */
    public String getGenre() {
        return this.genre;
    }


    /**
     * set sports students heard percent
     * 
     * @param p
     *            percent to set to
     */
    public void setSportsHeardPercent(int p) {
        this.sportsHeardPercent = p;
    }


    /**
     * set sports students liked percent
     * 
     * @param p
     *            percent to set to
     */
    public void setSportsLikedPercent(int p) {
        this.sportsLikedPercent = p;
    }


    /**
     * get sports students heard percent
     * 
     * @return sports heard percent
     */
    public int getSportsHeardPercent() {
        return this.sportsHeardPercent;
    }


    /**
     * get sports students liked percent
     * 
     * @return sports heard percent
     */
    public int getSportsLikedPercent() {
        return this.sportsLikedPercent;
    }


    /**
     * set music students heard percent
     * 
     * @param p
     *            percent to set to
     */
    public void setMusicHeardPercent(int p) {
        this.musicHeardPercent = p;
    }


    /**
     * set music students liked percent
     * 
     * @param p
     *            percent to set to
     */
    public void setMusicLikedPercent(int p) {
        this.musicLikedPercent = p;
    }


    /**
     * get music students heard percent
     * 
     * @return music heard percent
     */
    public int getMusicHeardPercent() {
        return this.musicHeardPercent;
    }


    /**
     * get music students liked percent
     * 
     * @return music heard percent
     */
    public int getMusicLikedPercent() {
        return this.musicLikedPercent;
    }


    /**
     * set reading students heard percent
     * 
     * @param p
     *            percent to set to
     */
    public void setReadingHeardPercent(int p) {
        this.readingHeardPercent = p;
    }


    /**
     * set reading students liked percent
     * 
     * @param p
     *            percent to set to
     */
    public void setReadingLikedPercent(int p) {
        this.readingLikedPercent = p;
    }


    /**
     * get reading students heard percent
     * 
     * @return reading heard percent
     */
    public int getReadingHeardPercent() {
        return this.readingHeardPercent;
    }


    /**
     * get reading students liked percent
     * 
     * @return reading heard percent
     */
    public int getReadingLikedPercent() {
        return this.readingLikedPercent;
    }


    /**
     * set art students heard percent
     * 
     * @param p
     *            percent to set to
     */
    public void setArtHeardPercent(int p) {
        this.artHeardPercent = p;
    }


    /**
     * set art students liked percent
     * 
     * @param p
     *            percent to set to
     */
    public void setArtLikedPercent(int p) {
        this.artLikedPercent = p;
    }


    /**
     * get art students heard percent
     * 
     * @return art heard percent
     */
    public int getArtHeardPercent() {
        return this.artHeardPercent;
    }


    /**
     * get arts students liked percent
     * 
     * @return art heard percent
     */
    public int getArtLikedPercent() {
        return this.artLikedPercent;
    }
}
