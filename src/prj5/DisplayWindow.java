package prj5;

import java.awt.Color;

import CS2114.Button;
import CS2114.TextShape;
import CS2114.Window;
import CS2114.WindowSide;

/**
 * The Window to display the glyphs and have buttons
 * for the user to display the data based on different
 * specifications
 * 
 * @author Collin Smith (smithcol)
 * @version 04.18.2017
 */
public class DisplayWindow 
{
    private Window window;
    private SongList songList;
    private SongGUI[] songPanels;
    private LegendGUI[] legend;
    private int panelHeight;
    private int panelWidth;
    
    //fields for the buttons
    private Button prev;
    private Button next;
    private Button sortByArtistName;
    private Button sortBySongTitle;
    private Button sortByGenre;
    private Button sortByDate;
    private Button hobby;
    private Button major;
    private Button region;
    private Button quit;
    
    //fields to switch between display slides
    private int slides;
    private int currentSlide;
    private int legendType;
    
    /**
     * Creates a new DisplayWindow to show the glyphs and
     * has buttons for the user to switch the graphic
     * representation
     * 
     * @param songList
     *            is the song list to visualize
     */
    public DisplayWindow(SongList sList) 
    {
        window = new Window("Project 5");
        songList = sList;
        // store songs in one slide
        songPanels = new SongGUI[9];
        
        // define the size of one single song panel
        panelHeight = window.getGraphPanelHeight() / 5;
        panelWidth = window.getGraphPanelWidth() / 4;
        
        // slide number
        currentSlide = 1;
        slides = songList.size() % 9 == 0 ? songList.size() / 9
                : (songList.size() / 9) + 1;
        
        // sets up the buttons
        setUpButtons();
        
        // sets up the legend
        setUpLegend();
        
        // welcome text
        TextShape welcomeText = new TextShape(0, 0, "Click a sort button to get started");
        welcomeText.setBackgroundColor(Color.WHITE);
        welcomeText.setX(
                (window.getGraphPanelWidth() - welcomeText.getWidth()) / 2);
        welcomeText.setY(
                (window.getGraphPanelHeight() - welcomeText.getHeight()) / 2);
        window.addShape(welcomeText);
    }

    /**
     * helper method to get the song data for current page
     * 
     * @param currentPage - the current page number
     */
    private void getSlide(int currSlide) 
    {
        for (int i = 0; i < songPanels.length; i++) 
        {
            songPanels[i] = null;
        }
        // get songs for current page
        for (int i = (currSlide - 1) * 9, j = 0; i < songList.size()
                && j < 9; i++, j++) 
        {
            songPanels[j] = new SongGUI(songList.getAt(i), getX(j),
                    getY(j), panelWidth);
        }
    }

    /**
     * helper method to get the X coordinate of a panel
     * 
     * @param index -  is the 0~8 corresponding to the 
     *                  9 songs in a page
     * @return the x coordinate
     */
    private int getX(int index) 
    {
        if (index % 3 == 0) 
        {
            return 30;
        }
        else 
        {
            return (30 + panelWidth) * (index % 3) + 30;
        }
    }

    /**
     * helper method to get the Y coordinate of a panel
     * 
     * @param index - is the 0~8 corresponding to the 
     *                 9 songs in a page
     * @return the y coordinate
     */
    private int getY(int index) 
    {
        if (index / 3 == 0) {
            return 20;
        }
        else 
        {
            return (20 + panelHeight) * (index / 3) + 20;
        }
    }

    /**
     * creates and adds all the buttons
     */
    private void setUpButtons() 
    {
        prev = new Button("Prev");
        prev.onClick(this, "clickedPrev");
        prev.disable();

        next = new Button("Next");
        next.onClick(this, "clickedNext");
        next.disable();

        sortByArtistName = new Button("Sort by Artist Name");
        sortByArtistName.onClick(this, "clickedSortByArtistName");

        sortBySongTitle = new Button("Sort by Song Title");
        sortBySongTitle.onClick(this, "clickedSortBySongTitle");

        sortByGenre = new Button("Sort by Genre");
        sortByGenre.onClick(this, "clickedSortByGenre");

        sortByDate = new Button("Sort by Release Year");
        sortByDate.onClick(this, "clickedSortByDate");

        hobby = new Button("Represent Hobby");
        hobby.onClick(this, "clickedHobby");

        major = new Button("Represent Major");
        major.onClick(this, "clickedMajor");

        region = new Button("Represent Region");
        region.onClick(this, "clickedRegion");

        quit = new Button("Quit");
        quit.onClick(this, "clickedQuit");
        
        // North side buttons
        window.addButton(prev, WindowSide.NORTH);
        window.addButton(sortByArtistName, WindowSide.NORTH);
        window.addButton(sortBySongTitle, WindowSide.NORTH);
        window.addButton(sortByDate, WindowSide.NORTH);
        window.addButton(sortByGenre, WindowSide.NORTH);
        window.addButton(next, WindowSide.NORTH);
        
        // South side buttons
        window.addButton(hobby, WindowSide.SOUTH);
        window.addButton(major, WindowSide.SOUTH);
        window.addButton(region, WindowSide.SOUTH);
        window.addButton(quit, WindowSide.SOUTH);

        updateButtons(false);
    }

    /**
     * helper method to change the status at bottom
     * 
     * @param flag
     *            if it is true, then enable the bottom 
     *            buttons, else, disable them
     */
    private void updateButtons(boolean flag) 
    {
        if (flag) 
        {
            hobby.enable();
            major.enable();
            region.enable();
        }
        else 
        {
            hobby.disable();
            major.disable();
            region.disable();
        }
    }

