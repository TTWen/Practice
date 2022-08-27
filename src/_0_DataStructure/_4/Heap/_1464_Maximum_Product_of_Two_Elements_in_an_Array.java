package _0_DataStructure._4.Heap;

/**
 * @author ting.wen
 * @create 2022-07-20 8:50 PM
 * @pkgName _0_DataStructure._4.Heap
 * @Description
 */
public class _1464_Maximum_Product_of_Two_Elements_in_an_Array {

    public static int maxProduct(int[] nums) {

        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;

        for (int num : nums) {

            if (num > m1) {
                m2 = m1;
                m1 = num;
            }
            else if (num > m2) {
                m2 = num;
            }
        }

        System.out.println(m1);
        System.out.println(m2);

        return (m1- 1)*(m2 - 1);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,4,5,2};
        int res = maxProduct(nums);
        System.out.println(res);
    }
}
