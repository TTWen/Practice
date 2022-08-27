package _0_DataStructure._1_Stack;

/**
 * @author ting.wen
 * @create 2022-04-20 11:23 PM
 * @pkgName _0_DataStructure._1_Stack
 * @Description
 */

import java.util.Stack;

/**
 * 去除【同一个字母小写+同一个字母大写】的情况
 * leEeetcode
 * leetcode
 *
 * abBAcC
 * ""
 * s
 * s
 *
 *
 * a 32
 * A 0
 */
public class _1544_Make_The_String_Great {

    public static String makeGood(String s) {
        if (s.length() <= 1)
            return s;

        char[] chars = s.toCharArray();

        Stack<Character>stack = new Stack<>();
        for (char ch: chars) {
            if (stack.isEmpty()) {
                stack.push(ch);
            }
            else {
                if (Math.abs(stack.peek() - ch) == 32) {
                    stack.pop();
                }
                else {
                    stack.push(ch);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {

        String s = "a";
        String res = makeGood(s);
        System.out.println("res = " + res);


    }
}
