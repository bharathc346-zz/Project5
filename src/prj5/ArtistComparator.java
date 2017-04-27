package prj5;

import java.util.Comparator;

/**
 * 
 * @author bharathchintagunta
 * @version 04.23.17
 */
public class ArtistComparator implements Comparator<Song> {
    

    /**
     * override CompareTo
     * 
     * @param x
     *            song 1
     * @param y
     *            song 2
     */
    public int compare(Song x, Song y) {
        return x.getArtist().compareTo(y.getArtist());
    }
}
