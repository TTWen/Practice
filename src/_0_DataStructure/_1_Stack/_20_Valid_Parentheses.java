package _0_DataStructure._1_Stack;

/**
 * @author ting.wen
 * @create 2022-04-04 9:50 PM
 * @pkgName _0_DataStructure._1_Stack
 * @Description
 */

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 *
 * Input: s = "()"
 * Output: true
 *
 * Input: s = "()[]{}"
 * Output: true
 *
 * s = []{}
 * stack =
 *
 * Input: s = "(]"
 * Output: false
 */
public class _20_Valid_Parentheses {

    public static boolean isValid(String s) {

        if (s.length() == 0 || s.length() % 2 != 0)
            return false;
        char[] str = s.toCharArray();

        Stack stack = new Stack();

        for (int i = 0; i < str.length; i++) {
            char single = str[i];
            System.out.println("single = " + single);
            if (stack.empty()) {
                stack.push(single);
            }
            else {
                char top = (char) stack.pop();
                System.out.println("top = " + top);
                if ((top == '(' && single == ')') || (top == '{' && single == '}') || (top == '[' && single == ']')) {
                    System.out.println("匹配");
                    continue;
                }
                else {
                    System.out.println("不匹配");
                    stack.push(top);
                    stack.push(single);
                }
            }
            System.out.println();
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

//        String s = "()[]{}";
        String s= "({[)";
        System.out.println(isValid(s));
    }
}
