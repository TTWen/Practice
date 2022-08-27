package _0_DataStructure._1_Stack;

/**
 * @author ting.wen
 * @create 2022-04-13 12:02 AM
 * @pkgName _0_DataStructure._1_Stack
 * @Description
 */

import java.util.Objects;
import java.util.Stack;

/**
 * + 表示本位置的数值为前两个数值之和
 * D 表示本位置的数值为前一个数值的2倍
 * C 表示移除前一个位置
 *
 * ["5","2","C","D","+"]
 * [5]
 * [5,2]
 * [5]
 * [5,10]
 * [5,10,15]
 * ---->30
 */
public class _682_Baseball_Game {

    public static int calPoints(String[] ops) {

        Stack<Integer> stack = new Stack<>();
        for (String op: ops) {
            if (Objects.equals(op, "C")) {
                stack.pop();
            }
            else if (Objects.equals(op, "D")){
                int peak = stack.peek();
                stack.push(2*peak);
            }
            else if(Objects.equals(op, "+")) {
                int sec = stack.pop();
                int fir = stack.pop();
                int num = sec + fir;
                stack.push(fir);
                stack.push(sec);
                stack.push(num);
            }else {
                stack.push(Integer.parseInt(op));
            }
        }

        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        String[] ops = new String[]{"5","2","C","D","+"};

        System.out.println(calPoints(ops));
    }
}
