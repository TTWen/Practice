package _0_DataStructure._1_Stack;

/**
 * @author ting.wen
 * @create 2022-04-19 9:44 PM
 * @pkgName _0_DataStructure._1_Stack
 * @Description
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Input: target = [1,2,3], n = 3
 * Output: ["Push","Push","Push"]
 * list = [1,2,3] ，直接push
 *
 * Input: target = [1,2], n = 4
 * Output: ["Push","Push"]
 * list = [1,2,3,4]，3和4都不要，只把1和2 push进去
 *
 * Input: target = [1,3], n = 3
 * Output: ["Push","Push","Pop","Push"]
 * list = [1,2,3]，2不要，所以先push，再pop
 * 输出能够使得 list+操作=target的操作
 *
 * list   = [1,2,3]
 * target = [1,3]
 * push push pop Push
 *
 * list = [1,2,3,4]
 * target = [1,2]
 *
 */
public class _1441_Build_an_Array_With_Stack_Operations {

    public static List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int j = 1;
        for(int i = 1; i <= n && j <= target.length; i++) {
            if (i == target[j-1]) {
                res.add("Push");
                j++;
            } else {
                res.add("Push");
                res.add("Pop");
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[] target = new int[] {1,3};
        int n = 3;

//        int [] tar1 = new int[] {1,1,1};
//        int [] tar2 = new int[] {1,1,1};
//        System.out.println(tar1 == tar2);
//        System.out.println(tar1.equals(tar2));
//        System.out.println(Arrays.toString(tar1).equals( Arrays.toString(tar2)));

        List<String> res = buildArray(target, n);
        for (String s: res) {
            System.out.println(s);
        }
    }
}
