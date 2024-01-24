package _4_LC_hot100;

import java.util.HashSet;

public class _128_longest_consecutive_sequence {
    public static void main(String[] args) {
        int[] nums = new int[] {100,4,200,1,3,2}; // 0,3,7,2,5,8,4,6,0,1
        int res = longestConsecutive(nums);
        System.out.println("res = " + res);
    }

    public static int longestConsecutive(int[] nums) {

        if (nums == null) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }

        int res = 0;

        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }

        for (int num : nums) {
            if (hashSet.contains(num - 1)) {
                continue;
            }
            else {
                int start = num;
                int cnt = 0;
                while (hashSet.contains(start++)) {
                    cnt ++;
                }
                res = Math.max(res, cnt);
            }
        }
        return res;
    }
}

/*
遍历数组放到 HashSet 中
遍历数组，判断是否有比当前数字小的数字：
有的话，pass掉，因为我们要找到连续序列的第一个数字
如果没有比当前数字小的数字，说明当前数字就是连续序列的第一个数字，那么从当前数字开始往后遍历，判断是否在HashSet中，来得到连续序列的长度
 */
