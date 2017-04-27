/**
 * package for project 5
 */
package prj5;

import java.awt.Color;
import CS2114.Button;
import CS2114.Shape;
import CS2114.TextShape;
import CS2114.Window;
import CS2114.WindowSide;

/**
 * Class to set up the window and place all the
 * graphical elements on the screen
 * @author Collin Smith (smithcol)
 * @version 04.18.2017
 */
public class DisplayWindow 
{
    private Window window;
    
    //buttons for the user to interact with the program
    private Button sortArtist;
    private Button sortTitle;
    private Button sortYear;
    private Button sortGenre;
    private Button next;
    private Button prev;
    private Button hobby;
    private Button major;
    private Button region;
    private Button quit;
    
    //fields for the legend graphics
    private Shape legend;
    private TextShape lheader;
    private TextShape line1;
    private TextShape line2;
    private TextShape line3;
    private TextShape line4;
    private Shape lbar;
    private TextShape lbartext;
    
    //fields for an example glyph until further
    //functions have been implemented
    private TextShape glyphheader;
    private Shape centerbar;
    private Shape bar1;
    private Shape bar2;
    private Shape bar3;
    private Shape bar4;
    
    /**
     * Creates a new program window with user buttons
     */
    public DisplayWindow()
    {
        window = new Window("Project 5");
        window.setSize(1350, 700);
        
        setUpButtons();
        
        setUpLegend();
        
<<<<<<< HEAD
        new Glyph(400, 400, window);
        
        //setUpExampleGlyph();
=======
        setUpExampleGlyph();
>>>>>>> origin/master
    }
    
    /**
     * helper method to create and place all the buttons
     */
    private void setUpButtons()
    {
        //button to move to the previous set of glyphs
        prev = new Button("<-- Prev");
        window.addButton(prev, WindowSide.NORTH);
        prev.onClick(this, "clickedPrev");
        
        //button to sort the glyphs by artist
        sortArtist = new Button("Sort by Artist");
        window.addButton(sortArtist, WindowSide.NORTH);
        sortArtist.onClick(this, "clickedSortArtist");
        
        //button to sort the glyphs by title
        sortTitle = new Button("Sort by Title");
        window.addButton(sortTitle, WindowSide.NORTH);
        sortTitle.onClick(this, "clickedSortTitle");
        
        //button to sort the glyphs by year
        sortYear = new Button("Sort by Year");
        window.addButton(sortYear, WindowSide.NORTH);
        sortYear.onClick(this, "clickedSortYear");
        
        //button to sort the glyphs by genre
        sortGenre = new Button("Sort by Genre");
        window.addButton(sortGenre, WindowSide.NORTH);
        sortGenre.onClick(this, "clickedSortGenre");
        
        //button to show the next set of glyphs
        next = new Button("Next -->");
        window.addButton(next, WindowSide.NORTH);
        next.onClick(this, "clickedNext");
        
        //button to show the glyphs based on hobbies
        hobby = new Button("Hobby");
        window.addButton(hobby, WindowSide.SOUTH);
        hobby.onClick(this, "clickedNext");
        
        //button to show the glyphs based on major
        major = new Button("Major");
        window.addButton(major, WindowSide.SOUTH);
        major.onClick(this, "clickedMajor");
        
        //button to show the glyphs based on region
        region = new Button("Region");
        window.addButton(region, WindowSide.SOUTH);
        region.onClick(this, "clickedRegion");
        
        //button to quit out of the program
        quit = new Button("Quit");
        window.addButton(quit, WindowSide.SOUTH);
        quit.onClick(this, "clickedQuit");
    }
    
