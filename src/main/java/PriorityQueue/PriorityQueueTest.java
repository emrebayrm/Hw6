package PriorityQueue;

import PriorityQueue.IntPriority_Queue;

import java.util.Random;

/**
 * Created by emre on 4/14/16.
 */
public class PriorityQueueTest {
    public static void main(String[] argv)
     {
         Priority_Queue<Integer> queue = new Priority_Queue<Integer>();
         Random rand = new Random();
         for (int i = 0; i < 10000; ++i)
         {
             queue.offer(rand.nextInt(99999));
         }

         for (int i = 0; i < 10000; ++i){
             System.out.println(queue.poll());
         }
     }
}
