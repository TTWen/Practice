package _0_DataStructure._1_Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author ting.wen
 * @create 2022-04-12 11:39 PM
 * @pkgName _0_DataStructure._1_Stack
 * @Description
 */
public class _496_Next_Greater_Element_I {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>(); // 存放 value 和 grater value 的映射
        Stack<Integer> stack = new Stack<>();

        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                int top = stack.pop();
                map.put(top, num);
            }
            stack.push(num);
        }

        for (int i = 0; i < nums1.length; i++) { // 把 grater value 的值赋给 value，直接返回
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }

        return nums1;
    }
    public static void main(String[] args) {

    }
}
