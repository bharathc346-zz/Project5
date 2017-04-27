package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Reads the data from the files and creates a new
 * project window
 * @author Jai Chintagunta (jaic4)
 * @version 04.20.2017
 */
public class Input 
{
    //list for the songs
    private SongList songList;

    /**
     * Creates a new window and passes the songs and
     * student data into it
     * 
     * @param songData
     *            Address of song data
     * @param studentData
     *            Address of student data
     * @throws FileNotFoundException
     */
    public Input(String songs, String students) throws FileNotFoundException 
    {
        this.songList = new SongList();
        readSongFile(songs);
        readStudentFile(students);
        new GUIDisplayWindow(this.songList);
    }

    /**
     * Main method
     * 
     * @param args
     *            files' name received from command lines
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException 
    {
        if (args.length == 2) 
        {
            new Input(args[1], args[0]);
        }
        else 
        {
            new Input("SongList.csv", "MusicSurveyData.csv");
        }
    }

    /**
     * Read song to the songList
     * 
     * @param str
     *            Address of song data
     * @throws FileNotFoundException
     */
    private void readSongFile(String songData) throws FileNotFoundException 
    {
        Scanner input = new Scanner(new File(songData));
        String[] str;

        input.nextLine();

        while (input.hasNextLine()) 
        {
            str = input.nextLine().trim().split(",");
            songList.add(new Song(str[0], str[1], str[2], str[3]));
        }

        input.close();
    }

    /**
     * Read student file and add data to songList
     * 
     * @param studentData
     *            Address of student data
     * @throws FileNotFoundException
     */
    private void readStudentFile(String studentData) throws FileNotFoundException 
    {
        Scanner input = new Scanner(new File(studentData));
        String[] str;
        Song song;
        String hobby;
        String major;
        String region;

        input.nextLine();

        while (input.hasNextLine()) {
            String[] temp = input.nextLine().trim().split(",");
            // get rid of invalid lines
            if (temp.length == (songList.size() * 2 + 4)) {
                str = new String[temp.length + 1];
                for (int i = 0; i < temp.length; i++) {
                    str[i] = temp[i];
                }
                str[temp.length] = "";
            }
            else {
                str = temp;
            }
            if (str.length <= 2) {
                continue;
            }
            
            // record the major, region, and hobby info of a student
            major = str[2];
            region = str[3];
            hobby = str[4];
            
            // update the counts attributes of the song
            for (int i = 5; (i + 1) < str.length; i += 2) {
                song = songList.getAt((i - 5) / 2);
                song.getMajorPercent().increment(major, str[i], str[i + 1]);
                song.getRegionPercent().increment(region, str[i], str[i + 1]);
                song.getHobbyPercent().increment(hobby, str[i], str[i + 1]);
            }
        }
        input.close();
    }
}