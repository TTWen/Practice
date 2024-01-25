package _0_DataStructure._0_LinkList;

/**
 * @author ting.wen
 * @create 2022-04-01 11:26 PM
 * @pkgName _0_DataStructure._0_LinkList
 * @Description
 */

import java.util.List;

/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 * If there are two middle nodes, return the second middle node.
 *
 * Input: head = [1,2,3,4,5]
 * Output: [3,4,5]
 * Explanation: The middle node of the list is node 3.
 *
 * Input: head = [1,2,3,4,5,6]
 * Output: [4,5,6]
 * Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 */
public class _876_Middle_of_the_Linked_List {

    public static ListNode middleNode(ListNode head) {
        int len = 0;
        ListNode p = head;
        while (p != null) {
            len++;
            p = p.next;
        }
        int start = 0;
        int pos = len/2;
        System.out.println("start = " + start + ", pos = " +pos);
        p = head;
        while (start < pos) {
            p = p.next;
            start++ ;
        }
        System.out.println(p.val);

        return p;
    }

    public static ListNode middleNode1(ListNode head) {
        int len = 0;
        ListNode p = head;

        while (p != null) {
            len++;
            p = p.next;
        }

        int pos = len/2 + 1;

        ListNode q = head;
        for (int i = 1; i < pos; i++) {
            q = q.next;
        }

        return q;
    }
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,new ListNode(5)))));
        ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,new ListNode(5,new ListNode(6))))));
        ListNode res = middleNode1(head2);
        System.out.println(res.val);
    }
}
