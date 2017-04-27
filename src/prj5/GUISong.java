package prj5;

import java.awt.Color;
import CS2114.TextShape;

/**
 * Class to represent a single glyph. It has three StatGUIs which contain 
 * hobby, major, and region statistics. The DisplayWindow class decides 
 * which one to call while running.
 * 
 * @author Collin Smith (smithcol)
 * @version 04.26.2017
 *
 */
public class GUISong 
{
    // ~ Fields
    private TextShape songTitle;
    private TextShape artistName;
    private GUIStats hobbyPanel;
    private GUIStats majorPanel;
    private GUIStats regionPanel;
    private int panelWidth;
    private int xCoord;
    private int yCoord;

    // ~ Constructor
    /**
     * Creates a new SongGUI
     * 
     * @param song - the song to represent
     * @param startX - the start X coordinate
     * @param startY - the start Y coordinate
     * @param width - the panel width
     */
    public GUISong(Song song, int startX, int startY, int width) 
    {
        xCoord = startX;
        this.yCoord = startY;
        this.panelWidth = width;
        // deal with long length titles
        String title = song.getSongTitle();
        int titleLength = title.length();
        if (titleLength > 25) {
            int firstTwoWordEnd = 0;
            for (int i = 0, count = 0; i < titleLength && count < 2; i++) 
            {
                if (title.charAt(i) == ' ') 
                {
                    count++;
                }
                firstTwoWordEnd = i;
            }
            int lastTwoWordsStart = 0;
            for (int i = 0, count = 0; i < titleLength && count < 2; i++) 
            {
                if (title.charAt(titleLength - 1 - i) == ' ') 
                {
                    count++;
                }
                lastTwoWordsStart = titleLength - i;
            }            
            String result = title.substring(0, firstTwoWordEnd);
            result += " ... ";
            result += title.substring(lastTwoWordsStart, titleLength);
            title = result;
        }
        songTitle = new TextShape(0, 0, title);
        artistName = new TextShape(0, 0, "by " + song.getArtistName());
        hobbyPanel = new GUIStats(song, "hobby", startX, startY
                + songTitle.getHeight() + artistName.getHeight() + 2,
                panelWidth);
        majorPanel = new GUIStats(song, "major", startX, startY
                + songTitle.getHeight() + artistName.getHeight() + 2,
                panelWidth);
        regionPanel = new GUIStats(song, "region", startX, startY
                + songTitle.getHeight() + artistName.getHeight() + 2,
                panelWidth);
        initTextShape();
    }

    // ~ Methods
    /**
     * initialize the text shapes
     */
    private void initTextShape() 
    {
        this.songTitle.setBackgroundColor(Color.WHITE);
        this.songTitle.setForegroundColor(Color.BLACK);
        songTitle.setX(xCoord + (panelWidth - songTitle.getWidth()) / 2);
        songTitle.setY(yCoord);
        this.artistName.setBackgroundColor(Color.WHITE);
        this.artistName.setForegroundColor(Color.BLACK);
        artistName.setX(xCoord + (panelWidth - artistName.getWidth()) / 2);
        artistName.setY(yCoord + songTitle.getHeight());
    }

    /**
     * get the song title text shape
     * 
     * @return the song title text shape
     */
    public TextShape songTitle() 
    {
        return this.songTitle;
    }

    /**
     * get the artist name text shape
     * 
     * @return the artist name text shape
     */
    public TextShape artistName() 
    {
        return this.artistName;
    }

    /**
     * get the statistic of hobby panel
     * 
     * @return the statistic of hobby panel
     */
    public GUIStats hobbyPanel() 
    {
        return this.hobbyPanel;
    }

    /**
     * get the statistic of major panel
     * 
     * @return the statistic of major panel
     */
    public GUIStats majorPanel() 
    {
        return this.majorPanel;
    }

    /**
     * get the statistic of region panel
     * 
     * @return the statistic of region panel
     */
    public GUIStats regionPanel() 
    {
        return this.regionPanel;
    }

}