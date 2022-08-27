/**
 * @author ting.wen
 * @create 2022-03-25 10:24PM
 * @pkgName _0_DataStructure._0_LinkList
 * @Description
 */

package _0_DataStructure._0_LinkList;

/**
 * Given the head of a sorted linked list,
 * delete all duplicates such that each element appears only once.
 * Return the linked list sorted as well.
 *
 * 1->1->2
 * =>   1->2
 */

public class _83_Remove_Duplicates_from_Sorted_List {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode p = head;

        ListNode res = head;
        ListNode q = res;

        while (p != null) {
            if (p.val == q.val) {
                System.out.println("a");
                p = p.next;
            }
            else {
                System.out.println("b");
                q.next = p;
                q = q.next;
                p = p.next;
            }
            System.out.println("q.val:" + q.val);
        }

        q.next = null;

        return res;
    }

    public static void main(String[] args) {

//        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));

//        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode head = null;
        ListNode res = deleteDuplicates(head);


        while(res != null) {
            System.out.print(res.val + "->");
            res = res.next;
        }
    }
}
