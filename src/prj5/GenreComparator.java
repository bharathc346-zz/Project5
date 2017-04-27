package prj5;

<<<<<<< HEAD
import java.util.Comparator;

=======

import java.util.Comparator;


>>>>>>> origin/master
/**
 * 
 * @author bharathchintagunta
 * @version 04.19.17
 */
public class GenreComparator implements Comparator<Song> {
<<<<<<< HEAD

    /**
     * override CompmareTo
     * 
     * @param x
     *            song 1
     * @param y
     *            song 2
=======
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
>>>>>>> origin/master
     */
    @Override
    public int compare(Song x, Song y) {
        return x.getGenre().compareTo(y.getGenre());
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> origin/master
