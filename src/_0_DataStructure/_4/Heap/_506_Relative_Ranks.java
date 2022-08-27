package _0_DataStructure._4.Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author ting.wen
 * @create 2022-06-19 9:36 PM
 * @pkgName _0_DataStructure._4.Heap
 * @Description
 */
public class _506_Relative_Ranks {
    public static String[] findRelativeRanks(int[] score) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(
                (a, b) -> score[b] - score[a]
        );
        for (int i = 0; i < score.length; i++) {
            priorityQueue.add(i);
        }

        String [] res = new String[score.length];

        int order = 1;
        while (!priorityQueue.isEmpty()) {
            int index = priorityQueue.poll();
            if (order == 1) {
                res[index] = "Gold Medal";
            }
            else if (order == 2){
                res[index] = "Silver Medal";
            }
            else if (order == 3) {
                res[index] = "Bronze Medal";
            } else {
                res[index] = Integer.toString(order);
            }
            order ++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] score = new int[] {10,3,8,9,4};
        // score: 10,9,8,4,3
        // priqu: 0,3,2,4,1
        // res:   go,5,bro,sil,4

        String[] res = findRelativeRanks(score);

        System.out.println("res = " + Arrays.toString(res));
    }

}
