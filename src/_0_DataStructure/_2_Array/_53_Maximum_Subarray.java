package _0_DataStructure._2_Array;

/**
 * @author ting.wen
 * @create 2022-05-07 5:09 PM
 * @pkgName _0_DataStructure._2_Array
 * @Description
 */
public class _53_Maximum_Subarray {
    public static int maxSubArray(int[] nums) {

        int res = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            res = Math.max(res, sum);
            if (sum <= 0) {
                sum = 0;
            }
            System.out.println("sum = " + sum);
        }
        return res;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int res = maxSubArray(nums);
        System.out.println("res = " + res);
    }
}
