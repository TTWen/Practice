package _0_DataStructure._4.Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author ting.wen
 * @create 2022-07-26 8:39 PM
 * @pkgName _0_DataStructure._4.Heap
 * @Description
 */
public class _2335_Minimum_Amount_of_Time_to_Fill_Cups {


    public static int fillCups(int[] amount) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(
                (a,b) -> (b-a)
        ); // 降序

        for (int am: amount) {
            priorityQueue.add(am);
        }


        int res = 0;
        while (priorityQueue.peek() > 0) {
            res++;

            int firsthigh = priorityQueue.poll();
            int secondhigh = priorityQueue.poll();

            if (firsthigh - 1 > 0)
                priorityQueue.add(firsthigh - 1);
            else
                priorityQueue.add(0);

            if (secondhigh - 1 > 0)
                priorityQueue.add(secondhigh - 1);
            else
                priorityQueue.add(0);
        }

        return res;
    }

    public static void main(String[] args) {

        int[] amount = new int[]{1,4,2};
        int res = fillCups(amount);
        System.out.println("res = " + res);
    }
}
