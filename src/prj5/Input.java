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
    private static String songFileName;
    private static String surveyFileName;
    private static LinkedList<Song> songList;
    private static LinkedList<Student> studentList;


    /**
     * main method
     * 
     * @param args
     *            arguments passed
     */
    public static void main(String args[]) throws FileNotFoundException {

        surveyFileName = args[0];
        songFileName = args[1];

        // read songList and MusicSurveyData files
        songList = readSongList(songFileName);
        studentList = readStudentData(surveyFileName);

// //manual testing
// songList = readSongList("SongListTest1.csv");
// studentList = readStudentData("MusicSurveyDataTest1.csv");

        setPercentSongs(studentList, songList);
        sortByGenre(songList);
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            System.out.println("Song Title: " + cur.getName());
            System.out.println("Song Artist: " + cur.getArtist());
            System.out.println("Song Genre: " + cur.getGenre());
            System.out.println("Song Year: " + cur.getYear());
            System.out.println("Heard:");
            System.out.print("reading:" + cur.getReadingHeardPercent() + " art:"
                + cur.getArtHeardPercent() + " sports:" + cur
                    .getSportsHeardPercent() + " music:" + cur
                        .getMusicHeardPercent() + "\n");
            System.out.println("Likes:");
            System.out.print("reading:" + cur.getReadingLikedPercent() + " art:"
                + cur.getArtLikedPercent() + " sports:" + cur
                    .getSportsLikedPercent() + " music:" + cur
                        .getMusicLikedPercent());
            System.out.println("\n");
        }

        sortByTitle(songList);
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            System.out.println("Song Title: " + cur.getName());
            System.out.println("Song Artist: " + cur.getArtist());
            System.out.println("Song Genre: " + cur.getGenre());
            System.out.println("Song Year: " + cur.getYear());
            System.out.println("Heard:");
            System.out.print("reading:" + cur.getReadingHeardPercent() + " art:"
                + cur.getArtHeardPercent() + " sports:" + cur
                    .getSportsHeardPercent() + " music:" + cur
                        .getMusicHeardPercent() + "\n");
            System.out.println("Likes:");
            System.out.print("reading:" + cur.getReadingLikedPercent() + " art:"
                + cur.getArtLikedPercent() + " sports:" + cur
                    .getSportsLikedPercent() + " music:" + cur
                        .getMusicLikedPercent());
            System.out.println("\n");
        }

    }


    /**
     * insertion sort to sort by genre
     * 
     * @param songs
     *            list to be sorted
     */
    public static void sortByGenre(LinkedList<Song> songs) {
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
    public static void sortByTitle(LinkedList<Song> songs) {
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
    public static LinkedList<Song> readSongList(String fileName)
        throws FileNotFoundException {
        songFileName = fileName;
        // scan the file SongList and get relevant data
        Scanner scanSongLis = new Scanner(new File(fileName));
        LinkedList<Song> songList = new LinkedList<Song>();
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
    public static LinkedList<Student> readStudentData(String fileName)
        throws FileNotFoundException {
        surveyFileName = fileName;
        // scan the file MusicSurveyData and get relevant data
        Scanner scanSurDat = new Scanner(new File(fileName));

        LinkedList<Student> studentList = new LinkedList<Student>();

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


    public static int[] calcPercHeard(
        LinkedList<Student> studentList,
        String hobby) {
        ArrayList<String> heardData = new ArrayList<String>();
        // build arraylist of all responses in all math heard datas
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getHobby().equals(hobby)) {
                for (int j = 0; j < studentList.get(i).getHeardData()
                    .size(); j++) {
                    // add elements from each sports students heard data
                    heardData.add(studentList.get(i).getHeardData().get(j));
                }

            }
        }

        int[] yesHeardData = new int[songList.size()];
        int[] noHeardData = new int[songList.size()];

        int j = 0;
        // increment yes's in corresponding indices in yesHeardData
        for (int i = 0; i < heardData.size(); i++) {
            if (j % songList.size() == 0) {
                j = 0;
            }
            if (heardData.get(i).equals("Yes")) {
                yesHeardData[j]++;
            }
            else if (heardData.get(i).equals("No")) {
                noHeardData[j]++;
            }
            j++;
        }
        int[] percArray = new int[songList.size()];
        // Calculate percents and put in array
        for (int i = 0; i < percArray.length; i++) {
            int total = yesHeardData[i] + noHeardData[i];
            if (total != 0) {
                int percentHeard = (yesHeardData[i] * 100) / total;
                percArray[i] = percentHeard;
            }
        }
        LinkedList<Student> sportStudent = new LinkedList<Student>();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getHobby().equals("sports")) {
                sportStudent.add(studentList.get(i));
            }
        }
        return percArray;
    }


    /**
     * calculate percentages for respective hobbies
     * 
     * @param studentList
     *            list of students
     * @param hobby
     *            hobby to calc percentage for
     * @return
     */
    public static int[] calcPercLiked(
        LinkedList<Student> studentList,
        String hobby) {
        ArrayList<String> likedData = new ArrayList<String>();
        // build arraylist of all responses in all math heard datas
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getHobby().equals(hobby)) {
                for (int j = 0; j < studentList.get(i).getLikedData()
                    .size(); j++) {
                    // add elements from each sports students heard data
                    likedData.add(studentList.get(i).getLikedData().get(j));
                }

            }
        }

        int[] yesLikedData = new int[songList.size()];
        int[] noLikedData = new int[songList.size()];

        int j = 0;
        // increment yes's in corresponding indices in yesHeardData
        for (int i = 0; i < likedData.size(); i++) {
            if (j % songList.size() == 0) {
                j = 0;
            }
            if (likedData.get(i).equals("Yes")) {
                yesLikedData[j]++;
            }
            else if (likedData.get(i).equals("No")) {
                noLikedData[j]++;
            }
            j++;
        }
        int[] percArray = new int[songList.size()];
        // Calculate percents and put in array
        for (int i = 0; i < percArray.length; i++) {
            int total = yesLikedData[i] + noLikedData[i];
            if (total != 0) {
                int percentHeard = (yesLikedData[i] * 100) / total;
                percArray[i] = percentHeard;
            }
        }
        LinkedList<Student> sportStudent = new LinkedList<Student>();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getHobby().equals("sports")) {
                sportStudent.add(studentList.get(i));
            }
        }
        return percArray;
    }


    /**
     * iniitalize percentages in song object
     * 
     * @param studentList
     *            list of students
     * @param songList
     *            list of songs
     */
    public static void setPercentSongs(
        LinkedList<Student> studentList,
        LinkedList<Song> songList) {
        // Calc percentages heard and liked for sports
        int[] sHP = calcPercHeard(studentList, "sports");
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            cur.setSportsHeardPercent(sHP[i]);
        }

        int[] sLP = calcPercLiked(studentList, "sports");
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            cur.setSportsLikedPercent(sLP[i]);
        }

        // Calc percentages heard and liked for reading

        int[] rHP = calcPercHeard(studentList, "reading");
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            cur.setReadingHeardPercent(rHP[i]);
        }

        int[] rLP = calcPercLiked(studentList, "reading");
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            cur.setReadingLikedPercent(rLP[i]);
        }

        // Calc percentages heard and liked for art
        int[] aHP = calcPercHeard(studentList, "art");
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            cur.setArtHeardPercent(aHP[i]);
        }

        int[] aLP = calcPercLiked(studentList, "art");
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            cur.setArtLikedPercent(aLP[i]);
        }

        // Calc percentages heard and liked for music
        int[] mHP = calcPercHeard(studentList, "music");
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            cur.setMusicHeardPercent(mHP[i]);
        }

        int[] mLP = calcPercLiked(studentList, "music");
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            cur.setMusicLikedPercent(mLP[i]);
        }
    }

}
