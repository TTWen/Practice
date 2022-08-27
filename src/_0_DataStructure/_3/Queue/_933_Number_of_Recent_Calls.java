package _0_DataStructure._3.Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ting.wen
 * @create 2022-06-13 11:17 PM
 * @pkgName _0_DataStructure._3.Queue
 * @Description
 */

/**
 * 在一个已经满的队列中加一个新的项，
 * add()会抛出异常，offer()会返回false
 */
public class _933_Number_of_Recent_Calls {

    static Queue<Integer> queue;
    public  _933_Number_of_Recent_Calls() {
        queue = new LinkedList<>();
    }

    public static int ping(int t) {
        queue.offer(t);

        while (t - queue.peek() > 3000) {
            queue.poll();
        }
        return queue.size();
    }

}
