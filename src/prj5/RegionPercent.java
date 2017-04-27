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
public class RegionPercent {
    /**
    * helper method
    * Calc perc Heard for region
    * 
    * @param studentList
    *            list of studdnts
    * @param major
    *            hobby to calc percent
    * @return
    */
   private static int[] calcPercRegionHeard(
       LinkedList<Student> studentList,
       LinkedList<Song> songList,
       String region) {
       ArrayList<String> heardData = new ArrayList<String>();
       // build arraylist of all responses in all region heard datas
       for (int i = 0; i < studentList.size(); i++) {
           if (studentList.get(i).getRegion().equals(region)) {
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
       LinkedList<Student> regionStudent = new LinkedList<Student>();
       for (int i = 0; i < studentList.size(); i++) {
           if (studentList.get(i).getHobby().equals(region)) {
               regionStudent.add(studentList.get(i));
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
   private static int[] calcPercRegionLiked(
       LinkedList<Student> studentList,
       LinkedList<Song> songList,
       String region) {
       ArrayList<String> likedData = new ArrayList<String>();
       // build arraylist of all responses in all math heard datas
       for (int i = 0; i < studentList.size(); i++) {
           if (studentList.get(i).getRegion().equals(region)) {
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
       LinkedList<Student> regionStudent = new LinkedList<Student>();
       for (int i = 0; i < studentList.size(); i++) {
           if (studentList.get(i).getHobby().equals(region)) {
               regionStudent.add(studentList.get(i));
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
       // Calc percentages heard and liked for southeast
       int[] seHP = calcPercRegionHeard(studentList, songList, "Southeast");
       for (int i = 0; i < songList.size(); i++) {
           Song cur = songList.get(i);
           cur.setSeHeardPercent(seHP[i]);
       }

       int[] seLP = calcPercRegionLiked(studentList, songList, "Southeast");
       for (int i = 0; i < songList.size(); i++) {
           Song cur = songList.get(i);
           cur.setSeLikedPercent(seLP[i]);
       }

       // Calc percentages heard and liked for northeast
       int[] neHP = calcPercRegionHeard(studentList, songList, "Northeast");
       for (int i = 0; i < songList.size(); i++) {
           Song cur = songList.get(i);
           cur.setNeHeardPercent(neHP[i]);
       }

       int[] neLP = calcPercRegionLiked(studentList, songList, "Northeast");
       for (int i = 0; i < songList.size(); i++) {
           Song cur = songList.get(i);
           cur.setNeLikedPercent(neLP[i]);
       }

       // Calc percentages heard and liked for United States 
       int[] usHP = calcPercRegionHeard(studentList, songList, "United States (other than Southeast or Northwest)");
       for (int i = 0; i < songList.size(); i++) {
           Song cur = songList.get(i);
           cur.setUsHeardPercent(usHP[i]);
       }

       int[] usLP = calcPercRegionLiked(studentList, songList, "United States (other than Southeast or Northwest)");
       for (int i = 0; i < songList.size(); i++) {
           Song cur = songList.get(i);
           cur.setUsLikedPercent(usLP[i]);
       }

       // Calc percentages heard and liked for Outside of United States
       int[] oHP = calcPercRegionHeard(studentList, songList, "Outside of United States");
       for (int i = 0; i < songList.size(); i++) {
           Song cur = songList.get(i);
           cur.setInlHeardPercent(oHP[i]);
       }

       int[] oLP = calcPercRegionLiked(studentList, songList, "Outside of United States");
       for (int i = 0; i < songList.size(); i++) {
           Song cur = songList.get(i);
           cur.setInlLikedPercent(oLP[i]);
       }
   }
}
