package _0_DataStructure._3.Queue;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author ting.wen
 * @create 2022-06-15 10:59 PM
 * @pkgName _0_DataStructure._3.Queue
 * @Description
 */
public class _2073_Time_Needed_to_Buy_Tickets {

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int loop = tickets[k];
        System.out.println("loop = " + loop);

        LinkedList<Integer>tick = new LinkedList<Integer>();
        for (int i = 0; i < tickets.length; i++) {
            tick.add(tickets[i]);
        }

        int res = 0;
        for (int i = 0; i < loop; i++) {
            for (int j = 0; j < tickets.length; j++) {
                if (tickets[j] > 0) {

                    tickets[j]--;
                    res ++;
                }
                if (tickets[k] == 0) // 她买到票就结束了
                    break;
            }
            System.out.println(Arrays.toString(tickets));
        }
        return res;
    }

    public static void main(String[] args) {
        int[] tickets = new int[]{84,49,5,24,70,77,87,8};
        int k = 3;
        int res = timeRequiredToBuy(tickets, k);
        System.out.println("res = " + res);
    }
}

/**
 * [62, 27, 0, 2, 48, 55, 65, 0]
 * [61, 26, 0, 1, 47, 54, 64, 0]
 * [60, 25, 0, 0, 46, 53, 63, 0]
 */