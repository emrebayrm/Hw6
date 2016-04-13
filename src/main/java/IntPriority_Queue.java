/**
 * Created by emre on 4/12/16.
 */
public interface IntPriority_Queue<E> {
    boolean offer(E element);
    E remove(E element);
    E poll();
    E peek();
    E element();
}
