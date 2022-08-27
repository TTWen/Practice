package _0_DataStructure._2_Array;

/**
 * @author ting.wen
 * @create 2022-05-05 5:00 PM
 * @pkgName _0_DataStructure._2_Array
 * @Description
 */

import java.util.Arrays;

/**
 * 0,0,1,1,1,2,2,3,3,4
 *
 * i 是一个指针
 * for 循环也包含一个指针
 *
 * 如果当前值 n 比 nums[i-1] 大，把当前值 n 赋给 nums[i]，i 再 ++
 */
public class _26_Remove_Duplicates_from_Sorted_Array {

    public static int removeDuplicates(int[] nums) {

        int i = 1;
        for (int num: nums) {
            if (num > nums[i-1]) {
                nums[i++] = num;
            }
        }



        return i;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int res = removeDuplicates(nums);
        System.out.println("res = " + res);
    }
}
