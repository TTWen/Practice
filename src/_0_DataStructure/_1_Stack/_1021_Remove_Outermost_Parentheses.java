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

        /*
         stack 只放左括号

         遇到左括号：
         先判断 stack 空不空
         如果不空，说明当前这个左括号不是最外围的，记录一下
         如果空，说明当前这个左括号是最外围的，不记录
         把当前的左括号 push 进去

         遇到右括号：直接pop 出一个左括号
         如果不空，说明当前这个右括号不是最外围的，记录一下
         如果空，说明当前这个右括号是最外围的，不记录
         */
        for (char c : s.toCharArray()) {
            if (c == '(') {
                // 遇到左括号
                if (!stack.isEmpty()) {
                    res.append(c);
                }
                stack.push(c);
            }
            else {
                // 遇到右括号
                stack.pop();
                if (!stack.isEmpty()) {
                    res.append(c);
                }
            }

            System.out.println("res = " + res.toString());
        }

        return res.toString();
    }

    public static String removeOuterParentheses1(String s) {
        StringBuilder res = new StringBuilder("");
        Stack<Character> stack = new Stack<>();

        char[] chars = s.toCharArray();
        for (char c: chars) {
            if (c == '(') {
                // 遇到左括号

                // 先判断是不是空的
                if (stack.isEmpty()) {
                    // 当前是最外围，不记录
                }
                else {
                    // 当前不是最外围，记录
                    res.append(c);
                }

                stack.push(c);
            }
            else {
                // 遇到右括号

                // 先 pop 出一个，才能判断是不是最外围
                stack.pop();

                if (stack.isEmpty()) {
                    // 最外围
                }
                else {
                    // 不是最外围，记录
                    res.append(c);
                }

            }
        }


        return res.toString();
    }
    public static void main(String[] args) {

        String s = "(()(()))"; // ()(())
        String res = removeOuterParentheses1(s);
        System.out.println(res);
    }
}
