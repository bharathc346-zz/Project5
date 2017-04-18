package prj5;

import java.util.List;

/**
 * TODO
 * @author 
 *
 */
public class Student {
    private int id;
    private int date;
    private String major;
    private String hobby;
    private List<Boolean> heardData;
    private List<Boolean> likesData;
    /**
     * Constructor
     * @param id
     * @param date
     * @param major
     * @param hobby
     * @param heard
     * @param likes
     */
    public Student(int id, int date, String major, String hobby, boolean heard, boolean likes)
    {
        this.id = id;
        this.date = date;
        this.major = major;
        this.hobby = hobby;
        heardData.add(heard);
        likesData.add(likes);
    }
    /**
     * 
     * @param person
     * @return
     */
    public int compareTo(Student person)
    {
        return 0;
    }
}
