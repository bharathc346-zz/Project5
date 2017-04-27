package prj5;

import java.awt.Color;

import CS2114.Shape;
import CS2114.TextShape;

/**
 * Class to hold all the shapes and text fields
 * for the legend
 * 
 * @author Collin Smith (smithcol)
 * @version 04.26.2017
 */
public class GUILegend 
{
    //fields for the legend
    private Shape frame;
    private TextShape[] text;
    private TextShape title;
    private TextShape songTitle;
    private TextShape heard;
    private TextShape like;
    private Shape separator;

    //coordinates for the legend
    private int xCoord;
    private int yCoord;
    private int windowWidth;
    private int windowHeight;

    /**
     * Creates a new legend
     * 
     * @param type - The type of legend
     * @param startX - the starting x coordinate
     * @param startY - the starting y coordinate
     * @param width - the width of the given window
     * @param height - the height of the given window
     */
    public GUILegend(String type, int startX, int startY, int width,
            int height) 
    {
        xCoord = startX;
        yCoord = startY;
        windowWidth = width;
        windowHeight = height;
        addFrame();
        addTitle(type);
        addText(type);
        addBottom();
    }

    /**
     * creates the frame of the legend
     */
    private void addFrame() 
    {
        frame = new Shape(xCoord, yCoord, windowWidth / 6,
                windowHeight * 5 / 7);
        frame.setForegroundColor(Color.BLACK);
        frame.setBackgroundColor(Color.WHITE);
    }

    /**
     * creates the title of the legend
     * 
     * @param type - the type of legend (hobby, major, etc.)
     */
    private void addTitle(String type) 
    {
        title = new TextShape(0, 0, type + " Legend");
        title.setX(
                xCoord + (frame.getWidth() - title.getWidth()) / 2);
        title.setY(yCoord + 5);
        title.setBackgroundColor(Color.WHITE);
        title.setForegroundColor(Color.BLACK);
    }

    /**
     * displays the representation text on the legend
     * 
     * @param type - the type of legend (hobby, major, etc.)
     */
    private void addText(String type) 
    {
        text = new TextShape[4];
        int x = 0;
        int y = 0;

        switch (type) 
        {
            case "Hobby":
                x = title.getX();
                y = title.getY() + title.getHeight() + 5;

                text[0] = new TextShape(x, y, "Read");
                text[0].setX(x);
                text[0].setY(y);
                text[0].setForegroundColor(Color.MAGENTA);
                text[0].setBackgroundColor(Color.WHITE);
                y += text[0].getHeight() + 5;

                text[1] = new TextShape(x, y, "Art");
                text[1].setX(x);
                text[1].setY(y);
                text[1].setForegroundColor(Color.BLUE);
                text[1].setBackgroundColor(Color.WHITE);
                y += text[0].getHeight() + 5;

                text[2] = new TextShape(x, y, "Sports");
                text[2].setX(x);
                text[2].setY(y);
                text[2].setForegroundColor(Color.ORANGE);
                text[2].setBackgroundColor(Color.WHITE);
                y += text[0].getHeight() + 5;

                text[3] = new TextShape(x, y, "Music");
                text[3].setX(x);
                text[3].setY(y);
                text[3].setForegroundColor(Color.GREEN);
                text[3].setBackgroundColor(Color.WHITE);
                break;

            case "Major":
                x = title.getX();
                y = title.getY() + title.getHeight() + 5;

                text[0] = new TextShape(x, y, "Comp Sci");
                text[0].setX(x);
                text[0].setY(y);
                text[0].setForegroundColor(Color.MAGENTA);
                text[0].setBackgroundColor(Color.WHITE);
                y += text[0].getHeight() + 5;

                text[1] = new TextShape(x, y, "Other Eng");
                text[1].setX(x);
                text[1].setY(y);
                text[1].setForegroundColor(Color.BLUE);
                text[1].setBackgroundColor(Color.WHITE);
                y += text[0].getHeight() + 5;

                text[2] = new TextShape(x, y, "Math/CMDA");
                text[2].setX(x);
                text[2].setY(y);
                text[2].setForegroundColor(Color.ORANGE);
                text[2].setBackgroundColor(Color.WHITE);
                y += text[0].getHeight() + 5;

                text[3] = new TextShape(x, y, "Other");
                text[3].setX(x);
                text[3].setY(y);
                text[3].setForegroundColor(Color.GREEN);
                text[3].setBackgroundColor(Color.WHITE);
                break;

            case "Region":
                x = title.getX();
                y = title.getY() + title.getHeight() + 5;

                text[0] = new TextShape(x, y, "Southeast");
                text[0].setX(x);
                text[0].setY(y);
                text[0].setForegroundColor(Color.MAGENTA);
                text[0].setBackgroundColor(Color.WHITE);
                y += text[0].getHeight() + 5;

                text[1] = new TextShape(x, y, "Northeast");
                text[1].setX(x);
                text[1].setY(y);
                text[1].setForegroundColor(Color.BLUE);
                text[1].setBackgroundColor(Color.WHITE);
                y += text[0].getHeight() + 5;

                text[2] = new TextShape(x, y, "Rest of US");
                text[2].setX(x);
                text[2].setY(y);
                text[2].setForegroundColor(Color.ORANGE);
                text[2].setBackgroundColor(Color.WHITE);
                y += text[0].getHeight() + 5;

                text[3] = new TextShape(x, y, "Outside US");
                text[3].setX(x);
                text[3].setY(y);
                text[3].setForegroundColor(Color.GREEN);
                text[3].setBackgroundColor(Color.WHITE);
                break;

            default:
                break;
        }
    }

