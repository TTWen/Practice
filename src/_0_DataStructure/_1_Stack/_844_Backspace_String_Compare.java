package _0_DataStructure._1_Stack;

import java.util.Objects;
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

        if (process(s).equals(process(t)))
            return true;
        else
            return  false;
    }

    public static boolean backspaceCompare1(String s, String t) {

        System.out.println(process1(s));
        System.out.println(process1(t));

        if (Objects.equals(process1(s), process1(t)))
            return true;

        else
            return false;
    }

    public static String process1(String str) {
        if (str == null)
            return null;

        StringBuffer res = new StringBuffer("");

        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < chars.length; i++) {
            if (Objects.equals(chars[i], '#')) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }

            else {
                stack.push(chars[i]);
            }
        }

        while (!stack.isEmpty()) {
            res = res.append(stack.pop());
        }

        return res.reverse().toString(); // StringBuffer 或 StringBuilder 才可以直接reverse
    }


    public static void main(String[] args) {
        String s = "a##c";
        String t = "#a#c";
        System.out.println(backspaceCompare1(s, t));
        String str = "()()()()()";
    }

}
