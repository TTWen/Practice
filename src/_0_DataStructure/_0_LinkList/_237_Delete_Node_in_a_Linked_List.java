package _0_DataStructure._0_LinkList;

/**
 * @author ting.wen
 * @create 2022-04-01 11:04 PM
 * @pkgName _0_DataStructure._0_LinkList
 * @Description
 */

/**
 * Write a function to delete a node in a singly-linked list.
 * You will not be given access to the head of the list,
 * instead you will be given access to the node to be deleted directly.
 *
 * It is guaranteed that the node to be deleted is not a tail node in the list.
 * [4,5,1,9],5
 * 4,1,9
 *
 */

public class _237_Delete_Node_in_a_Linked_List {

    /**
     *
     * @param node
     * 把下一个节点的值复制到当前结点，然后跳过下一个结点
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {

    }
}
