package prj5;

import java.util.Comparator;

/**
 * 
 * @author bharathchintagunta
 * @version 04.23.17
 */
public class YearComparator implements Comparator<Song> {
    

    /**
     * override CompareTo
     * 
     * @param x
     *            song 1
     * @param y
     *            song 2
     */
    public int compare(Song x, Song y) {   
        //Convert to type integer
        Integer a = new Integer(x.getYear());
        Integer b = new Integer(y.getYear());
        
        return a.compareTo(b);
    }

}
