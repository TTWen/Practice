package _0_DataStructure._0_LinkList;

/**
 * @author ting.wen
 * @create 2022-03-29 11:52 PM
 * @pkgName _0_DataStructure._0_LinkList
 * @Description
 */

import java.util.List;

/**
 * Given the head of a singly linked list, return true if it is a palindrome.
 * [1,2,2,1]
 * TRUE
 *
 * [1,2]
 * FALSE
 *
 * 快慢指针找到中间点
 * 右半部分反转
 * 一起遍历，compare
 */
public class _234_Palindrome_Linked_List {
    public static boolean isPalindrome(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // 偶数长度
        // 1-2-3-4-5-6-null
        // f 指向 null 时，s 从 4 开始
        // 正好是 1-2-3，4-5-6

        // 奇数长度
        // 1-2-3-4-5-null
        // f 指向 5，s 指向 3
        // 这时让 s 指向 4，这样右边就少一个
        if (fast != null) {
            slow = slow.next;
        }

        // slow 是后半部分的开头
        slow = reverse(slow);

        fast = head;

        // 右边少一个，所有右边的 slow 先到 null
        while (slow != null) {
            if (slow.val != fast.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }

        while (fast != null) {
            System.out.print(fast.val);
            fast = fast.next;
        }
        System.out.println("....");
        while (slow != null) {
            System.out.print(slow.val);
            slow = slow.next;
        }
        return true;
    }


    public static boolean isPalindrome1(ListNode head) {

        /*
        对 head 进行 reverse 得到 newHead，
        遍历 head 和 newHead
         */

        /*
        head
        1->2->3->4->5->null

        newHead
        5->4->3->2->1->null

        1->null
         */
        ListNode newHead = null;
        ListNode p = head;

        while (p != null) {
            ListNode temp = new ListNode(p.val);
            temp.next = newHead;
            newHead = temp;
            p = p.next;
        }

//        while (newHead != null) {
//            System.out.println(newHead.val);
//            newHead = newHead.next;
//        }

        ListNode h1 = head;
        ListNode h2 = newHead;

        while (h1 != null) {
            if (h1.val == h2.val) {
                h1 = h1.next;
                h2 = h2.next;
            }
            else {
                return false;
            }
        }



        return true;
    }
    /**
     *
     * @param head
     * @return
     * pre 表示当前结点的前一个结点
     * head 一直在移动，表示当前结点
     * p 表示下一个结点
     * 因此：
     * pre 一开始要为 null
     * 反转后 head 要指向 pre
     * 同时 pre，head，p 都在后移
     * 1->2->3->4->null
     * null<-1->2->3->4->null
     */
    public static ListNode reverse(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode p = head.next;
            head.next = pre;
            pre = head;
            head = p;
        }
        return pre;
    }

    public static void main(String[] args) {
//        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))));
//        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(isPalindrome1(head));
    }
}