    /**
     * helper method to create and place all the legend graphic items
     */
    private void setUpLegend()
    {
        //creates the border for the legend
        legend = new Shape(window.getGraphPanelWidth()-160, 
                window.getGraphPanelHeight()-210, 150, 200);
        legend.setForegroundColor(Color.BLACK);
        legend.setBackgroundColor(Color.WHITE);
        window.addShape(legend);
        
        //creates the legend header
        lheader = new TextShape(window.getGraphPanelWidth() - 115, 
                window.getGraphPanelHeight() - 190, "Legend", Color.BLACK);
        window.addShape(lheader);
        window.moveToFront(lheader);
        lheader.setBackgroundColor(Color.WHITE);
        
        //creates the first line in the legend
        line1 = new TextShape(window.getGraphPanelWidth() - 120, 
                window.getGraphPanelHeight() - 160, "Area 1", Color.MAGENTA);
        window.addShape(line1);
        window.moveToFront(line1);
        line1.setBackgroundColor(Color.WHITE);
        
        //creates the second line in the legend
        line2 = new TextShape(window.getGraphPanelWidth() - 120, 
                window.getGraphPanelHeight() - 140, "Area 2", Color.BLUE);
        window.addShape(line2);
        window.moveToFront(line2);
        line2.setBackgroundColor(Color.WHITE);
        
        //creates the third line in the legend
        line3 = new TextShape(window.getGraphPanelWidth() - 120, 
                window.getGraphPanelHeight() - 120, "Area 3", Color.ORANGE);
        window.addShape(line3);
        window.moveToFront(line3);
        line3.setBackgroundColor(Color.WHITE);
        
        //creates the fourth line in the legend
        line4 = new TextShape(window.getGraphPanelWidth() - 120, 
                window.getGraphPanelHeight() - 100, "Area 4", Color.GREEN);
        window.addShape(line4);
        window.moveToFront(line4);
        line4.setBackgroundColor(Color.WHITE);
        
        //creates the bar to mimic the glyph bar
        lbar = new Shape(window.getGraphPanelWidth() - 95,
                window.getGraphPanelHeight() - 80, 8, 50);
        window.addShape(lbar);
        lbar.setBackgroundColor(Color.BLACK);
        lbar.setForegroundColor(Color.WHITE);
        
        //creates the text on either side of the bar to signal which side
        //represents what
        lbartext = new TextShape(lbar.getX() - 50, lbar.getY() + 17,
                "Heard      Likes", Color.BLACK);
        window.addShape(lbartext);
        window.moveToFront(lbartext);
        window.moveToFront(lbar); //moves the bar in front of the text
        lbartext.setBackgroundColor(Color.WHITE);
    }
    
    /**
     * sets up an example glyph
     */
    private void setUpExampleGlyph()
    {
        glyphheader = new TextShape(120, 80, "Example Glyph", Color.BLACK);
        window.addShape(glyphheader);
        glyphheader.setBackgroundColor(Color.WHITE);
        
        bar1 = new Shape(100, 100, 100, 20, Color.MAGENTA);
        window.addShape(bar1);
        
        bar2 = new Shape(120, 120, 130, 20, Color.BLUE);
        window.addShape(bar2);
        
        bar3 = new Shape(100, 140, 140, 20, Color.ORANGE);
        window.addShape(bar3);
        
        bar4 = new Shape(110, 160, 160, 20, Color.GREEN);
        window.addShape(bar4);
        
        centerbar = new Shape(170, 100, 10, 80, Color.BLACK);
        window.addShape(centerbar);
        window.moveToFront(centerbar);
    }
    
    /**
     * stub to update the graphics based on the artist
     * @param button - the sortArtist button
     */
    public void clickedSortArtist(Button button)
    {
        
    }
    
    /**
     * stub to update the graphics based on the title
     * @param button - the sortTitle button
     */
    public void clickedSortTitle(Button button)
    {
        
    }
    
    /**
     * stub to update the graphics based on the year
     * @param button - the sortYear button
     */
    public void clickedSortYear(Button button)
    {
        
    }
    
    /**
     * stub to update the graphics based on the genre
     * @param button - the sortGenre button
     */
    public void clickedSortGenre(Button button)
    {
        
    }
    
    /**
     * stub to display the next set of glyphs
     * @param button - the next button
     */
    public void clickedNext(Button button)
    {
        
    }
    
    /**
     * stub to display the previous set of glyphs
     * @param button - the prev button
     */
    public void clickedPrev(Button button)
    {
        
    }
    
    /**
     * stub to update the graphics based on hobbies
     * @param button - the hobby button
     */
    public void clickedHobby(Button button)
    {
        
    }
    
    /**
     * stub to update the graphics based on majors
     * @param button - the major button
     */
    public void clickedMajor(Button button)
    {
        
    }
    
    /**
     * stub to update the graphics based on student region
     * @param button - the region button
     */
    public void clickedRegion(Button button)
    {
        
    }
    
    /**
     * quits the current program when the quit button is clicked
     * @param button - the quit button passed
     */
    public void clickedQuit(Button button)
    {
        System.exit(0);
    }
}
