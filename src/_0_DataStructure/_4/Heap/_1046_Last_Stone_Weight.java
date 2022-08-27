package _0_DataStructure._4.Heap;

import java.util.PriorityQueue;

/**
 * @author ting.wen
 * @create 2022-07-18 8:38 PM
 * @pkgName _0_DataStructure._4.Heap
 * @Description
 */
public class _1046_Last_Stone_Weight {

    public static int lastStoneWeight(int[] stones) {

       PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b)-> b - a); // 默认是小顶堆
       for (int stone: stones) {
           priorityQueue.add(stone);
       }

       while (priorityQueue.size() > 1) {
           int first = priorityQueue.poll();
           int sec = priorityQueue.poll();

           priorityQueue.add(first - sec);
       }

       return priorityQueue.poll();

    }

    /**
     * 所有元素都放入优先队列
     * 取出最大的两个元素，算出差值，放回队列
     * 直到队列中元素小于2个
     * @param args
     */
    public static void main(String[] args) {

        int[] stones = new int[]{2,7,4,1,8,1};

        int res = lastStoneWeight(stones);
        System.out.println("res = " + res);
    }
}
