package _0_DataStructure._2_Array;

import java.util.Arrays;

/**
 * @author ting.wen
 * @create 2022-05-07 4:40 PM
 * @pkgName _0_DataStructure._2_Array
 * @Description
 */
public class _27_Remove_Element {

    public static int removeElement(int[] nums, int val) {

        int p = 0;

        for (int num: nums) {
            if (num != val) {
                nums[p++] = num;
            }
        }
        System.out.println(Arrays.toString(nums));

        return p;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums, 2));
    }
}
