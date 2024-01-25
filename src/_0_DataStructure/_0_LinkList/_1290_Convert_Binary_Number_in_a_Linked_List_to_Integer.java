package _0_DataStructure._0_LinkList;

/**
 * @author ting.wen
 * @create 2022-04-01 11:41 PM
 * @pkgName _0_DataStructure._0_LinkList
 * @Description
 */

/**
 * Given head which is a reference node to a singly-linked list.
 * The value of each node in the linked list is either 0 or 1.
 * The linked list holds the binary representation of a number.
 *
 * Return the decimal value of the number in the linked list.
 *
 * Input: head = [1,0,1]
 * Output: 5
 * Explanation: (101) in base 2 = (5) in base 10
 *
 * 可以理解为 1*2 相当于左移，再加上当前的值
 * 如：1010
 * ==》
 * 0
 * 0*10+1=1
 * 1*10+0=10
 * 10*10+1=101
 * 101*10+0=1010
 */
public class _1290_Convert_Binary_Number_in_a_Linked_List_to_Integer {
    public static int getDecimalValue(ListNode head) {

        int res = 0;
        System.out.println(res);
        while (head!= null) {
            res = res * 2 + head.val;
            System.out.println(res);

            head = head.next;
        }
        return res;
    }

    public static int getDecimalValue1(ListNode head) {
        int res = 0;
        while (head != null) {
            res = res * 2 + head.val;
            head = head.next;
        }

        return res;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(1)));
        int res = getDecimalValue1(head);
        System.out.println(res);
    }
}
