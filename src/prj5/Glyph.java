package prj5;

import java.util.LinkedList;

/**
 * TODO
 * @author 
 *
 */
public class Glyph {
    private Song song;
    private int[] likes;
    private int[] heard;
    private LinkedList<Student> students;
    private Category category;
    
    public Glyph(Song song)
    {
        this.song = song;
    }
    
    public Song getSong()
    {
        return song;
    }
    
    public void setCategory(Category cat)
    {
        category = cat;
    }
    
    public void display()
    {
        
    }
    
    public void setPercentage()
    {
        
    }
}
