/**
 * 
 */
package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author bharathchintagunta
 * @version 2017-04-20
 */
public class Input {
    private static LinkedList<Song> songList;
    private static LinkedList<Student> studentList;


    /**
     * main method
     * 
     * @param args
     *            arguments passed
     */
    public static void main(String args[]) throws FileNotFoundException {

// surveyFileName = args[0];
// songFileName = args[1];
//
// // read songList and MusicSurveyData files
// songList = readSongList(songFileName);
// studentList = readStudentData(surveyFileName);

        Reader rd = new Reader();
        HobbyPercent hp = new HobbyPercent();
        MajorPercent mp = new MajorPercent();
        DataSorter ds = new DataSorter();

        // manual testing
        songList = rd.readSongList("SongListTest1.csv");
        studentList = rd.readStudentData("MusicSurveyDataTest1.csv");

        hp.setPercentSongs(studentList, songList);
        mp.setPercentSongs(studentList, songList);

        ds.sortByGenre(songList);

        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            System.out.println("Song Title: " + cur.getName());
            System.out.println("Song Artist: " + cur.getArtist());
            System.out.println("Song Genre: " + cur.getGenre());
            System.out.println("Song Year: " + cur.getYear());
            System.out.println("Heard:");
            System.out.println("Computer Science: " + cur
                .getComputerScienceHeardPercent());
            System.out.println("\n");
        }

// for (int i = 0; i < songList.size(); i++) {
// Song cur = songList.get(i);
// System.out.println("Song Title: " + cur.getName());
// System.out.println("Song Artist: " + cur.getArtist());
// System.out.println("Song Genre: " + cur.getGenre());
// System.out.println("Song Year: " + cur.getYear());
// System.out.println("Heard:");
// System.out.print("reading:" + cur.getReadingHeardPercent() + " art:"
// + cur.getArtHeardPercent() + " sports:" + cur
// .getSportsHeardPercent() + " music:" + cur
// .getMusicHeardPercent() + "\n");
// System.out.println("Likes:");
// System.out.print("reading:" + cur.getReadingLikedPercent() + " art:"
// + cur.getArtLikedPercent() + " sports:" + cur
// .getSportsLikedPercent() + " music:" + cur
// .getMusicLikedPercent());
// System.out.println("\n");
// }
//
// ds.sortByTitle(songList);
// for (int i = 0; i < songList.size(); i++) {
// Song cur = songList.get(i);
// System.out.println("Song Title: " + cur.getName());
// System.out.println("Song Artist: " + cur.getArtist());
// System.out.println("Song Genre: " + cur.getGenre());
// System.out.println("Song Year: " + cur.getYear());
// System.out.println("Heard:");
// System.out.print("reading:" + cur.getReadingHeardPercent() + " art:"
// + cur.getArtHeardPercent() + " sports:" + cur
// .getSportsHeardPercent() + " music:" + cur
// .getMusicHeardPercent() + "\n");
// System.out.println("Likes:");
// System.out.print("reading:" + cur.getReadingLikedPercent() + " art:"
// + cur.getArtLikedPercent() + " sports:" + cur
// .getSportsLikedPercent() + " music:" + cur
// .getMusicLikedPercent());
// System.out.println("\n");
// }

    }
}
