package _0_DataStructure._2_Array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author ting.wen
 * @create 2022-04-25 11:26 PM
 * @pkgName _0_DataStructure._2_Array
 * @Description
 */
public class _1_Two_Sum {


    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                res[1] = i;
                res[0] = hashMap.get(target - nums[i]);
                return res;
            }
            System.out.println(nums[i] + "------" + i);
            hashMap.put(nums[i], i);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int[] res = twoSum(nums, 18);
        System.out.println("res:" + Arrays.toString(res));
    }
}
