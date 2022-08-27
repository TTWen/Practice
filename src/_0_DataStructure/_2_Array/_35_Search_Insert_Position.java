package _0_DataStructure._2_Array;

/**
 * @author ting.wen
 * @create 2022-05-07 4:51 PM
 * @pkgName _0_DataStructure._2_Array
 * @Description
 */
public class _35_Search_Insert_Position {

    public static int searchInsert(int[] nums, int target) {

        if (nums[0] >= target)
            return 0;

        if (nums.length == 1 && nums[0] < target) {
            return 1;
        }

        int pre = nums[0];
        int cur = nums[1];
        for (int i = 1; i < nums.length; i++) {
            pre = nums[i-1];
            cur = nums[i];
            if (cur >= target) {
                return i;
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {
        int[]nums = new int[]{1};
        int target = 1;

        int res = searchInsert(nums, target);
        System.out.println("res = " + res);
    }
}