    /**
     * Initialize the legend
     */
    private void setUpLegend() 
    {
        int x = window.getGraphPanelWidth() * 5 / 6 - 2;
        int y = window.getGraphPanelHeight() / 5;
        legend = new LegendGUI[3];
        legend[0] = new LegendGUI("Hobby", x, y,
                window.getGraphPanelWidth(), window.getGraphPanelHeight());
        legend[1] = new LegendGUI("Major", x, y,
                window.getGraphPanelWidth(), window.getGraphPanelHeight());
        legend[2] = new LegendGUI("Region", x, y,
                window.getGraphPanelWidth(), window.getGraphPanelHeight());
    }

    /**
     * Update legend
     * 
     * @param currentLegend
     *            Current legend
     */
    private void updateLegend(int currentLegend) 
    {
        window.addShape(legend[currentLegend].getSeparator());
        window.addShape(legend[currentLegend].getTitle());
        window.addShape(legend[currentLegend].getSongTitle());
        window.addShape(legend[currentLegend].getHeard());
        window.addShape(legend[currentLegend].getLike());

        for (int i = 0; i < 4; i++) {
            window.addShape(legend[currentLegend].getText()[i]);
        }

        window.addShape(legend[currentLegend].getFrame());
    }

    /**
     * Clicked prev button. If the current page is 1, the button will be set to
     * disable.
     * 
     * @param prev
     *            Button
     */
    public void clickedPrev(Button prev) 
    {
        currentSlide--;
        next.enable();
        updateSlide();
    }

    /**
     * helper method to update the status of previous and next button
     */
    private void updatePrevAndNext() 
    {
        if (currentSlide < slides) 
        {
            next.enable();
        }
        if (currentSlide == 1) 
        {
            prev.disable();
        }
        if (currentSlide == slides) 
        {
            next.disable();
        }
        if (slides == 1) 
        {
            prev.disable();
            next.disable();
        }
    }

    /**
     * Clicked next button. If the current page is the last page, the button
     * will be set to disable.
     * 
     * @param next
     *            Button
     */
    public void clickedNext(Button next) 
    {
        currentSlide++;
        prev.enable();
        updateSlide();
    }

    /**
     * Clicked sort by song title
     * 
     * @param sortByTitle
     *            Button
     */
    public void clickedSortBySongTitle(Button sortByTitle) 
    {
        window.removeAllShapes();
        songList.insertionSort("sortByTitle");
        next.disable();
        prev.disable();
        updateSlide();
        updateButtons(true);
    }

    /**
     * Clicked sort by artist name
     * 
     * @param sortByArtist
     *            Button
     */
    public void clickedSortByArtistName(Button sortByArtist) 
    {
        window.removeAllShapes();
        songList.insertionSort("sortByArtist");
        next.disable();
        prev.disable();
        updateSlide();
        updateButtons(true);
    }

    /**
     * Clicked sort by genre
     * 
     * @param sortByGenre
     *            Button
     */
    public void clickedSortByGenre(Button sortByGenre) 
    {
        window.removeAllShapes();
        songList.insertionSort("sortByGenre");
        next.disable();
        prev.disable();
        updateSlide();
        updateButtons(true);
    }

    /**
     * Clicked sort by date
     * 
     * @param sortByDate
     *            Button
     */
    public void clickedSortByDate(Button sortByDate) 
    {
        window.removeAllShapes();
        songList.insertionSort("sortByDate");
        updateSlide();
        updateButtons(true);
    }

    /**
     * Represent hobby
     * 
     * @param hobby
     *            Button
     */
    public void clickedHobby(Button hobby) 
    {
        legendType = 0;
        currentSlide = 1;
        updateSlide();

    }

    /**
     * Represent major
     * 
     * @param major
     *            Button
     */
    public void clickedMajor(Button major) 
    {
        legendType = 1;
        currentSlide = 1;
        updateSlide();
    }

    /**
     * Represent region
     * 
     * @param region
     *            Button
     */
    public void clickedRegion(Button region) 
    {
        legendType = 2;
        currentSlide = 1;
        updateSlide();
    }

    /**
     * Exits out of the program
     * 
     * @param quit
     *            Button
     */
    public void clickedQuit(Button quit) 
    {
        System.exit(0);
    }

    /**
     * Clear the window and repaint
     */
    private void updateSlide() 
    {
        window.removeAllShapes();
        updateSongPanels();
        updateLegend(legendType);
        updatePrevAndNext();
    }

    /**
     * update song panels
     */
    private void updateSongPanels() 
    {
        getSlide(currentSlide);
        for (int i = 0; i < 9; i++) 
        {
            if (songPanels[i] != null) 
            {
                window.addShape(songPanels[i].songTitle());
                window.addShape(songPanels[i].artistName());
                if (legendType == 0) {
                    for (int j = 0; j < 8; j++) 
                    {
                        window.addShape(
                                songPanels[i].hobbyPanel().getBar()[j]);
                    }
                }
                else if (legendType == 1) 
                {
                    for (int j = 0; j < 8; j++) 
                    {
                        window.addShape(
                                songPanels[i].majorPanel().getBar()[j]);
                    }
                }
                else 
                {
                    for (int j = 0; j < 8; j++) 
                    {
                        window.addShape(
                                songPanels[i].regionPanel().getBar()[j]);
                    }
                }
                window.addShape(songPanels[i].hobbyPanel().getSeparator());
            }
        }

    }
}