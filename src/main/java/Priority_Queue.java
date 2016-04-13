/**
 * Created by emre on 4/12/16.
 */
import java.util.*;
public class Priority_Queue<E extends Comparable<E>> implements IntPriority_Queue<E>{

    private ArrayList<E> data;
    private Comparator<E> comp;

    public Priority_Queue(){
        data = new ArrayList<E>();
    }
    public Priority_Queue(Comparator<E> comp)
    {
        data = new ArrayList<E>();
        this.comp = comp;
    }

    private int compare(E left, E right)
    {
        return 0;
    }

    private void swap(int i , int j)
    {

    }

    public boolean offer(E element) {
        data.add(element);
        int child = data.size() - 1;
        int parent = (child - 1) / 2;

        while (parent >= 0 && compare(data.get(parent),data.get(child)) > 0 )
        {
            swap(parent,child);
            child = parent;
            parent = (child - 1) / 2 ;
        }
        return true;
    }

    public E remove(E element) {
        return null;
    }

    public E poll() {
        if(data.size() == 0)
            return null;
        E res = data.get(0);

        // sadece bir eleman varsa
        if(data.size() == 1)
        {
            data.remove(0);
            return res;
        }

        data.set(0,)

    }

    public E peek() {
        return null;
    }

    public E element() {
        return null;
    }
}
