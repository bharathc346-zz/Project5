/**
 * 
 */
package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author bharathchintagunta
 *
 */
public class Reader {
    
    private static String songFileName;
    private static String surveyFileName;
    
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
}
