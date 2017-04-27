package prj5;
import student.TestCase;
/**
 * Test class for the Linked List
 * @author group48
 * @version 4/27/2017
 *
 */
public class LinkedListTest extends TestCase {
    
    private LinkedList<String> lList;
    /**
     * Test the setUp method
     */
    public void setUp()
    {
        lList = new LinkedList<String>();
    }
    /**
     * Test the add method with entry and index
     */
    public void testAddIndex()
    {
        lList.add(0, "Test");
        lList.add(0, "Dog");
        lList.add(1, "Cat");
        lList.add(3, "Bus");
        assertEquals(4, lList.size());
    }
    /**
     * Test the add method with entry only
     */
    public void testAddItem()
    {
        lList.add("Test");
        lList.add("Cat");
        assertEquals(2, lList.size());
    }
    /**
     * Test the remove method
     */
    public void testRemove()
    {
        lList.add("Test");
        lList.add("Cat");
        lList.add("Test");
        lList.add("Cat");
        assertFalse(lList.isEmpty());
        lList.remove("Cat");
        lList.remove("Test");
        lList.remove("Cat");
        lList.remove("Test");
        assertTrue(lList.isEmpty());
    }
    /**
     * Test the getAt method 
     */
    public void testGetAt()
    {
        Exception thrown = null;
        try
        {
            lList.getAt(1);
        }
        catch(Exception e)
        {
            thrown = e;
        }
        assertNotNull(thrown);
        
        lList.add("Cat");
        lList.add("Dog");
        lList.add("Bus");
        assertEquals("Cat", lList.getAt(0));
        assertEquals("Dog", lList.getAt(1));
        assertEquals("Bus", lList.getAt(2));
    }
    /**
     * Test the clear Method
     */
    public void testClear()
    {
        assertEquals(0, lList.size());
        lList.add("HI");
        assertFalse(lList.isEmpty());
        lList.clear();
        assertTrue(lList.isEmpty());
    }
    /**
     * Test the toString method
     */
    public void testToString()
    {
        assertEquals("[]", lList.toString());
        lList.add("Test");
        assertEquals("[Test]", lList.toString());
        lList.add("Collin");
        assertEquals("[Test, Collin]", lList.toString());
    }
}
