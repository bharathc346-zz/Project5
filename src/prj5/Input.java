/**
 * 
 */
package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
<<<<<<< HEAD
import java.util.LinkedList;
=======
>>>>>>> origin/master
import java.util.Scanner;

/**
 * @author bharathchintagunta
 * @version 2017-04-20
 */
public class Input {
<<<<<<< HEAD
    private static LinkedList<Song> songList;
    private static LinkedList<Student> studentList;
=======
    private static String songFileName;
    private static String surveyFileName;
    private static ArrayList<Song> songList;
    private static ArrayList<Student> studentList;
>>>>>>> origin/master


    /**
     * main method
     * 
     * @param args
     *            arguments passed
<<<<<<< HEAD
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
=======
     * @throws FileNotFoundException 
     */
    public static void main(String args[]) throws FileNotFoundException{

        // read songList and MusicSurveyData files
        songList = readSongList("SongListTest1.csv");
        studentList = readStudentData("MusicSurveyDataTest1.csv");

        sortByGenre(songList);
        for (int i = 0; i < songList.size(); i++) {
            System.out.println("Song Title: " + songList.get(i).getName());
            System.out.println("Song Artist: " + songList.get(i).getArtist());
            System.out.println("Song Genre: " + songList.get(i).getGenre());
            System.out.println("Song Year: " + songList.get(i).getYear());
            System.out.println("");
        }

    }


    /**
     * insertion sort to sort by genre
     * 
     * @param songs
     *            list to be sorted
     */
    public static void sortByGenre(ArrayList<Song> songs) {
        GenreComparator gc = new GenreComparator();
        for (int i = 0; i != songs.size(); i++) {
            Song itemToInsert = songs.get(i);
            int j = i;
            while (j != 0 && ((gc.compare(songs.get(j - 1),
                itemToInsert) > 0))) {
                songs.set(j, songs.get(j - 1));
                j = j - 1;
            }
            songs.set(j, itemToInsert);
        }
    }


    /**
     * insertion sort to sort by title
     * 
     * @param songs
     *            list to be sorted
     */
    public static void sortByTitle(ArrayList<Song> songs) {
        TitleComparator tc = new TitleComparator();
        for (int i = 0; i != songs.size(); i++) {
            Song itemToInsert = songs.get(i);
            int j = i;
            while (j != 0 && ((tc.compare(songs.get(j - 1),
                itemToInsert) > 0))) {
                songs.set(j, songs.get(j - 1));
                j = j - 1;
            }
            songs.set(j, itemToInsert);
        }
    }


    /**
     * parse song list file
     * 
     * @param fileName
     *            file to be read
     * @return list of songs
     * @throws FileNotFoundException
     */
    public static ArrayList<Song> readSongList(String fileName)
        throws FileNotFoundException {
        songFileName = fileName;
        // scan the file SongList and get relevant data
        Scanner scanSongLis = new Scanner(new File(fileName));
        ArrayList<Song> songList = new ArrayList<Song>();
        // skip csv title line
        scanSongLis.nextLine();
        while (scanSongLis.hasNextLine()) {
            // curLine array of the current line
            String[] curLine = scanSongLis.nextLine().split(",");
            songList.add(new Song(curLine[0], curLine[1], Integer.parseInt(
                curLine[2]), curLine[3]));
        }
        scanSongLis.close();
        return songList;
    }


    /**
     * Parse survey data file
     * 
     * @param fileName
     *            file to be read
     * @return arraylist of student responses
     * @throws FileNotFoundException
     */
    public static ArrayList<Student> readStudentData(String fileName)
        throws FileNotFoundException {
        surveyFileName = fileName;
        // scan the file MusicSurveyData and get relevant data
        Scanner scanSurDat = new Scanner(new File(fileName));

        ArrayList<Student> studentList = new ArrayList<Student>();

        // skip csv title line
        scanSurDat.nextLine();
        // 59 songs
        // use songlist.length
        int trueLen = readSongList(songFileName).size() * 2 + 5;
        int index = 0;

        while (scanSurDat.hasNextLine()) {
            String[] curLine = scanSurDat.nextLine().split(",");
            if (curLine.length >= 5) {
                studentList.add(new Student(Integer.parseInt(curLine[0]),
                    curLine[1], curLine[2], curLine[3], curLine[4]));
                // if we need to fill the hearddata and liked data with some
                // empty vals
                if (curLine.length != trueLen) {
                    for (int i = 5; i < curLine.length; i++) {
                        if (i % 2 != 0) {
                            studentList.get(index).getHeardData().add(
                                curLine[i]);
                        }
                        else {
                            studentList.get(index).getLikedData().add(
                                curLine[i]);
                        }
                    }
                    for (int i = curLine.length; i < trueLen; i++) {
                        if (i % 2 != 0) {
                            studentList.get(index).getHeardData().add("");
                        }
                        else {
                            studentList.get(index).getLikedData().add("");
                        }
                    }
                }
                // if heard data and liked data is complete
                else {
                    for (int i = 5; i < trueLen; i++) {
                        if (i % 2 != 0) {
                            studentList.get(index).getHeardData().add(
                                curLine[i]);
                        }
                        else {
                            studentList.get(index).getLikedData().add(
                                curLine[i]);

                        }
                    }
                }
                index++;
            }

        }
        return studentList;
    }
>>>>>>> origin/master

    }
}
