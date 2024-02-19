package _0_DataStructure._1_Stack;

import java.util.Arrays;
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

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

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

    public static int[] nextGreaterElement1(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];


//        map 存放 nums2 里面 value 和 value 的 greater 值的映射
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums2.length; i++) {
            int v = -1;
            if (i != nums2.length - 1) {
                for (int j = i + 1; j < nums2.length; j++) {
                    if (nums2[j] > nums2[i]) {
                        v = nums2[j];
                        break;
                    }
                }
                map.put(nums2[i], v);

            }
            else {
                map.put(nums2[i], v);
            }

        }

//        map.forEach((key, value)->{
//            System.out.println(key+","+value);
//        });

        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
    public static void main(String[] args) {
//        int[] nums1 = new int[] {4,1,2};
//        int[] nums2 = new int[] {1,3,4,2};

//        int[] nums1 = new int[] {2,4};
//        int[] nums2 = new int[] {1,2,3,4};

        int[] nums1 = new int[] {1,3,5,2,4};
        int[] nums2 = new int[] {6,5,4,3,2,1,7};

        int[] res = nextGreaterElement1(nums1, nums2);
        System.out.println(Arrays.toString(res));

    }
}
