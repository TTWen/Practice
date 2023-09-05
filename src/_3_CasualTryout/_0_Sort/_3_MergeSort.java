package _3_CasualTryout._0_Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _3_MergeSort {
    public static void main(String[] args) {
        int[] arr= new int[] {9, 4, 5, 7, 2, 6, 8, 0, 1, 3};
        System.out.println(Arrays.toString(arr));

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

   public static void sort(int[] arr) {
        int[] res = MergeSort(arr, 0, arr.length - 1);

       for (int i = 0; i < res.length; i++) {
           arr[i] = res[i];
       }
   }

   // 对数组 arr 中的 left->right进行排序，递归
   public static int[] MergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            int[] l = MergeSort(arr, left, mid);
            int[] r = MergeSort(arr, mid + 1, right);

            return merge(l, r);
        }
        return new int[] { arr[left] };
   }

   // 合并两个有序数组
   public static int[] merge(int[]l, int[] r) {
        int[] res = new int[l.length + r.length];

        int i = 0, j = 0, index = 0;
        while (i < l.length && j < r.length) {
            if (l[i] < r[j]) {
                res[index++]= l[i++];
            }
            else {
                res[index++] = r[j++];
            }
        }
        while (i < l.length) {
            res[index++] = l[i++];
        }
        while (j < r.length) {
            res[index++] = r[j++];
        }
        return res;
   }
}

/*
归并排序（Merge sort）是建立在归并操作上的一种有效的排序算法。该算法是采用分治法（Divide and Conquer）的一个非常典型的应用。

作为一种典型的分而治之思想的算法应用，归并排序的实现由两种方法：

自上而下的递归（所有递归的方法都可以用迭代重写，所以就有了第 2 种方法）；
自下而上的迭代；


归并排序（MERGE-SORT）是建立在归并操作上的一种有效的排序算法,该算法是采用分治法（Divide and Conquer）的一个非常典型的应用。
将已有序的子序列合并，得到完全有序的序列；即先使每个子序列有序，再使子序列段间有序。若将两个有序表合并成一个有序表，称为二路归并。



时间复杂度：nlogn
空间复杂度：
 */
