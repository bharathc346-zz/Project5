package prj5;


import java.util.Comparator;


/**
 * 
 * @author bharathchintagunta
 * @version 04.19.17
 */
public class GenreComparator implements Comparator<Song> {
    /**
     * Constructor for testing
     */
    public GenreComparator()
    {
        // Do nothing
    }
    /**
     * override CompmareTo
     * @param x song 1
     * @param y song 2
     */
    @Override
    public int compare(Song x, Song y) {
        return x.getGenre().compareTo(y.getGenre());
    }

}