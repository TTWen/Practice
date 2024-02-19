package _0_DataStructure._1_Stack;

import java.util.Objects;
import java.util.Stack;

/**
 * @author ting.wen
 * @create 2022-04-19 9:26 PM
 * @pkgName _0_DataStructure._1_Stack
 * @Description
 *
 * "abbaca"--"ca"
 * "azxxzy"--"ay"
 */
public class _1047_Remove_All_Adjacent_Duplicates_In_String {

    public static String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();

        for (char c: s.toCharArray()) {
            if (!stack.isEmpty() && (c == stack.peek())) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }

        return res.reverse().toString();
    }

    public static String removeDuplicates1(String s) {
        StringBuilder res = new StringBuilder("");

        if (s.length() <= 1) {
            return s;
        }

        char[]chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for( char c: chars) {
            if (stack.isEmpty()) {
                stack.push(c);
            }
            else {
                char peek = stack.peek();
                if (Objects.equals(peek, c)) {
                    stack.pop();
                }
                else {
                    stack.push(c);
                }
            }
        }

        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
    public static void main(String[] args) {

        String s = "abbacadda";
        String res = removeDuplicates1(s);
        System.out.println(res);
    }
}
