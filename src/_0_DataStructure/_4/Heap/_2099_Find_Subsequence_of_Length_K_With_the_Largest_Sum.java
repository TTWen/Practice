package _0_DataStructure._4.Heap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author ting.wen
 * @create 2022-07-25 8:48 PM
 * @pkgName _0_DataStructure._4.Heap
 * @Description
 */

/**
 * (a,b)
 * a 存放 值
 * b 存放 下标
 */
public class _2099_Find_Subsequence_of_Length_K_With_the_Largest_Sum {

    public static int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(
                (a,b) -> (a[0]-b[0])
        );

        for (int i = 0; i < nums.length; i++) {
            priorityQueue.add(
                    new int[] {nums[i], i}
            );
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }

        Set<Integer> hashSet = new HashSet<>();

        while (!priorityQueue.isEmpty()) {
            hashSet.add(priorityQueue.poll()[1]);
        }

        int p = 0;
        int result[] = new int[k];
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(i)) {
                result[p] = nums[i];
                p++;
            }
        }
        return result;
    }

//    要按照原有的顺序输出子序列
    public static void main(String[] args) {

        int nums[] = new int[] {3,4,3,3};
        int k = 2;
        int [] res = maxSubsequence(nums, k);
        System.out.println(Arrays.toString(res));
    }
}
