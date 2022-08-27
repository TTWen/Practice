package _0_DataStructure._0_LinkList;

/**
 * @author ting.wen
 * @create 2022-03-26 11:01 PM
 * @pkgName _0_DataStructure._0_LinkList
 * @Description
 */

/**
 * Given the head of a linked list and an integer val,
 * remove all the nodes of the linked list that has Node.val == val,
 * and return the new head.
 *
 * [1->1->6->3->4->5->6], 6
 * 1->1->3->4->5
 *
 * [],1
 * []
 *
 * [7,7,7,7].7
 * []
 *
 */
public class _203_Remove_Linked_List_Elements {


    public static ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return head;

        ListNode pre = new ListNode(-1); // 题目规定val 在 [0,50]之间，所以可以这样做，选择pre=-1
        pre.next = head;

        ListNode newHead = pre;

        while (pre.next != null) {
            if (pre.next.val  == val) {
                pre.next = pre.next.next;
            }
            else {
                pre = pre.next;
            }
        }

        return newHead.next;

    }

    public static void main(String[] args) {
//        ListNode head = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6 )))))));
//        ListNode head = new ListNode(5, new ListNode(5, new ListNode(5)));
        ListNode head = new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7))));

        ListNode res = removeElements(head, 7);

        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
