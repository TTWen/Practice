package _0_DataStructure._4.Heap;

import java.util.Arrays;

/**
 * @author ting.wen
 * @create 2022-07-26 8:19 PM
 * @pkgName _0_DataStructure._4.Heap
 * @Description
 */

// 找到右边比左边大的，而且奇偶性一致的
public class _2231_Largest_Number_After_Digit_Swaps_by_Parity {


    public static int largestInteger(int num) {

        char[] chars = String.valueOf(num).toCharArray();

        for(int i = 0; i < chars.length; i++) {
            for (int j = i+1; j < chars.length; j++) {
                if ((chars[j] > chars[i]) && ((chars[j] - chars[i])%2 == 0)) {
                    char c = chars[i];
                    chars[i] = chars[j];
                    chars[j] = c;
                }
            }
        }

        return Integer.parseInt(new String(chars));
    }


    public static void main(String[] args) {

        int num = 65875;
        int res = largestInteger(num);
        System.out.println("res = " + res);
    }
}
