/**
 * 
 */
package prj5;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author bharathchintagunta
 *
 */
public class HobbyPercent {

    /**
     * helper method
     * Calc perc Heard for hobby
     * 
     * @param studentList
     *            list of studdents
     * @param hobby
     *            hobby to calc percent
     * @return
     */
    private static int[] calcPercHobbyHeard(
        LinkedList<Student> studentList,
        LinkedList<Song> songList,
        String hobby) {
        ArrayList<String> heardData = new ArrayList<String>();
        // build arraylist of all responses in all hobby heard datas
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
            if (studentList.get(i).getHobby().equals(hobby)) {
                sportStudent.add(studentList.get(i));
            }
        }
        return percArray;
    }


    /**
     * helper method
     * calculate percentages for respective hobbies
     * 
     * @param studentList
     *            list of students
     * @param hobby
     *            hobby to calc percentage for
     * @return percent
     */
    private static int[] calcPercHobbyLiked(
        LinkedList<Student> studentList,
        LinkedList<Song> songList,
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
            if (studentList.get(i).getHobby().equals(hobby)) {
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
        int[] sHP = calcPercHobbyHeard(studentList, songList, "sports");
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            cur.setSportsHeardPercent(sHP[i]);
        }

        int[] sLP = calcPercHobbyLiked(studentList, songList, "sports");
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            cur.setSportsLikedPercent(sLP[i]);
        }

        // Calc percentages heard and liked for reading

        int[] rHP = calcPercHobbyHeard(studentList, songList, "reading");
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            cur.setReadingHeardPercent(rHP[i]);
        }

        int[] rLP = calcPercHobbyLiked(studentList, songList, "reading");
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            cur.setReadingLikedPercent(rLP[i]);
        }

        // Calc percentages heard and liked for art
        int[] aHP = calcPercHobbyHeard(studentList, songList, "art");
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            cur.setArtHeardPercent(aHP[i]);
        }

        int[] aLP = calcPercHobbyLiked(studentList, songList, "art");
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            cur.setArtLikedPercent(aLP[i]);
        }

        // Calc percentages heard and liked for music
        int[] mHP = calcPercHobbyHeard(studentList, songList, "music");
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            cur.setMusicHeardPercent(mHP[i]);
        }

        int[] mLP = calcPercHobbyLiked(studentList, songList, "music");
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            cur.setMusicLikedPercent(mLP[i]);
        }
    }
}
