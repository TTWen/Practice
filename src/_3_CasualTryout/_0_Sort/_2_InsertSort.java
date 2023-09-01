package _3_CasualTryout._0_Sort;

import java.util.Arrays;

/*
插入排序的代码实现虽然没有冒泡排序和选择排序那么简单粗暴，但它的原理应该是最容易理解的了，因为只要打过扑克牌的人都应该能够秒懂。
插入排序是一种最简单直观的排序算法，它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。

插入排序和冒泡排序一样，也有一种优化算法，叫做拆半插入。


算法步骤
将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。

从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。
（如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）
 */
public class _2_InsertSort {

    public static void main(String[] args) {
        int[] arr = new int[]{9, 4, 5, 7, 2, 6, 8, 0, 1, 3};
        System.out.println("🚩🚩🚩" + Arrays.toString(arr));

        sort(arr);

        System.out.println("🚩🚩🚩" + Arrays.toString(arr));
    }


    public static void sort(int[] arr) {
//        第一个数字是有序的
        for (int i = 1; i < arr.length; i++) {
            int target = arr[i];

            int j = i;
            while (j > 0 && arr[j - 1] > target) {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = target;
        }


    }
}




/*
第一个下标为0的元素默认有序
从下标为1的元素往后依次就是待插入的元素
对于每一个元素下标为i，再遍历前面有序的数组，
前面有序数组最大下标为j，j=i
从右往左依次找到比其小的数，就是发现arr[j-1]>target，就要把arr[j-1]后移到arr[j]，同时 j--
直到发现arr[j-1]比target小的，说明，arr[j]就是要插入target的地方，
不用担心覆盖arr[j]，因为arr[j]已经赋值给arr[j+1]了

时间复杂度：n²
空间复杂度：1
 */