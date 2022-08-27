package _0_DataStructure._1_Stack;

import java.util.Stack;

/**
 * @author ting.wen
 * @create 2022-04-19 1:50 PM
 * @pkgName _0_DataStructure._1_Stack
 * @Description
 */
public class _844_Backspace_String_Compare {

    public static String process(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch: str.toCharArray()) {
            if (ch == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }

        StringBuilder res = new StringBuilder("");
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
    public static boolean backspaceCompare(String s, String t) {

//        System.out.println(process(s));
//        System.out.println(process(t));
        if (process(s).equals(process(t)))
            return true;
        else
            return  false;
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s, t));
        String str = "()()()()()";
    }

}
