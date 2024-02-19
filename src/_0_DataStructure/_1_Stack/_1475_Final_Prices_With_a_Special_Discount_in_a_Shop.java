package _0_DataStructure._1_Stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author ting.wen
 * @create 2022-04-19 10:40 PM
 * @pkgName _0_DataStructure._1_Stack
 * @Description
 */
public class _1475_Final_Prices_With_a_Special_Discount_in_a_Shop {

    public static int[] finalPrices(int[] prices) {

        Stack<Integer> stack = new Stack<>();
        int[] res = new int[prices.length];
        for (int i = prices.length - 1 ; i >= 0; i--) {
            if (stack.isEmpty()) {
                stack.push(prices[i]);
                res[i] = prices[i];
            }
            else if (stack.peek() < prices[i]) {
                res[i] = prices[i] - stack.peek();
                stack.push(prices[i]);
            }
            else  {
                while (!stack.isEmpty() && (stack.peek() > prices[i])) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    res[i] = prices[i];
                }else  {
                    res[i] = prices[i] - stack.peek();
                }
                stack.push(prices[i]);
            }
            if (!stack.isEmpty())
                System.out.println(stack.peek());

        }

        return res;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{3,5,4,3,1,2};
        int[] res = finalPrices(prices); // [0,1,1,2,1,2]
        System.out.println(Arrays.toString(res));
    }
}
