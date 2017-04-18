package prj5;

import java.util.LinkedList;

/**
 * Sort the data by different archtypes
 * @author Group48
 *
 */
public class DataSorter {
    private LinkedList<Glyph> glyphs;
    
    public void sortByArtist()
    {
        
    }
    
    public void sortByTitle()
    {
        
    }
    
    public void sortByYear()
    {
        
    }
    
    public void sortByGenre()
    {
        
    }
    
    public LinkedList<Glyph> getList()
    {
        return glyphs;
    }
    
    public DataSorterIterator iterator()
    {
        return new DataSorterIterator();
    }
    
    class DataSorterIterator
    {
        private int index;
        
        public DataSorterIterator()
        {
            index = 0;
        }
        
        public boolean hasNext()
        {
            return false;
        }
        
        public Glyph next()
        {
            return null;
        }
    }
}
