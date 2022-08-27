package _0_DataStructure._0_LinkList;

/**
 * @author ting.wen
 * @create 2022-03-26 10:20 PM
 * @pkgName _0_DataStructure._0_LinkList
 * @Description
 */

/**
 * Given the heads of two singly linked-lists headA and headB,
 * return the node at which the two lists intersect.
 * If the two linked lists have no intersection at all, return null.
 *
 * For example, the following two linked lists begin to intersect at node c1:
 */
public class _160_Intersection_of_Two_Linked_Lists {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode res = null;

        int len1 = 0;
        ListNode p = headA;
        while (p != null) {
            p = p.next;
            len1++;
        }
        System.out.println(len1);

        int len2 = 0;
        ListNode q = headB;
        while (q != null) {
            q = q.next;
            len2++;
        }
        System.out.println(len2);

        p = headA;
        q = headB;

        int block = 0;
        if (len1 > len2) {
            block = len1 - len2;

            for (int i = 0; i < block; i++) {
                p = p.next;
            }
        }
        else if (len1 < len2){
            block = len2 - len1;

            for (int i = 0; i < block; i++) {
                q = q.next;
            }
        }

        while (p != null) {
            if (p == q) {
                res = p;
                return res;
            }
            else {
                p = p.next;
                q = q.next;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        ListNode headA = new ListNode(4);

        ListNode inter = new ListNode(8);
        headA.next = new ListNode(1);
        headA.next.next = inter;

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = inter;

        inter.next = new ListNode(4);
        inter.next.next = new ListNode(5);

//        while (headA != null) {
//            System.out.print(headA.val);
//            headA = headA.next;
//        }
//
//        System.out.println();
//        while (headB != null) {
//            System.out.print(headB.val);
//            headB = headB.next;
//        }

        ListNode res = getIntersectionNode (headA, headB);

        if (res == null) {
            System.out.println("null");
        }
        else{
            System.out.println(res.val);
        }
    }
}
