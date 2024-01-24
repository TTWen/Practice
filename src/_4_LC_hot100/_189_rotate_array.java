package _4_LC_hot100;

import java.util.Arrays;

public class _189_rotate_array {

    public static void rotate1(int[] nums, int k) {

        int len = nums.length;
        k = k % len;

        int[] temp = new int[len];

        for (int i = len - k; i < len; i++) {
            temp[i - len + k] = nums[i];
        }
        for (int i = 0; i < len - k; i++ )  { // 0,1,2,3
            temp[k + i] = nums[i];
        }

        for (int i = 0; i < len; i++) {
            nums[i] = temp[i];
        }

//        System.out.println(Arrays.toString(temp));

    }
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5,6,7};
        int k = 3;

        System.out.println(Arrays.toString(nums));
        rotate1(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
