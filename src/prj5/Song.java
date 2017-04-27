package prj5;

/**
 * This class represent a song in the survey. It has title, artist name, data,
 * and genre. It also has hobbyCount, majorCount and regionCount, which were
 * filled while reading files.
 * 
 * @author Group 48
 * @version 04.20.2017
 *
 */
public class Song {
    // ~ Fields
    private String songTitle;
    private String artistName;
    private String date;
    private String genre;
    private HobbyPercent hobbyPerc;
    private MajorPercent majorPerc;
    private RegionPercent regionPerc;

    // ~ Constructor
    /**
     * Creates a new song with the artist title, the song name,
     * the song year, and the genre or "type"
     * 
     * @param songTitle
     *            is the tile of the song
     * @param artistName
     *            is the song's artist name
     * @param date
     *            is the date when that song was released
     * @param genre
     *            is the genre of the song
     */
    public Song(String title, String name, String year, String type) 
    {
        songTitle = title;
        artistName = name;
        date = year;
        genre = type;
        hobbyPerc = new HobbyPercent();
        majorPerc = new MajorPercent();
        regionPerc = new RegionPercent();
    }

    /**
     * get the artist name of the song
     * 
     * @return the artist name
     */
    public String getArtistName() 
    {
        return artistName;
    }

    /**
     * get the song title
     * 
     * @return the song title
     */
    public String getSongTitle() 
    {
        return songTitle;
    }

    /**
     * get the genre
     * 
     * @return the genre
     */
    public String getGenre() 
    {
        return genre;
    }

    /**
     * get the release date
     * 
     * @return the release date
     */
    public String getDate() 
    {
        return date;
    }

    /**
     * Increment the hobbyCount, majorCount and regionCount. This method is
     * called when the reader read a pair of answers from a student about a
     * song.
     * 
     * @param hobby
     *            is the hobby the student has
     * @param major
     *            is the major the student has
     * @param region
     *            is the region the student from
     * @param answerHeard
     *            is whether the student has heard this song or not
     * @param answerLike
     *            is whether the student likes this song or not
     */
    public void increment(String hobby, String major, String region,
            String answerHeard, String answerLike) {
        this.hobbyPerc.increment(hobby, answerHeard, answerLike);
        this.majorPerc.increment(major, answerHeard, answerLike);
        this.regionPerc.increment(region, answerHeard, answerLike);
    }

    /**
     * getHobbyPercent()
     * 
     * @return the results count by hobby of this song
     */
    public HobbyPercent getHobbyPercent() {
        return this.hobbyPerc;
    }

    /**
     * getMajorPercent()
     * 
     * @return the results count by major of this song
     */
    public MajorPercent getMajorPercent() {
        return this.majorPerc;
    }

    /**
     * getRegionPercent()
     * 
     * @return the results count by region of this song
     */
    public RegionPercent getRegionPercent() {
        return this.regionPerc;
    }

    /**
     * returns the song's representation as a string
     * 
     * @return the song's information in String
     */
    @Override
    public String toString() 
    {
        return "Song Title: " + this.songTitle + "\nSong Artist: "
                + this.artistName + "\nSong Genre: " + this.genre
                + "\nSong Year: " + this.date + "\n";
    }
}