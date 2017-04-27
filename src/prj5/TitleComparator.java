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
public class TitleComparator implements Comparator<Song> {
<<<<<<< HEAD

    /**
     * override CompareTo
     * 
     * @param x
     *            song 1
     * @param y
     *            song 2
=======
    /**
     * Constructor for testing
     */
    public TitleComparator()
    {
        // DO NOTHING 
    }
    /**
     * override CompareTo
     * @param x song 1
     * @param y song 2
>>>>>>> origin/master
     */
    @Override
    public int compare(Song x, Song y) {
        return x.getName().compareTo(y.getName());
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> origin/master
