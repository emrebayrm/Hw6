package PriorityQueue;

import main.huffmantrees.BinaryTree;

import java.util.Comparator;

/**
 * Created by emre on 4/15/16.
 */
public class PriorityQueueBinaryTree<E extends Comparable<E>> implements IntPriority_Queue<E> {

    private BinaryTree data;
    private Comparator<E> comparator;

    public PriorityQueueBinaryTree() {
        data = new BinaryTree();
        comparator = null;
    }

    public PriorityQueueBinaryTree(Comparator<E> comparator) {
        data = new BinaryTree();
        this.comparator = comparator;
    }

    /**
     * Compares two object
     * @param left left operand
     * @param right right operand
     * @return returns if equal returns 0 if left bigger than right positive integer
     * otherwise return negative integer
     */
    private int compare(E left , E right)
    {
        if ( comparator != null)
            return comparator.compare(left,right);
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
        return null;
    }

    public E poll() {
        return null;
    }

    public E peek() {
        return null;
    }

    public E element() {
        return null;
    }
}
