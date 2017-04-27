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
public class MajorPercent {
    /**
     * helper method
     * Calc perc Heard for major
     * 
     * @param studentList
     *            list of studdnts
     * @param major
     *            hobby to calc percent
     * @return
     */
    private static int[] calcPercMajorHeard(
        LinkedList<Student> studentList,
        LinkedList<Song> songList,
        String major) {
        ArrayList<String> heardData = new ArrayList<String>();
        // build arraylist of all responses in all major heard datas
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getMajor().equals(major)) {
                for (int j = 0; j < studentList.get(i).getHeardData()
                    .size(); j++) {
                    // add elements from each major students heard data
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
        LinkedList<Student> majorStudent = new LinkedList<Student>();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getHobby().equals(major)) {
                majorStudent.add(studentList.get(i));
            }
        }
        return percArray;
    }


    /**
     * helper method
     * calculate percentages for respective major
     * 
     * @param studentList
     *            list of students
     * @param hobby
     *            major to calc percentage for
     * @return percent
     */
    private static int[] calcPercMajorLiked(
        LinkedList<Student> studentList,
        LinkedList<Song> songList,
        String major) {
        ArrayList<String> likedData = new ArrayList<String>();
        // build arraylist of all responses in all math heard datas
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getMajor().equals(major)) {
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
        LinkedList<Student> majorStudent = new LinkedList<Student>();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getHobby().equals("sports")) {
                majorStudent.add(studentList.get(i));
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
        // Calc percentages heard and liked for computer science
        int[] csHP = calcPercMajorHeard(studentList, songList, "Computer Science");
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            cur.setComputerScienceHeardPercent(csHP[i]);
        }

        int[] csLP = calcPercMajorLiked(studentList, songList, "Computer Science");
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            cur.setComputerScienceLikedPercent(csLP[i]);
        }

        // Calc percentages heard and liked for Other Engineering

        int[] oeHP = calcPercMajorHeard(studentList, songList, "Other Engineering");
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            cur.setOtherEngineeringHeardPercent(oeHP[i]);
        }

        int[] oeLP = calcPercMajorLiked(studentList, songList, "Other Engineering");
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            cur.setOtherEngineeringLikedPercent(oeLP[i]);
        }

        // Calc percentages heard and liked for Math or CMDA
        int[] mHP = calcPercMajorHeard(studentList, songList, "Math or CMDA");
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            cur.setMathOrCMDAHeardPercent(mHP[i]);
        }

        int[] mLP = calcPercMajorLiked(studentList, songList, "Math or CMDA");
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            cur.setMathOrCMDALikedPercent(mLP[i]);
        }

        // Calc percentages heard and liked for other
        int[] oHP = calcPercMajorHeard(studentList, songList, "Other");
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            cur.setOtherHeardPercent(oHP[i]);
        }

        int[] oLP = calcPercMajorLiked(studentList, songList, "Other");
        for (int i = 0; i < songList.size(); i++) {
            Song cur = songList.get(i);
            cur.setOtherLikedPercent(oLP[i]);
        }
    }
}
