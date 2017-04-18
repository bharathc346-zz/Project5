/**
 * 
 */
package prj5;


import java.io.File;
import java.io.FileNotFoundException;
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
       Scanner scanSongLis = new Scanner(new File("SongList.csv"));
       //int indexLine = 1;
       scanSongLis.useDelimiter(",");
       while(scanSongLis.hasNextLine()) {
           System.out.print(scanSongLis.next()+",   ");
       }
       scanSongLis.close();
   }   
}
