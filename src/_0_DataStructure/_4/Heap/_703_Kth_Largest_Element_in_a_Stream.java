package _0_DataStructure._4.Heap;

import java.util.PriorityQueue;

/**
 * @author ting.wen
 * @create 2022-06-19 11:01 PM
 * @pkgName _0_DataStructure._4.Heap
 * @Description
 */
public class _703_Kth_Largest_Element_in_a_Stream {

    int k;
    PriorityQueue <Integer> priorityQueue;

    public  _703_Kth_Largest_Element_in_a_Stream(int k, int[] nums) {
        this.k = k;
        priorityQueue = new PriorityQueue<>(k);
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (priorityQueue.size() < k) {
            priorityQueue.offer(val);
        }
        else if (priorityQueue.peek() < val) {
            priorityQueue.poll();
            priorityQueue.add(val);
        }

        return priorityQueue.peek();
    }

    public static void main(String[] args) {
        int k = 3;
        int nums[] = new int[]{4, 5, 8, 2};
        _703_Kth_Largest_Element_in_a_Stream obj = new _703_Kth_Largest_Element_in_a_Stream(k, nums);
        System.out.println(obj.add(3));
        System.out.println(".......");
        System.out.println(obj.add(5));
        System.out.println(".......");
        System.out.println(obj.add(10));
        System.out.println(".......");
        System.out.println(obj.add(9));
        System.out.println(".......");
        System.out.println(obj.add(4));
    }
}
