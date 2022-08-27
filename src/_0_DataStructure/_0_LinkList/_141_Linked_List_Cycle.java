/**
 * @author ting.wen
 * @create 2022-03-25 11:03PM
 * @pkgName _0_DataStructure._0_LinkList
 * @Description
 */

package _0_DataStructure._0_LinkList;

/**
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 *
 * There is a cycle in a linked list if there is some node in the list
 * that can be reached again by continuously following the next pointer.
 * Internally, pos is used to denote the index of the node that tail's next pointer is connected to.
 * Note that pos is not passed as a parameter.
 *
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 *
 * 3 -> 2- > 0 -> -4
 *      ↑           |
 *      ------------
 */
public class _141_Linked_List_Cycle {

    public static boolean hasCycle(ListNode head) {

            if (head == null || head.next == null)
                return false;

            ListNode p = head;
            ListNode q = head;

            while (p != null && p.next != null) {
                p = p.next.next;
                q = q.next;

                if (p == q) {
                    return true;
                }
            }
        return false;
    }

    public static void main(String[] args) {
//        ListNode head = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4))));
        ListNode head = new ListNode(1, new ListNode(2));
        boolean res = hasCycle(head);
        System.out.println(res);
    }
}
