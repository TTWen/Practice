package _4_LC_hot100;

import java.util.Arrays;

public class _238_product_of_array_except_self {


    public static int[] productExceptSelf(int[] nums) {

        if (nums == null)
            return null;

        int len = nums.length;
        int[] ans = new int[len];

        int temp = 1;
        ans[0] = 1;

        for (int i = 1; i < len; i ++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        // 此时ans[i] 代表当前位左边所有的数值乘积，那么理所应当等于ans[i-1]*nums[i-1]


        System.out.println(temp);
        for (int i = len - 2; i >= 0; i--) {
            temp *=  nums[i + 1];
            System.out.println(temp);
            // 此时 temp 代表当前位右边所有数值乘积
            // i=2就是第三位，就是temp（即1）乘上num[3]第4位=4
            // i=1就是第二位，就是temp再乘上num[2]第3位=12
            // i=0就是第一位，就是temp再呈上num[1]第2位=24
            ans[i] *= temp; // 和上面算好的ans[i]乘到一起去
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4};
        System.out.println(Arrays.toString(nums));

        int [] ans = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));

    }
}
