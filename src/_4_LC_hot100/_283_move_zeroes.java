package _4_LC_hot100;

import java.util.Arrays;

/*
https://leetcode.cn/problems/move-zeroes/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class _283_move_zeroes {


    public static void main(String[] args) {
        int[] nums = new int[] {0,1,0,3,12};
        moveZeroes(nums);

        System.out.println("res:" + Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        for (; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
