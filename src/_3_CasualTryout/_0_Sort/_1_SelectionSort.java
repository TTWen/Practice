package _3_CasualTryout._0_Sort;

import java.util.Arrays;

/*
选择排序是一种简单直观的排序算法，无论什么数据进去都是 O(n²) 的时间复杂度。所以用到它的时候，数据规模越小越好。
唯一的好处可能就是不占用额外的内存空间了吧。

算法步骤
首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。
再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
重复第二步，直到所有元素均排序完毕。
 */
public class _1_SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[] {9,4,5,7,2,6,8,0,1,3};
        System.out.println("🚩🚩🚩"+Arrays.toString(arr));

        sort(arr);

        System.out.println("🚩🚩🚩"+Arrays.toString(arr));
    }

    // 遍历后面的数组找到最小值的下标

    // 如果最小值的下标和 i 不一样就交换
    public static void sort(int[] arr) {
        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;

            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}

/*
时间复杂度：n²
空间复杂度：1
 */