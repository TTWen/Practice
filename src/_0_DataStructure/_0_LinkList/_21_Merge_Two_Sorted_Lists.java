/**
 * @author ting.wen
 * @create 2022-03-24 10:56PM
 * @pkgName _0_DataStructure._0_LinkList
 * @Description
 */

package _0_DataStructure._0_LinkList;

/*
* two sorted list merged into one sorted list
* 1，2，4
* 1，3，4
* ==》1，1，2，3，4，4
* */
class ListNode {
    int val;
    String val2;
    ListNode next = null;

    // 构造方法
    ListNode(int val) {
        this.val = val;
    }

    ListNode (String val2) {
        this.val2 = val2;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    ListNode(String val2, ListNode next) {
        this.val2 = val2;
        this.next = next;
    }
}

public class _21_Merge_Two_Sorted_Lists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode res = new ListNode(0);
        ListNode t = res;
        System.out.println("111");
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                t.next = new ListNode(list1.val);
                System.out.println(t.val);
                list1 = list1.next;
            }else {
                t.next = new ListNode(list2.val);
                System.out.println(t.val);
                list2 = list2.next;
            }
            t = t.next;
        }
        if (list1 != null) {
            t.next = list1;
        }
        if (list2 != null) {
            t.next = list2;
        }

        return res.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode res = mergeTwoLists(list1, list2);
        while(res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}









