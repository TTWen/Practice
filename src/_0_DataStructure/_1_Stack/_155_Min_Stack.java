package _0_DataStructure._1_Stack;

import java.util.List;

/**
 * @author ting.wen
 * @create 2022-04-10 11:40 PM
 * @pkgName _0_DataStructure._1_Stack
 * @Description
 */

public class _155_Min_Stack {
    private Node head;

    public void push(int val) {
        if (head == null) {
            head = new Node(val, val, null);
        } else {
            // 从 head 的前面插入
            head = new Node(val, Math.min(val, head.min), head);
        }
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    private class Node {
        int val;
        int min;
        Node next;

        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

    public static void main(String[] args) {

    }
}
