/**
 * 
 */
package prj5;

/**
 * @author bharathchintagunta
<<<<<<< HEAD
 * @version 2017-04-20
 */
public class Song {

=======
 * @verison 04.19.17
 */
public class Song {
>>>>>>> origin/master
    private String name;
    private String artist;
    private int year;
    private String genre;
<<<<<<< HEAD

    private int sportsHeardPercent;
    private int sportsLikedPercent;
    private int readingHeardPercent;
    private int readingLikedPercent;
    private int artHeardPercent;
    private int artLikedPercent;
    private int musicHeardPercent;
    private int musicLikedPercent;

    private int computerScienceHeardPercent;
    private int computerScienceLikedPercent;
    private int otherEngineeringHeardPercent;
    private int otherEngineeringLikedPercent;
    private int mathOrCMDAHeardPercent;
    private int mathOrCMDALikedPercent;
    private int otherHeardPercent;
    private int otherLikedPercent;

    private int seHeardPercent;
    private int seLikedPercent;
    private int neHeardPercent;
    private int neLikedPercent;
    private int inlHeardPercent;
    private int inlLikedPercent;
    private int usHeardPercent;
    private int usLikedPercent;


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
=======
    
    /**
     * Song Constructor
     * @param n name
     * @param a artist
     * @param y year
     * @param g genre
>>>>>>> origin/master
     */
    public Song(String n, String a, int y, String g) {
        this.name = n;
        this.artist = a;
        this.year = y;
        this.genre = g;
    }
<<<<<<< HEAD


    /**
     * getName of song
     * 
=======
    
    /**
     * getName of song
>>>>>>> origin/master
     * @return song name
     */
    public String getName() {
        return this.name;
    }
<<<<<<< HEAD


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
=======
    
    /**
     * get Artist
     * @return artist
     */
    public String getArtist() {
        return this.artist;       
    }
    
    /**
     * get year
>>>>>>> origin/master
     * @return year
     */
    public int getYear() {
        return this.year;
    }
<<<<<<< HEAD


    /**
     * get genre
     * 
=======
    
    /**
     * get genre
>>>>>>> origin/master
     * @return genre
     */
    public String getGenre() {
        return this.genre;
    }
<<<<<<< HEAD


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


    /**
     * get cs heard percent
     * 
     * @return computer science heard percent
     */
    public int getComputerScienceHeardPercent() {
        return computerScienceHeardPercent;
    }


    /**
     * set cs heardpercent
     * 
     * @param computerScienceHeardPercent
     *            csheardpercent
     */
    public void setComputerScienceHeardPercent(
        int computerScienceHeardPercent) {
        this.computerScienceHeardPercent = computerScienceHeardPercent;
    }


    /**
     * get percent who liked cs
     * 
     * @return percent liked cs
     */
    public int getComputerScienceLikedPercent() {
        return computerScienceLikedPercent;
    }


    /**
     * set cs liked percent
     * 
     * @param computerScienceLikedPercent
     *            percent
     */
    public void setComputerScienceLikedPercent(
        int computerScienceLikedPercent) {
        this.computerScienceLikedPercent = computerScienceLikedPercent;
    }


    /**
     * get other eng heard percent
     * 
     * @return other eng heard percent
     */
    public int getOtherEngineeringHeardPercent() {
        return otherEngineeringHeardPercent;
    }


    /**
     * set other engineering heardpercent
     * 
     * @param other
     *            eng HeardPercent percents
     */
    public void setOtherEngineeringHeardPercent(
        int otherEngineeringHeardPercent) {
        this.otherEngineeringHeardPercent = otherEngineeringHeardPercent;
    }


    /**
     * get percent who liked other engineering
     * 
     * @return percent liked other eng
     */
    public int getOtherEngineeringLikedPercent() {
        return otherEngineeringLikedPercent;
    }


    /**
     * set other engineering liked percent
     * 
     * @param otherengineeringLikedPercent
     *            percent
     */
    public void setOtherEngineeringLikedPercent(
        int otherEngineeringLikedPercent) {
        this.otherEngineeringLikedPercent = otherEngineeringLikedPercent;
    }


    /**
     * get math heard percent
     * 
     * @return percent
     */
    public int getMathOrCMDAHeardPercent() {
        return mathOrCMDAHeardPercent;
    }


