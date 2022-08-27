package _0_DataStructure._3.Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ting.wen
 * @create 2022-06-06 10:46 PM
 * @pkgName _0_DataStructure._3.Queue
 * @Description
 */
public class _387_First_Unique_Character_in_a_String {

    public static int firstUniqChar(String s) {

        char[] chars = s.toCharArray();
        int[] fre = new int[26];

        for (char c: chars) {
            fre[c - 'a'] ++;
        }
        System.out.println(Arrays.toString(fre));

        for (int i = 0; i < chars.length; i++) {
            if (fre[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int res = firstUniqChar(s);
        System.out.println("res = " + res);
    }
}
