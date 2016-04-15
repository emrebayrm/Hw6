/**
 * Created by emre on 4/12/16.
 */

package PriorityQueue;

import java.util.ArrayList;
import java.util.Comparator;

public interface IntPriority_Queue<E extends Comparable <E>> {
    /**
     * Adds New Element to Queue
     * @param element
     * @return returns true or false
     */
    boolean offer(E element);

    /**
     * Removes the element in queue
     * @param element will add
     * @return returns added element or null
     */
    E remove(E element);

    /**
     * it pulls in front of queue
     * @return  returns removed elem
     */
    E poll();

    /**
     * At the top of elem actually in front of queue
     * @return returns in front of queue
     */
    E peek();

    /**
     * Same as peek
     * @return
     */
    E element();
}
