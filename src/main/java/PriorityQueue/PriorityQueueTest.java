package PriorityQueue;

import java.util.ArrayList;
import java.util.Random;


/**
 * Created by emre on 4/14/16.
 */
public class PriorityQueueTest {
    public static void main(String[] argv)
     {
         PriorityQueueArrayList<Integer> queue = new PriorityQueueArrayList<Integer>();
         ArrayList<Integer> testresult = new ArrayList<Integer>();

         System.out.println("Testing with 10 elem ");
         long start = System.currentTimeMillis();
         Test(queue,10);
         testresult.add(new Integer((int) (System.currentTimeMillis() - start) ));

         System.out.println("Testing with 100 elem ");
         start = System.currentTimeMillis();
         Test(queue,100);
         testresult.add(new Integer((int) (System.currentTimeMillis() - start) ));

         System.out.println("Testing with 1000 elem ");
         start = System.currentTimeMillis();
         Test(queue,1000);
         testresult.add(new Integer((int) (System.currentTimeMillis() - start) ));

         System.out.println("Testing with 10000 elem ");
         start = System.currentTimeMillis();
         Test(queue,10000);
         testresult.add(new Integer((int) (System.currentTimeMillis() - start) ));

         System.out.println("Testing with 100000 elem ");
         start = System.currentTimeMillis();
         Test(queue,100000);
         testresult.add(new Integer((int) (System.currentTimeMillis() - start) ));

         System.out.println();
         System.out.println("##################################################");
         System.out.println("\t\t\t\t\t TEST RESULTS");
         System.out.println("Size \t\tElapsed Time");
         int size=10;
         for (Integer integer: testresult) {
             System.out.printf("%5d\t\t%s ms \n",size,integer.toString());
             size*=10;
         }
     }

    private static void Test(PriorityQueueArrayList queue, int testsize)
    {
        Random rand = new Random();
        for (int i = 0; i < testsize; ++i)
        {
            queue.offer(rand.nextInt(99999));
        }

        for (int i = 0; i < testsize; ++i){
            queue.poll();
        }
    }
}
