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

}
