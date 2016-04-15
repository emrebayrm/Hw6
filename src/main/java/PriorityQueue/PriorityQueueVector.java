package PriorityQueue;

import java.util.Comparator;
import java.util.Vector;

/**
 * Created by emre on 4/15/16.
 */
public class PriorityQueueVector<E extends Comparable<E>> implements IntPriority_Queue<E>
{
    private Vector<E> data;
    private Comparator<E> comp;

    public PriorityQueueVector()
    {
        data = new Vector<E>();
        comp = null;
    }

    public PriorityQueueVector(Comparator<E> comp)
    {
        data = new Vector<E>();
        this.comp = comp;
    }

    /**
     * Compares two object
     * @param left left operand
     * @param right right operand
     * @return returns if equal returns 0 if left bigger than right positive integer
     * otherwise return negative integer
     */
    private int compare(E left, E right)
    {
        if ( comp != null)
            return comp.compare(left,right);
        return left.compareTo(right);
    }

    public boolean offer(E element) {
        try {
            if(data.size() == 0)
                data.add(element);
            else if (data.size() == 1)
            {
                if(compare(data.get(0),element) <= 0)
                    data.add(element);
                else
                    data.add(0,element);
            }
            else{
                int i = 0;
                boolean flag = false;
                while(!flag ){
                    if(i >= data.size())
                    {
                        flag = true;
                        data.add(element);
                    }
                    else if(compare(element,data.get(i)) <= 0)
                    {
                        data.add(i,element);
                        flag = true;
                    }
                    ++i;
                }
            }
            return true;
        }
        catch (Exception ex)
        {
            return false;
        }
    }

    public E remove(E element) {
        if(data.remove(element))
            return element;
        return null;
    }

    public E poll() {
        if(data.size() == 0)
            return null;
        return remove(data.get(0));
    }

    public E peek() {
        return data.get(0);
    }

    public E element() {
        return peek();
    }
}
