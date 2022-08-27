package _0_DataStructure._4.Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author ting.wen
 * @create 2022-07-18 8:54 PM
 * @pkgName _0_DataStructure._4.Heap
 * @Description
 */

/**
 * 1都在0的左边
 */
public class _1337_The_K_Weakest_Rows_in_a_Matrix {

    public static int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(
                (a, b) -> a[0]!=b[0] ? a[0] - b[0] : a[1] - b[1]
        );

        int pos = 0;
        for (int[] row : mat) {
            int low = 0;
            int high = row.length;
            while (low < high) {
                int mid = (low + high) / 2;
                if (row[mid] != 0)
                    low = mid+1;
                else
                    high = mid;
            }
            priorityQueue.add(new int[]{low, pos++});
        }

//        while (!priorityQueue.isEmpty()){
//            System.out.println(Arrays.toString(priorityQueue.poll()));;
//        }

        int[] output = new int[k];
        for (int i = 0; i < k; i++) {
            output[i] = priorityQueue.poll()[1];
        }


        return output;
    }

    public static void main(String[] args) {
        int[][]mat = new int[][] {
                {1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}};
        int k = 3;

        int [] res = kWeakestRows(mat, k);
        System.out.println(Arrays.toString(res));
    }
}
