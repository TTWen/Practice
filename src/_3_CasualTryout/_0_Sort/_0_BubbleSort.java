package _3_CasualTryout._0_Sort;

import java.util.Arrays;

public class _0_BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[] {9,4,5,7,2,6,8,0,1,3};
        System.out.println(Arrays.toString(arr));

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}
/*
因为j要和j+1比较，所以j最大只能是length-2（即8），所以最外层的i一定要<length-1

时间复杂度：n²
空间复杂度：1
 */