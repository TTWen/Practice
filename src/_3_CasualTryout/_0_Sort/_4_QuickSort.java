package _3_CasualTryout._0_Sort;

import java.util.Arrays;

public class _4_QuickSort {

    public static void main(String[] args) {
        int[] arr= new int[] {9, 4, 5, 7, 2, 6, 8, 0, 1, 3};
        System.out.println(Arrays.toString(arr));

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        QuickSort(arr, 0, arr.length - 1);
    }


    public static void QuickSort(int[] arr, int left, int right) {

        if (left < right) {
            int i = left;
            int j = right;

            int temp = arr[left];

            while (i < j) {
                while (i < j && arr[j] >= temp)  {
                    j--;
                }
                if (i < j) {
                    arr[i] = arr[j];
                    i++;
                }
                while (i < j && arr[i] <= temp) {
                    i++;
                }
                if (i < j) {
                    arr[j] = arr[i];
                    j--;
                }
            }
            arr[i] = temp;

            QuickSort(arr, left, i - 1);
            QuickSort(arr, i + 1, right);
        }

    }

}


/*
最好/一般时间复杂度：
递归计算，可以类比二分法，那么递归到结束时，要计算递归深度h，2h次方=n，h=log以2为底的n
每层递归都会遍历整个数组，因此为n，
所以时间复杂度为nlog以2为底的n，约等于nlogn

最坏时间复杂度：
最坏的情况是数组本身是有序的
递归到第一层时，第一个数已经在其所应该在的位置，其左边为空，需要对右边所有数进行递归，递归到结束时，递归深度为n
时间复杂度为n²


快速排序是由东尼·霍尔所发展的一种排序算法。
在平均状况下，排序 n 个项目要 Ο(nlogn) 次比较。在最坏状况下则需要 Ο(n2) 次比较，但这种状况并不常见。
事实上，快速排序通常明显比其他 Ο(nlogn) 算法更快，因为它的内部循环（inner loop）可以在大部分的架构上很有效率地被实现出来。

快速排序使用分治法（Divide and conquer）策略来把一个串行（list）分为两个子串行（sub-lists）。

快速排序又是一种分而治之思想在排序算法上的典型应用。本质上来看，快速排序应该算是在冒泡排序基础上的递归分治法。

快速排序的名字起的是简单粗暴，因为一听到这个名字你就知道它存在的意义，就是快，而且效率高！它是处理大数据最快的排序算法之一了。


算法步骤
1、从数列中挑出一个元素，称为 "基准"（pivot）;
2、重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；
3、递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序；


 */
