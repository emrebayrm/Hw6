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
        if ( comp != null)
            return comp.compare(left,right);
        return left.compareTo(right);
    }

    public boolean offer(E element) {
        if(data.size() == 0)
            data.add(element);
        else if (data.size() == 1)
        {
            if(compare(data.get(0),element) >= 0)
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
                else if(compare(element,data.get(i)) >= 0)
                {
                    data.add(i,element);
                    flag = true;
                }


                ++i;
            }
        }
        return true;
    }

    public E remove(E element) {
        data.remove(element);
        return null;
    }

    public E poll() {
        if(data.size() == 0)
            return null;
        return data.remove(data.size() - 1);
    }

    public E peek() {
        return data.get(data.size() - 1);
    }

    public E element() {
        return peek();
    }
}