    /**
     * creates the separation bar between the heard
     * and likes section
     */
    private void addSeparator() 
    {
        separator = new Shape(0, 0, 5, frame.getHeight() / 5);
        separator.setX(xCoord
                + (frame.getWidth() - separator.getWidth()) / 2);
        separator.setY(yCoord + (frame.getHeight() * 2 / 3 - 5));
        separator.setBackgroundColor(Color.BLACK);
        separator.setForegroundColor(Color.WHITE);
    }

    /**
     * adds the clarification figure to the bottom of the legend
     */
    private void addBottom() 
    {
        addSeparator();

        songTitle = new TextShape(0, 0, "Song Title");
        songTitle.setX(xCoord
                + (frame.getWidth() - songTitle.getWidth()) / 2);
        songTitle
                .setY(separator.getY() - songTitle.getHeight() - 5);
        songTitle.setBackgroundColor(Color.WHITE);

        heard = new TextShape(0, 0, "Heard");
        heard.setX(separator.getX() - heard.getWidth() - 5);
        heard.setY(separator.getY()
                + (separator.getHeight() - heard.getHeight()) / 2);
        heard.setBackgroundColor(Color.WHITE);

        like = new TextShape(0, 0, "Likes");
        like.setX(separator.getX() + 7);
        like.setY(separator.getY()
                + (separator.getHeight() - like.getHeight()) / 2);
        like.setBackgroundColor(Color.WHITE);
    }

    /**
     * returns the frame of the legend
     * 
     * @return frame
     */
    public Shape getFrame() 
    {
        return frame;
    }

    /**
     * returns the current legend representations
     * 
     * @return strings
     */
    public TextShape[] getText() 
    {
        return text;
    }

    /**
     * returns the current legend title
     * 
     * @return title
     */
    public TextShape getTitle() 
    {
        return title;
    }

    /**
     * returns the song title
     * 
     * @return songTitle
     */
    public TextShape getSongTitle() 
    {
        return songTitle;
    }

    /**
     * returns the heard shape
     * 
     * @return heard
     */
    public TextShape getHeard() 
    {
        return heard;
    }

    /**
     * returns the liked shape
     * 
     * @return like
     */
    public TextShape getLike() 
    {
        return like;

    }

    /**
     * returns the bar between the like
     * and heard graphics
     * 
     * @return separator
     */
    public Shape getSeparator() 
    {
        return separator;
    }

}