package prj5;

import student.TestCase;

/**
 * Test class for Song List
 * 
 * @author group48
 * @version 4/27/2017
 *
 */
public class SongListTest extends TestCase {
    private LinkedList<String> list;
    private String str1;
    private String str2;

    /**
     * set up the objects for testing
     */
    public void setUp() {
        list = new LinkedList<String>();
        str1 = "a";
        str2 = "b";
    }

    /**
     * test the size method
     */
    public void testSize() {
        assertEquals(0, list.size());
        list.add(str1);
        assertEquals(1, list.size());
        list.add(str2);
        list.add("Car");
        assertEquals(3, list.size());
    }


    /**
     * test the add method with position
     */
    public void testAddIndex() {
        list.add(0, str1);
        assertEquals(1, list.size());

        list.add(1, str2);
        assertEquals(2, list.size());
 
        list.add(1, "Table");
        assertEquals(3, list.size());

        list.add(2, "Cat");
        assertEquals(4, list.size());

    }


    /**
     * test add with just item
     */
    public void testAdd() {
        list.add(str1);
        assertEquals(1, list.size());
        list.add(str2);
        assertEquals(2, list.size());
        list.add("Bryan");
        assertEquals(3, list.size());

    }


    /**
     * test the isEmpty method
     */
    public void testEmpty() {
        assertTrue(list.isEmpty());
        list.add(str1);
        assertFalse(list.isEmpty());
    }


    /**
     * test remove method
     */
    public void testRemove() {
        assertFalse(list.remove("Beat"));
        list.add(str1);
        list.add(str2);
        list.add("Bear");
        assertTrue(list.remove("Bear"));
        list.add("War");
        assertTrue(list.remove(str1));
        assertEquals(2, list.size());

        list.add(0, str1);
        assertEquals(3, list.size());
        assertTrue(list.remove(str2));
        list.add(1, str2);
        list.add("car");
        assertTrue(list.remove("car"));
        assertFalse(list.remove("x"));
        assertTrue(list.remove("War"));
    }


    /**
     * test the get at method
     */
    public void testGet() {
        list.add(str1);
        list.add(str2);
        list.add("Tack");

        assertEquals(str1, list.getAt(0));
        assertEquals(str2, list.getAt(1));
        assertEquals("Tack", list.getAt(2));

        Exception thrown = null;
        try {
            list.getAt(3);
        }
        catch (Exception exception) {
            thrown = exception;
        }
        assertNotNull(thrown);

    }


    /**
     * test the clear method
     */
    public void testClear() {
        list.clear();
        assertEquals(list.size(), 0);
        list.add(str1);
        list.add(str2);
        assertEquals(list.size(), 2);
        list.clear();
        assertEquals(list.size(), 0);
    }
}
