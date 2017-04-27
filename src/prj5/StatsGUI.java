package prj5;

import java.awt.Color;

import CS2114.Shape;

/**
 * This class is used to represent one song's statistic. It contains a
 * separator and bars that represent the result of the survey.
 * 
 * @author Collin Smith (smithcol)
 * @version 04.26.2017
 */
public class StatsGUI 
{
    // ~ Fields
    // Shape
    private Shape[] bar;
    private Shape separator;
    // Song
    private Song song;
    // Type of represent
    private String type;
    // Coordinate
    private int xCoord;
    private int yCoord;
    // Size of panel
    private int panelWidth;
    // Height of bar
    public final int BAR_HEIGHT = 10;

    // ~ Constructor
    /**
     * creates a new StatsGUI
     * 
     * @param song
     *            Song
     * @param rep
     *            Type of represent
     * @param startX
     *            start X
     * @param startY
     *            start Y
     * @param panelWidth
     *            width of panel
     */
    public StatsGUI(Song tune, String rep, int startX, int startY, int width) 
    {
        song = tune;
        type = rep;
        xCoord = startX;
        yCoord = startY;
        panelWidth = width;
        bar = new Shape[8];
        setUpSeparator();
        setUpBars();
    }

    // ~ Methods
    /**
     * Create the separator
     */
    private void setUpSeparator() 
    {
        separator = new Shape(0, 0, 5, BAR_HEIGHT * 4);
        separator.setX(
            xCoord + (panelWidth - separator.getWidth()) / 2);
        separator.setY(yCoord);
        separator.setForegroundColor(Color.BLACK);
        separator.setBackgroundColor(Color.BLACK);
    }

    /**
     * sets up the bar
     */
    private void setUpBars() 
    {
        switch (type) 
        {
            case "hobby":
                for (int i = 0; i < 4; i++) 
                {
                    bar[i] = new Shape(0, 0,
                            song.getHobbyPercent().getLike()[i],
                            BAR_HEIGHT);
                    bar[i + 4] = new Shape(0, 0,
                            song.getHobbyPercent().getHeard()[i],
                            BAR_HEIGHT);
                }
                break;

            case "major":
                for (int i = 0; i < 4; i++) 
                {
                    bar[i] = new Shape(0, 0,
                            song.getMajorPercent().getLike()[i],
                            BAR_HEIGHT);
                    bar[i + 4] = new Shape(0, 0,
                            song.getMajorPercent().getHeard()[i],
                            BAR_HEIGHT);
                }
                break;

            case "region":
                for (int i = 0; i < 4; i++) 
                {
                    bar[i] = new Shape(0, 0,
                            song.getRegionPercent().getLike()[i],
                            BAR_HEIGHT);
                    bar[i + 4] = new Shape(0, 0,
                            song.getRegionPercent().getHeard()[i],
                            BAR_HEIGHT);
                }
                break;

            default:
                break;
        }

        setCoordinate();
        setBarColor();

    }

    /**
     * Set bar's color
     */
    private void setBarColor() 
    {
        // Set foreground color for bars
        for (int i = 0; i < 8; i++) 
        {
            bar[i].setForegroundColor(Color.WHITE);
        }

        // Set background color
        bar[0].setBackgroundColor(Color.MAGENTA);
        bar[4].setBackgroundColor(Color.MAGENTA);
        bar[1].setBackgroundColor(Color.BLUE);
        bar[5].setBackgroundColor(Color.BLUE);
        bar[2].setBackgroundColor(Color.ORANGE);
        bar[6].setBackgroundColor(Color.ORANGE);
        bar[3].setBackgroundColor(Color.GREEN);
        bar[7].setBackgroundColor(Color.GREEN);
    }

    /**
     * Set bar's coordinate
     */
    private void setCoordinate() 
    {
        int y = yCoord;

        // Like
        for (int i = 0; i < 4; i++) 
        {
            bar[i].setX(separator.getX() - bar[i].getWidth());
            bar[i].setY(y);
            y += BAR_HEIGHT;
        }

        y = yCoord;

        // Heard
        for (int i = 0; i < 4; i++) 
        {
            bar[i + 4]
                    .setX(separator.getX() + separator.getWidth());
            bar[i + 4].setY(y);
            y += BAR_HEIGHT;
        }
    }

    /**
     * Get the separator
     * 
     * @return separator
     */
    public Shape getSeparator() 
    {
        return separator;
    }

    /**
     * Get the bar
     * 
     * @return bar
     */
    public Shape[] getBar() 
    {
        return bar;
    }
}