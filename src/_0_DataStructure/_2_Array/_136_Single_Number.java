package _0_DataStructure._2_Array;

/**
 * @author ting.wen
 * @create 2022-05-11 10:53 PM
 * @pkgName _0_DataStructure._2_Array
 * @Description
 */

/**
 * ^ 异或运算：两位相等，则等于0，两位不相等，则等于 1
 * 0 ^ n = n
 * n ^ n = 0
 *
 * N1 ^ N1 ^ N2 ^ N2 ^..............^ Nx ^ Nx ^ N
 * = (N1^N1) ^ (N2^N2) ^..............^ (Nx^Nx) ^ N
 * = 0 ^ 0 ^ ..........^ 0 ^ N
 * = N
 */
public class _136_Single_Number {

    public static int singleNumber(int[] nums) {

        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {

        int[] nums = new int[] {4,1,2,1,2};
        int res = singleNumber(nums);
        System.out.println("res = " + res);
    }
}
