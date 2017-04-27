/**
 * 
 */
package prj5;

import java.util.ArrayList;

/**
 * @author bharathchintagunta
 * @version 04.19.17
 */
public class Student {
    private int id;
    private String date;
    private String major;
    private String region;
    private String hobby;
    private ArrayList<String> heardData;
    private ArrayList<String> likedData;


    /**
     * Constructor
     * 
     * @param i
     *            id
     * @param d
     *            date
     * @param m
     *            major
     * @param r
     *            region
     * @param h
     *            hobby
<<<<<<< HEAD
=======
     * @param heard
     *            list of heard
     * @param liked
     *            list of liked
>>>>>>> origin/master
     */
    public Student(int i, String d, String m, String r, String h) {
        this.id = i;
        this.date = d;
        this.major = m;
        this.region = r;
        this.hobby = h;
        this.heardData = new ArrayList<String>();
        this.likedData = new ArrayList<String>();
    }


    /**
     * get id
     * 
     * @return id
     */
    public int getId() {
        return this.id;
    }


    /**
     * get date
     * 
     * @return date
     */
    public String getDate() {
        return this.date;
    }


    /**
     * get major
     * 
     * @return major
     */
    public String getMajor() {
        return this.major;
    }


    /**
     * get region
     * 
     * @return region
     */
    public String getRegion() {
        return this.region;
    }


    /**
     * get hobby
     * 
     * @return hobby
     */
    public String getHobby() {
        return this.hobby;
    }


    /**
<<<<<<< HEAD
     * set heard data
     * 
     * @param s
     *            ArrayList to set to
     */
    public void setHeardData(ArrayList<String> s) {
        this.heardData = s;
    }


    /**
     * set liked data
     * 
     * @param s
     *            ArrayList to set to
     */
    public void setLikedData(ArrayList<String> s) {
        this.likedData = s;
    }


    /**
=======
>>>>>>> origin/master
     * get heard data
     * 
     * @return heardData
     */
    public ArrayList<String> getHeardData() {
        return this.heardData;
    }


    /**
     * get liked data
     * 
     * @return likedData
     */
    public ArrayList<String> getLikedData() {
        return this.likedData;
    }

<<<<<<< HEAD
=======

    public String toString() {
        return "id: " + this.id + "\nheardData: " + this.heardData.toString()
            + "\nliked: " + this.likedData;
    }

>>>>>>> origin/master
}
