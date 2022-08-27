package _0_DataStructure._1_Stack;

/**
 * @author ting.wen
 * @create 2022-04-19 2:06 PM
 * @pkgName _0_DataStructure._1_Stack
 * @Description
 */

import java.util.Stack;

/**
 * ()是一个原括号，不可再分隔
 * 目的是去除最外层括号
 * (())() -- ()
 * (()())(())(()(())) -- ()()()()(())
 */
public class _1021_Remove_Outermost_Parentheses {


    public static String removeOuterParentheses(String s) {

        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (!stack.isEmpty()) {
                    res.append(c);
                }
                stack.push(c);
            }
            else {
                stack.pop();
                if (!stack.isEmpty()) {
                    res.append(c);
                }
            }

            System.out.println("res = " + res.toString());
        }

        return res.toString();
    }
    public static void main(String[] args) {

        String s = "(()(()))"; // ()(())
        String res = removeOuterParentheses(s);
        System.out.println(res);
    }
}
