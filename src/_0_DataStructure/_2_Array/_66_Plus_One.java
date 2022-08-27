package _0_DataStructure._2_Array;

import java.util.Arrays;

/**
 * @author ting.wen
 * @create 2022-05-07 5:19 PM
 * @pkgName _0_DataStructure._2_Array
 * @Description
 */

/**
 * 如果需要扩充长度，即进位，那后面一定都进位了，后面全为 0
 */
public class _66_Plus_One {
    public static int[] plusOne(int[] digits) {

//        for (int i = digits.length - 1; i >= 0; i--) {
//            if (digits[i] < 9) {
//                digits[i] ++;
//                return digits;
//            }
//            else {
//                digits[i] = 0; // 进入下一次循环
//            }
//        }
//
//        int[] res = new int[digits.length + 1];
//        res[0] = 1;
//        return res;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] ++;
                return digits;
            }
            else {
                digits[i] = 0;
            }
        }

        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        int[]digits = new int[]{3,8,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
