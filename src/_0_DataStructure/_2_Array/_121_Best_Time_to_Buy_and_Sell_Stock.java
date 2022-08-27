package _0_DataStructure._2_Array;

/**
 * @author ting.wen
 * @create 2022-05-10 11:02 PM
 * @pkgName _0_DataStructure._2_Array
 * @Description
 */
public class _121_Best_Time_to_Buy_and_Sell_Stock {

    public static int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int price : prices) {
            min = Math.min(min, price);
            max = Math.max(price - min, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        int res = maxProfit(prices);
        System.out.println("res = " + res);
    }
}
