import java.util.*;

/**
 * A testbed for comparing ArrayList and LinkedList implementations of queue and stack.
 * 
 * @author ces
 * @date 3/2014
 *
 */
public class Queue<K>
{
    /**
     * A simple implementation of queue, generalised to any type of element. 
     */
    
    private List<K> elements;

    /**
     * Construct a new queue. This should initialise the empty queue.
     */
    public Queue() {
        /* add body of constructor here */
   } // constructor

    /**
     * Gets the number of elements in the queue.
     * 
     * @return the number of elements in the queue.
     */
     public int howMany() { 
        /* add body of howMany here */     
        } // howMany
  
    
    /**
     * Add a new element to the end of the queue.
     *
     * @param o the object to enqueue.
     */
    public void enqueue(K k) {
        /* add body of enqueue here */
    } // enqueue
   
   
    /**
     * Get the next element from the front of the queue.
     *
     * @return the next element in the queue.
     */
   public K dequeue() {
        /* add body of dequeue here */
    } // dequeue
}

