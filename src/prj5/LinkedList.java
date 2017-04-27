package prj5;

/**
 * This is a list class implemented by linked node. This class provides methods
 * to get, insert, and remove entries at a specific position of the list.
 * 
 * @author Collin Smith (smithcol)
 * @version 04.26.2017
 * @param <T> - generic
 */
public class LinkedList<T> {
    private static class Node<T> {
        // The data element stored in the node.
        private T data;
        // The next node in the sequence.
        private Node<T> next;

        /**
         * Creates a new node with the given data
         *
         * @param data
         *            the data to put inside the node
         */
        public Node(T data) {
            this.data = data;
        }

        /**
         * Sets the node after this node
         *
         * @param next
         *            the node after this one
         */
        public void setNext(Node<T> next) {
            this.next = next;
        }

        /**
         * Gets the next node
         *
         * @return the next node
         */
        public Node<T> next() {
            return next;
        }

        /**
         * Gets the data in the node
         *
         * @return the data in the node
         */
        public T getData() {
            return data;
        }
    }

    // ~ Fields
    // the head of the linked list
    private Node<T> head;
    // the size of the linked list
    private int size;

    // Constructor
    /**
     * new a LList
     */
    public LinkedList() {
        head = null;
        size = 0;
    }

    /**
     * get the size list
     * 
     * @return the size of the list
     */
    public int size() {
        return size;
    }

    /**
     * add an entry to a specific position
     * 
     * @param index
     *            is where to add the entry
     * @param enTry
     *            is the entry to be added
     */
    public void add(int index, T enTry) {
        Node<T> current = head;
        // empty stack case
        if (isEmpty()) {
            head = new Node<T>(enTry);
        }
        else if (index == 0) {
            Node<T> newNode = new Node<T>(enTry);
            head = newNode;
            newNode.setNext(current);
        }
        // all other cases
        else {
            int currentIndex = 0;
            while (current != null) {
                if (index == currentIndex + 1) {
                    Node<T> nextNext = current.next;
                    Node<T> newNode = new Node<T>(enTry);
                    current.setNext(newNode);
                    newNode.setNext(nextNext);
                }
                current = current.next();
                currentIndex++;
            }
        }
        size++;
    }

    /**
     * add an entry to the end of the list
     * 
     * @param enTry
     *            the entry to be added
     */
    public void add(T enTry) {
        Node<T> current = head;
        // empty stack case
        if (isEmpty()) {
            head = new Node<T>(enTry);
        }
        // other cases
        else {
            for (int i = 0; i < size - 1; i++) {
                current = current.next;

            }
            current.setNext(new Node<T>(enTry));
        }
        size++;
    }

    /**
     * check whether the list is empty
     * 
     * @return true if the list is empty
     */
    public boolean isEmpty() {
        return (size == 0);
    }

    /**
     * remove a certain object
     * 
     * @param obj
     *            the object to to removed
     * @return true if the object is removed
     */
    public boolean remove(T obj) {
        Node<T> current = head;
        // account for matching head
        if ((head != null) && (obj.equals(current.data))) {
            head = head.next;
            size--;
            return true;
        }
        // account for 2+ size
        while (size() >= 2 && null != current.next) {
            if (current.next.data.equals(obj)) {
                if (current.next.next != null) {
                    current.setNext(current.next.next);
                }
                else {
                    current.setNext(null);
                }
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * get an object at a position as index shows
     * 
     * @param index
     *            is the position of the object
     * @return the object at that position
     */
    public T getAt(int index) {
        Node<T> current = head;
        int currentIndex = 0;
        T data = null;
        while (null != current) {
            if (index == currentIndex) {
                data = current.data;
            }
            currentIndex++;
            current = current.next;
        }
        // check if the data was null...
        if (null == data) {
            // ... if so throw an exception
            throw new IndexOutOfBoundsException("Index exceeds the size.");
        }
        return data;
    }

    /**
     * Removes all of the elements from the list
     */
    public void clear() {
        // make sure we don't call clear on an empty list
        if (head != null) {
            head.setNext(null);
            head = null;
        }
        size = 0;
    }

    /**
     * Returns a string representation of the list If a list contains A, B, and
     * C, the following should be returned "{A, B, C}" (Without the quotations)
     *
     * @return a string representing the list
     */
    public String toString() {
        String result = "[";
        Node<T> current = head;
        while (null != current) {
            result += current.getData();
            current = current.next;
            if (null != current) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

}