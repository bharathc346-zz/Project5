<<<<<<< HEAD
/**
 * 
 */
package prj5;

import java.util.ArrayList;

/**
 * @author bharathchintagunta
 * @version 2017-04-20
 */
public class StudentTest extends student.TestCase {
    private Student s1;


    /**
     * setUp method
     */
    public void setUp() {
        s1 = new Student(1, "04/17/17", "Computer Science", "SouthWest",
            "reading");
    }


    /**
     * test getId
     */
    public void testGetId() {
        assertEquals(1, s1.getId());
    }


    /**
     * testGetDate()
     */
    public void testGetDate() {
        assertEquals("04/17/17", s1.getDate());
    }


    /**
     * test getMajor()
     */
    public void testGetMajor() {
        assertEquals("Computer Science", s1.getMajor());
    }


    /**
     * test getRegion()
     */
    public void testGetRegion() {
        assertEquals("SouthWest", s1.getRegion());
    }


    /**
     * test getHobby()
     */
    public void testGetHobby() {
        assertEquals("reading", s1.getHobby());
    }


    /**
     * test setHeardData()
     */
    public void testSetHeardData() {
        ArrayList<String> s = new ArrayList<String>();
        s.add("yes");
        s.add("no");
        s1.setHeardData(s);
        assertTrue(s1.getHeardData().equals(s));
    }


    /**
     * test setHeardData()
     */
    public void testSetLikedData() {
        ArrayList<String> s = new ArrayList<String>();
        s.add("yes");
        s.add("no");
        s1.setLikedData(s);
        assertTrue(s1.getLikedData().equals(s));
    }
=======
package prj5;

import student.TestCase;
/**
 * Class to test the student class
 * @author group48
 * @version 4/20/2017
 *
 */
public class StudentTest extends TestCase {

    private Student student;
    /**
     * Set up the testing
     */
    public void setUp()
    {
        student = new Student(1, "11/17", "EE", "Kanto", "Pokemon");
    }
    /**
     * Test the get Id method
     */
    public void testGetID()
    {
        assertEquals(1, student.getId());
    }
    /**
     * Test the getDate method
     */
    public void testGetDate()
    {
        assertEquals("11/17", student.getDate());
    }
    /**
     * Test the get major method
     */
    public void testGetMajor()
    {
        assertEquals("EE", student.getMajor());
    }
    /**
     * Test the get region method
     */
    public void testGetRegion()
    {
        assertEquals("Kanto", student.getRegion());
    }
    /**
     * Test the getHobby method
     */
    public void testGetHobby()
    {
        assertEquals("Pokemon", student.getHobby());
    }
    /**
     * Test the getHeardData method
     */
    public void testGetHeardData()
    {
        assertEquals(true, student.getHeardData().isEmpty());
    }
    /**
     * Test the getLikedData method
     */
    public void testGetLikedData()
    {
        assertTrue(student.getLikedData().isEmpty());
    }

>>>>>>> origin/master
}
