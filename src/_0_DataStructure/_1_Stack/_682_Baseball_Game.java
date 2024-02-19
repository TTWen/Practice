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

    public static int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();
        for (String op: operations) {
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


    public static int calPoints1(String[] operations) {
        /*
        注意两点：
        1、比较字符串时，不能用 == ，要用 Objects.equals(a,b)
        2、数字字符串转成数组时，不能用Integer.ValueOf()，要用 Integer.parseInt()
         */
        if (operations.length <= 0)
            return 0;

        int res = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            if (Objects.equals(operations[i],"C")) {
                // 移除前一个
                    stack.pop();
            }
            else if (Objects.equals(operations[i],"D")) {
                // 前一个翻倍
                    stack.push(stack.peek()*2);
            } else if (Objects.equals(operations[i], "+")) {
                int i1 = stack.pop();
                int i2 = stack.pop();
                int i3 = i1 + i2;
                stack.push(i2);
                stack.push(i1);
                stack.push(i3);
            } else {
                System.out.println(operations[i]);
                stack.push(Integer.parseInt(operations[i]));
            }
        }

        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }
    public static void main(String[] args) {
//        String[] operations = new String[]{"5","2","C","D","+"};
        String[] operations = new String[]{"5","2","C"};

        System.out.println(calPoints1(operations));
        System.out.println();
    }
}
