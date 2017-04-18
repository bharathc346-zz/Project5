/**
 * 
 */
package prj5;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author bharathchintagunta
 * @version 04.17.17
 */
public class Input {
    /**
     * main method
     * @param args arguments passed
     */
   public static void main (String args[]) throws FileNotFoundException{
       //Scanner scanSurDat = new Scanner(new File("MusicSurveyData.csv"));
       
       //scan the file SongList and get relevant data
       Scanner scanSongLis = new Scanner(new File("SongList.csv"));
       ArrayList<String> songTitleList = new ArrayList<String>();
       ArrayList<String> songArtistList = new ArrayList<String>();
       ArrayList<Integer> songYearList = new ArrayList<Integer>();
       ArrayList<String> songGenreList = new ArrayList<String>();
       //skip csv title line
       scanSongLis.nextLine();
       while(scanSongLis.hasNextLine()) {
           //curLine array of the current line
           String[] curLine = scanSongLis.nextLine().split(",");
           songTitleList.add(curLine[0]);
           songArtistList.add(curLine[1]);
           songYearList.add(Integer.parseInt(curLine[2]));
           songGenreList.add(curLine[3]);
       }
       scanSongLis.close();
       System.out.println(songTitleList.toString());
       System.out.println(songArtistList.toString());
       System.out.println(songYearList.toString());
       System.out.println(songGenreList.toString());
   }

}
