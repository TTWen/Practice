package _0_DataStructure._1_Stack;

import java.util.Stack;

/**
 * @author ting.wen
 * @create 2022-04-23 12:40 AM
 * @pkgName _0_DataStructure._1_Stack
 * @Description
 */
public class _1614_Maximum_Nesting_Depth_of_the_Parentheses {


    public static int maxDepth(String s) {
        int res = 0;
        int cur = 0;
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(chars[i]);
                res = Math.max(stack.size(), res);
            }
            else if (chars[i] == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        return res;

    }
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        int res = maxDepth(s);
        System.out.println("res = " + res);
    }
}
