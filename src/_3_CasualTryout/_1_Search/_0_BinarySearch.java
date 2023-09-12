package _3_CasualTryout._1_Search;

import java.util.Arrays;

public class _0_BinarySearch {


    public static void main(String[] args) {
        int[] arr = new int[] {1,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59};
        int res = binarySearch(arr, 23);
        System.out.println("res = " + res);
        System.out.println();
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low)/2;

            if (arr[mid] > key) {
                high = mid - 1;
            }
            else if (arr[mid] < key) {
                low = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}

/*
二分查找（binary search），也称折半搜索，是一种在 有序数组 中 查找某一特定元素 的搜索算法。
搜索过程从数组的中间元素开始，如果中间元素正好是要查找的元素，则搜索过程结束；
如果某一特定元素大于或者小于中间元素，则在数组大于或小于中间元素的那一半中查找，而且跟开始一样从中间元素开始比较。
如果在某一步骤数组为空，则代表找不到。这种搜索算法每一次比较都使搜索范围缩小一半。

时间复杂度：logn
空间复杂度：1
 */
