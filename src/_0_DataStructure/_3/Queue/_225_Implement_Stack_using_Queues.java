package _0_DataStructure._3.Queue;

import javax.management.QueryEval;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ting.wen
 * @create 2022-05-14 11:05 PM
 * @pkgName _0_DataStructure._3.Queue
 * @Description 使用 1 个 queue 实现 1 个 stack
 */
public class _225_Implement_Stack_using_Queues {

    Queue<Integer> queue;
    public _225_Implement_Stack_using_Queues() {
        this.queue = new LinkedList<Integer>();
    }

    public void push(int x) {
       queue.add(x);
       for (int i = 0; i < queue.size() - 1; i++) {
           queue.add(queue.poll());
       }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {

        return queue.peek();
    }

    public boolean empty() {

        return queue.isEmpty();
    }
    public static void main(String[] args) {


    }
}
