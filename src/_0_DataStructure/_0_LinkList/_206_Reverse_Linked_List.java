package _0_DataStructure._0_LinkList;

/**
 * @author ting.wen
 * @create 2022-03-27 6:32 PM
 * @pkgName _0_DataStructure._0_LinkList
 * @Description
 */

import java.util.List;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * [1,2,3,4,5]
 * ->[5,4,3,2,1]
 */
public class _206_Reverse_Linked_List {

    public static ListNode reverseList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode newHead = new ListNode(-1);
        ListNode p = head;

        ListNode temp;
        while (p != null) {
//            System.out.println(p.val);
            temp = p;
            p = p.next;
            temp.next = newHead.next;
            newHead.next = temp;
        }

        return newHead.next;
    }
    public static void main(String[] args) {

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode res = reverseList(head);
        System.out.println("*******************");
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
