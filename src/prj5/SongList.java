package prj5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This class represents a list that store all songs in that survey. This class
 * implement LList class but it has a generic of Song. This class expands the
 * LList class with toArray() and InsertionSort() methods.
 * 
 * @author Group 48
 * @version 04.26.2017
 *
 */
public class SongList extends LinkedList<Song> implements Iterable<Song> 
{

    /**
     * perform insertion sort on the current list base on mode chose
     * 
     * @param sortMode
     *            is the way to sort song (sortByTitle, sortByArtist,
     *            sortByDate, sortByGenre)
     * 
     */
    public void insertionSort(String sortMode) 
    {      
        if (sortMode.equals("sortByTitle")) 
        {
            for (int i = 1; i < size(); i++) 
            {
                for (int j = i; (j > 0)
                        && (this.getAt(j).getSongTitle().compareTo(this
                                .getAt(j - 1).getSongTitle()) < 0); j--) 
                {
                    swap(j - 1, j);
                }
            }
        } 
        else if (sortMode.equals("sortByArtist")) 
        {
            for (int i = 1; i < size(); i++) 
            {
                for (int j = i; (j > 0)
                        && (this.getAt(j).getArtistName().compareTo(this
                                .getAt(j - 1).getArtistName()) < 0); j--) 
                {
                    swap(j - 1, j);
                }
            }
        }
        else if (sortMode.equals("sortByDate")) 
        {
            for (int i = 1; i < size(); i++) 
            {
                for (int j = i; (j > 0) && (this.getAt(j).getDate()
                        .compareTo(this.getAt(j - 1).getDate()) < 0); j--) 
                {
                    swap(j - 1, j);
                }
            }
        }
        else if (sortMode.equals("sortByGenre")) 
        {
            for (int i = 1; i < size(); i++) 
            {
                for (int j = i; (j > 0)
                        && (this.getAt(j).getGenre().compareTo(
                                this.getAt(j - 1).getGenre()) < 0); j--) 
                {
                    swap(j - 1, j);
                }
            }
        }
    }

    /**
     * swap 2 entries in list
     * 
     * @param i
     *            index of first entry
     * @param j
     *            index of second entry
     */
    private void swap(int i, int j) 
    {
        Song songI = this.getAt(i);
        Song songJ = this.getAt(j);
        this.remove(songI);
        this.remove(songJ);
        this.add(i, songJ);
        this.add(j, songI);
    }

    /**
     * get an iterator
     * 
     * @return a LListIterator
     */
    @Override
    public Iterator<Song> iterator() 
    {
        return new SongListIterator<Song>();
    }

    /**
     * SongListIterator
     * 
     * @author Pierce Spahn (piercesp)
     * @version 04.26.2017
     * @param <Song>
     *            generic
     */
    @SuppressWarnings("hiding")
    public class SongListIterator<Song> implements Iterator<Song> 
    {
        // ~ Fields
        private int index;

        // ~ Constructor
        /**
         * new a SongListIterator
         */
        public SongListIterator() 
        {
            index = 0;
        }

        // ~ Methods
        /**
         * check whether the list has a next
         * 
         * @return true if it has a next
         */
        @Override
        public boolean hasNext() 
        {
            return index < size();
        }

        /**
         * get the next entry
         * 
         * @return the next song
         * @throws NoSuchElementException
         *             when iterator is after the end of list
         */
        @Override
        public Song next() 
        {
            if (this.hasNext()) 
            {
                @SuppressWarnings("unchecked")
                Song nextEntry = (Song) getAt(index++);
                return nextEntry;
            }
            else 
            {
                throw new NoSuchElementException("Illegal call to next(); "
                        + "iterator is after end of list.");
            }
        }
    }
}