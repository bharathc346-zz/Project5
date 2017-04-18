/**
 * package for project 5
 */
package prj5;

import CS2114.Button;
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
    
    /**
     * Creates a new program window with user buttons
     */
    public DisplayWindow()
    {
        window = new Window("Project 5");
        
        setUpButtons();
    }
    
    /**
     * helper method to create and place all the buttons
     */
    private void setUpButtons()
    {
        prev = new Button("<-- Prev");
        window.addButton(prev, WindowSide.NORTH);
        prev.onClick(this, "clickedPrev");
        
        sortArtist = new Button("Sort by Artist");
        window.addButton(sortArtist, WindowSide.NORTH);
        sortArtist.onClick(this, "clickedSortArtist");
        
        sortTitle = new Button("Sort by Title");
        window.addButton(sortTitle, WindowSide.NORTH);
        sortTitle.onClick(this, "clickedSortTitle");
        
        sortYear = new Button("Sort by Year");
        window.addButton(sortYear, WindowSide.NORTH);
        sortYear.onClick(this, "clickedSortYear");
        
        sortGenre = new Button("Sort by Genre");
        window.addButton(sortGenre, WindowSide.NORTH);
        sortGenre.onClick(this, "clickedSortGenre");
        
        next = new Button("Next -->");
        window.addButton(next, WindowSide.NORTH);
        next.onClick(this, "clickedNext");
        
        hobby = new Button("Hobby");
        window.addButton(hobby, WindowSide.SOUTH);
        hobby.onClick(this, "clickedNext");
        
        major = new Button("Major");
        window.addButton(major, WindowSide.SOUTH);
        major.onClick(this, "clickedMajor");
        
        region = new Button("Region");
        window.addButton(region, WindowSide.NORTH);
        region.onClick(this, "clickedRegion");
        
        quit = new Button("Quit");
        window.addButton(quit, WindowSide.SOUTH);
        quit.onClick(this, "clickedQuit");
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
