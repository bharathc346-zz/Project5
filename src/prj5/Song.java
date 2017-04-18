package prj5;
/**
 * Basic class for all songs
 * @author group48
 *
 */
public class Song {
    private String name;
    private String artist;
    private int year;
    private String genre;
    private int songNumber;
    /**
     * Constructor for song object
     * @param name of song 
     * @param artist of who made the song
     * @param year song was made
     * @param genre type of song
     * @param number in list
     */
    public Song(String name, String artist, int year, String genre, int number)
    {
        this.name = name;
        this.artist = artist;
        this.year = year;
        this.genre = genre;
        songNumber = number;
    }
    /**
     * Return name of the song
     * @return name of song
     */
    public String getName()
    {
        return name;
    }
    /**
     * Return artist of the song
     * @return artist of song
     */
    public String getArtist()
    {
        return artist;
    }
    /**
     * return the year song was made
     * @return year song was made
     */
    public int getYear()
    {
        return year;
    }
    /**
     * Return the genre of the song
     * @return genre of the song
     */
    public String getGenre()
    {
        return genre;
    }
    /**
     * Return song number
     * @return songNumber of the song
     */
    public int getSongNumber()
    {
        return songNumber;
    }
    
    public int compareTo(Song song)
    {
        return 0;
    }
}
