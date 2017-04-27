package prj5;

import java.util.LinkedList;

/**
 * Sort the data by different archtypes
 * 
 * @author Group48
 *
 */
public class DataSorter {
    private LinkedList<Glyph> glyphs;


    /**
     * insertion sort to sort by artist
     * 
     * @param songs
     *            list to be sorted
     */
    public void sortByArtist(LinkedList<Song> songs) {
        ArtistComparator ac = new ArtistComparator();
        for (int i = 0; i != songs.size(); i++) {
            Song itemToInsert = songs.get(i);
            int j = i;
            while (j != 0 && ((ac.compare(songs.get(j - 1),
                itemToInsert) > 0))) {
                songs.set(j, songs.get(j - 1));
                j = j - 1;
            }
            songs.set(j, itemToInsert);
        }
    }


    /**
     * insertion sort to sort by title
     * 
     * @param songs
     *            list to be sorted
     */
    public void sortByTitle(LinkedList<Song> songs) {
        TitleComparator tc = new TitleComparator();
        for (int i = 0; i != songs.size(); i++) {
            Song itemToInsert = songs.get(i);
            int j = i;
            while (j != 0 && ((tc.compare(songs.get(j - 1),
                itemToInsert) > 0))) {
                songs.set(j, songs.get(j - 1));
                j = j - 1;
            }
            songs.set(j, itemToInsert);
        }
    }


    /**
     * insertion sort to sort by year
     * 
     * @param songs
     *            list to be sorted
     */
    public void sortByYear(LinkedList<Song> songs) {
        YearComparator yc = new YearComparator();
        for (int i = 0; i != songs.size(); i++) {
            Song itemToInsert = songs.get(i);
            int j = i;
            while (j != 0 && ((yc.compare(songs.get(j - 1),
                itemToInsert) > 0))) {
                songs.set(j, songs.get(j - 1));
                j = j - 1;
            }
            songs.set(j, itemToInsert);
        }
    }


    /**
     * insertion sort to sort by genre
     * 
     * @param songs
     *            list to be sorted
     */
    public void sortByGenre(LinkedList<Song> songs) {
        GenreComparator gc = new GenreComparator();
        for (int i = 0; i != songs.size(); i++) {
            Song itemToInsert = songs.get(i);
            int j = i;
            while (j != 0 && ((gc.compare(songs.get(j - 1),
                itemToInsert) > 0))) {
                songs.set(j, songs.get(j - 1));
                j = j - 1;
            }
            songs.set(j, itemToInsert);
        }
    }


    public LinkedList<Glyph> getList() {
        return glyphs;
    }


    public DataSorterIterator iterator() {
        return new DataSorterIterator();
    }


    class DataSorterIterator {
        private int index;


        public DataSorterIterator() {
            index = 0;
        }


        public boolean hasNext() {
            return false;
        }


        public Glyph next() {
            return null;
        }
    }
}
