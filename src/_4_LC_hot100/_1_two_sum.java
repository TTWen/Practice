package _4_LC_hot100;

import java.util.Arrays;
import java.util.HashMap;

/*
https://leetcode.cn/problems/two-sum/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class _1_two_sum {

    public static void main(String[] args) {
        int[] nums = new int[] {2,7,6,15};
        int target = 9;

        int[] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) {
            return null;
        }

        int [] res = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                res[0] = i;
                res[1] = hashMap.get(nums[i]);
//                System.out.println(Arrays.toString(res));
                return res;
            }
            hashMap.put(target - nums[i], i);
        }
        return null;
    }
}
/**
 * 由于哈希查找的时间复杂度为 O(1)O(1)O(1)，所以可以利用哈希容器 map 降低时间复杂度
 * 遍历数组 nums，i 为当前下标，每个值都判断map中是否存在 target-nums[i] 的 key 值
 * 如果存在则找到了两个值，如果不存在则将当前的 (nums[i],i) 存入 map 中，继续遍历直到找到为止
 *
 * nums[i] = 2, hashMap 不包含 2，hashMap 进入 (7,0)，当遇到7的时候要去找下标为0的那一位
 */
