package prj5;

import java.awt.Color;
import java.util.LinkedList;
import CS2114.Shape;
import CS2114.TextShape;
import CS2114.Window;

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
    
    //graphic fields for the glyph
    private TextShape songTitle;
    private TextShape bottom;
    private Shape separator;
    private Shape heardPurple;
    private Shape heardBlue;
    private Shape heardOrange;
    private Shape heardGreen;
    private Shape likedPurple;
    private Shape likedBlue;
    private Shape likedOrange;
    private Shape likedGreen;
    private int heardPurpleLength = 10;
    private int heardBlueLength = 20;
    private int heardOrangeLength = 30;
    private int heardGreenLength = 40;
    private int likedPurpleLength = 10;
    private int likedBlueLength = 20;
    private int likedOrangeLength = 30;
    private int likedGreenLength = 40;
    private int xCoord;
    private int yCoord;
    
    public Glyph(int xVal, int yVal, Window window)
    {
        //this.song = song;
        
        xCoord = xVal;
        yCoord = yVal;
        int sepWidth = 10;
        int barHeight = 10;
        
        separator = new Shape(xCoord, yCoord - 50, sepWidth, 40, Color.BLACK);
        window.addShape(separator);
        
        heardPurple = new Shape(xCoord - heardPurpleLength, yCoord - 50,
            heardPurpleLength, barHeight, Color.MAGENTA);
        window.addShape(heardPurple);
        
        heardBlue = new Shape(xCoord - heardBlueLength, yCoord - 40,
            heardBlueLength, barHeight, Color.BLUE);
        window.addShape(heardBlue);
        
        heardOrange = new Shape(xCoord - heardOrangeLength, yCoord - 30,
            heardOrangeLength, barHeight, Color.ORANGE);
        window.addShape(heardOrange);
        
        heardGreen = new Shape(xCoord - heardGreenLength, yCoord - 20,
            heardGreenLength, barHeight, Color.GREEN);
        window.addShape(heardGreen);
        
        likedPurple = new Shape(xCoord + sepWidth, yCoord - 50,
            likedPurpleLength, barHeight, Color.MAGENTA);
        window.addShape(likedPurple);
        
        likedBlue = new Shape(xCoord + sepWidth, yCoord - 40,
            likedBlueLength, barHeight, Color.BLUE);
        window.addShape(likedBlue);
        
        likedOrange = new Shape(xCoord + sepWidth, yCoord - 30,
            likedOrangeLength, barHeight, Color.ORANGE);
        window.addShape(likedOrange);
        
        likedGreen = new Shape(xCoord + sepWidth, yCoord - 20,
            likedGreenLength, barHeight, Color.GREEN);
        window.addShape(likedGreen);
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
