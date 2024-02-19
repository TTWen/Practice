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

    public static String makeGood1(String s) {
        if (s.length() <= 1) {
            return s;
        }

        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            }
            else {
                char peek = stack.peek();
                if (peek >= 'a' && peek <= 'z') {
                    if (c == peek - 32) {
                        stack.pop();
                    }
                    else {
                        stack.push(c);
                    }
                }
                else {
                    if (peek >= 'A' && peek <= 'Z') {
                        if (c == peek + 32) {
                            stack.pop();
                        }
                        else {
                            stack.push(c);
                        }
                    }
                }
            }
        }


        StringBuilder res = new StringBuilder("");
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
    public static void main(String[] args) {

        String s = "leEeetcode";
        String res = makeGood1(s);
        System.out.println("res = " + res);


    }
}
