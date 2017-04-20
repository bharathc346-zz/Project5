/**
 * 
 */
package prj5;

/**
 * @author bharathchintagunta
 * @verison 04.19.17
 */
public class Song {
    private String name;
    private String artist;
    private int year;
    private String genre;
    
    /**
     * Song Constructor
     * @param n name
     * @param a artist
     * @param y year
     * @param g genre
     */
    public Song(String n, String a, int y, String g) {
        this.name = n;
        this.artist = a;
        this.year = y;
        this.genre = g;
    }
    
    /**
     * getName of song
     * @return song name
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * get Artist
     * @return artist
     */
    public String getArtist() {
        return this.artist;       
    }
    
    /**
     * get year
     * @return year
     */
    public int getYear() {
        return this.year;
    }
    
    /**
     * get genre
     * @return genre
     */
    public String getGenre() {
        return this.genre;
    }
    
    
}