    /**
     * set math percent heard
     * 
     * @param mathOrCMDAHeardPercent
     *            percent
     */
    public void setMathOrCMDAHeardPercent(int mathOrCMDAHeardPercent) {
        this.mathOrCMDAHeardPercent = mathOrCMDAHeardPercent;
    }


    /**
     * get math percent liked
     * 
     * @return math percent liked
     */
    public int getMathOrCMDALikedPercent() {
        return mathOrCMDALikedPercent;
    }


    /**
     * set math liked perdcent
     * 
     * @param mathOrCMDALikedPercent
     *            percent
     */
    public void setMathOrCMDALikedPercent(int mathOrCMDALikedPercent) {
        this.mathOrCMDALikedPercent = mathOrCMDALikedPercent;
    }


    /**
     * get other heard percent
     * 
     * @return percent
     */
    public int getOtherHeardPercent() {
        return otherHeardPercent;
    }


    /**
     * set Other heard percent
     * 
     * @param otherHeardPercent
     *            heard percent
     */
    public void setOtherHeardPercent(int otherHeardPercent) {
        this.otherHeardPercent = otherHeardPercent;
    }


    /**
     * get other liked percent
     * 
     * @return percent
     */
    public int getOtherLikedPercent() {
        return otherLikedPercent;
    }


    /**
     * set other liked percent
     * 
     * @param otherLikedPercent
     *            percent
     */
    public void setOtherLikedPercent(int otherLikedPercent) {
        this.otherLikedPercent = otherLikedPercent;
    }


    /**
     * SE percent heard
     * 
     * @return percent
     */
    public int getSeHeardPercent() {
        return seHeardPercent;
    }


    /**
     * set SE percent heard
     * 
     * @param seHeardPercent
     *            percent
     */
    public void setSeHeardPercent(int seHeardPercent) {
        this.seHeardPercent = seHeardPercent;
    }


    /**
     * get SE likedPercent
     * 
     * @return percent
     */
    public int getSeLikedPercent() {
        return seLikedPercent;
    }


    /**
     * get percent liked
     * 
     * @param seLikedPercent
     *            p
     */
    public void setSeLikedPercent(int seLikedPercent) {
        this.seLikedPercent = seLikedPercent;
    }


    /**
     * get percent heard
     * 
     * @return p
     */
    public int getNeHeardPercent() {
        return neHeardPercent;
    }


    /**
     * set percent heard
     * 
     * @param neHeardPercent
     *            p
     */
    public void setNeHeardPercent(int neHeardPercent) {
        this.neHeardPercent = neHeardPercent;
    }


    /**
     * get percent liked
     * 
     * @return p
     */
    public int getNeLikedPercent() {
        return neLikedPercent;
    }


    /**
     * set percent liked
     * 
     * @param neLikedPercent
     *            p
     */
    public void setNeLikedPercent(int neLikedPercent) {
        this.neLikedPercent = neLikedPercent;
    }


    /**
     * get percent heard
     * 
     * @return p
     */
    public int getInlHeardPercent() {
        return inlHeardPercent;
    }


    /**
     * set percent heard
     * 
     * @param inlHeardPercent
     *            p
     */
    public void setInlHeardPercent(int inlHeardPercent) {
        this.inlHeardPercent = inlHeardPercent;
    }


    /**
     * get percent liked
     * 
     * @return p
     */
    public int getInlLikedPercent() {
        return inlLikedPercent;
    }


    /**
     * set percent liked
     * 
     * @param inlLikedPercent
     *            p
     */
    public void setInlLikedPercent(int inlLikedPercent) {
        this.inlLikedPercent = inlLikedPercent;
    }


    /**
     * get percent heard
     * 
     * @return p
     */
    public int getUsHeardPercent() {
        return usHeardPercent;
    }


    /**
     * set percent heard
     * 
     * @param usHeardPercent
     *            p
     */
    public void setUsHeardPercent(int usHeardPercent) {
        this.usHeardPercent = usHeardPercent;
    }


    /**
     * get percent liked
     * 
     * @return p
     */
    public int getUsLikedPercent() {
        return usLikedPercent;
    }


    /**
     * set percent liked
     * 
     * @param usLikedPercent
     *            p
     */
    public void setUsLikedPercent(int usLikedPercent) {
        this.usLikedPercent = usLikedPercent;
    }
=======
    
    
>>>>>>> origin/master
}
