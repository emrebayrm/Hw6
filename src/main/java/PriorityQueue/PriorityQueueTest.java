package PriorityQueue;

import java.util.ArrayList;
import java.util.Random;


/**
 * Created by emre on 4/14/16.
 */
public class PriorityQueueTest {
    public static void main(String[] argv)
    {
         ArrayList<ArrayList<Long>> TestResult = new ArrayList<ArrayList<Long>>();

         PriorityQueueArrayList<Integer> arrayList = new PriorityQueueArrayList<Integer>();
         PriorityQueueVector<Integer> priorityQueueVector = new PriorityQueueVector<Integer>();
    //   PriorityQueueLinkedList<Integer> priorityQueueLinkedList = new PriorityQueueBinaryTree<Integer>();
         PriorityQueueLinkedList<Integer> priorityQueueLinkedList = new PriorityQueueLinkedList<Integer>();

         TestResult.add(TestPriorityQueue(arrayList));
         TestResult.add(TestPriorityQueue(priorityQueueVector));
         TestResult.add(TestPriorityQueue(priorityQueueLinkedList));
    //   TestResult.add(TestPriorityQueue(priorityQueueBinaryTree));

         System.out.println();
         System.out.println("##################################################");
         System.out.println("\t\t\t\t\t TEST RESULTS");
         System.out.println("\t\t using ArrayList \t\t using Vector \t\t using LinkedList");
         System.out.println("Size\toffer \t poll \t\toffer \t Poll \t\t Offer \t\t poll");
         int size=10;
        for (int i = 0; i < TestResult.get(0).size(); i+=2,size *= 10) {
            System.out.printf("%6d\t%6d\t%6d\t\t%6d\t%6d\t\t%6d\t%6d\n",size
                    ,TestResult.get(0).get(i),TestResult.get(0).get(i+1),TestResult.get(1).get(i),TestResult.get(1).get(i+1),
                    TestResult.get(2).get(i),TestResult.get(2).get(i+1));
        }

     }

    private static long Testoffer(IntPriority_Queue queue, int testsize)
    {
        System.out.println("Testing Offer Time");
        long start = System.currentTimeMillis();
        Random rand = new Random();
        for (int i = 0; i < testsize; ++i)
        {
            queue.offer(rand.nextInt(99999));
        }
        return (System.currentTimeMillis() - start);
    }

    private static long TestPoll(IntPriority_Queue queue, int testsize)
    {
        System.out.println("Testing Poll Time");
        long start = System.currentTimeMillis();
        Random rand = new Random();
        for (int i = 0; i < testsize; ++i)
        {
            queue.poll();
        }
        return (System.currentTimeMillis() - start);
    }

    private static ArrayList<Long> TestPriorityQueue(IntPriority_Queue queue)
    {
        ArrayList<Long> arrayList = new ArrayList<Long>();
        int TestSize = 10;
        System.out.println("\n Testing "+ queue.getClass() +"\n");
        for(int i = 0; i < 4; ++i) {
            System.out.println("Testing with " + TestSize + " elem ");
            arrayList.add(Testoffer(queue, TestSize));
            arrayList.add(TestPoll(queue, TestSize));
            TestSize *= 10;
        }

        return arrayList;
    }

}
