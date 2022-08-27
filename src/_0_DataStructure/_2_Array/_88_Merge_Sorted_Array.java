package _0_DataStructure._2_Array;

import java.util.Arrays;

/**
 * @author ting.wen
 * @create 2022-05-08 10:21 PM
 * @pkgName _0_DataStructure._2_Array
 * @Description
 */
public class _88_Merge_Sorted_Array {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int p = 0; p < n; p++) {
                nums1[p] = nums2[p];
            }
        }

        int[] temp = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                temp[k++] = nums1[i++];
                System.out.println(Arrays.toString(temp));

            }
            else {
                temp[k++] = nums2[j++];
                System.out.println(Arrays.toString(temp));

            }
        }
        while (j < n) {
            temp[k++] = nums2[j++];
        }
        while (i < m) {
            temp[k++] = nums1[i++];
        }
        System.out.println(Arrays.toString(temp));

        for (int t = 0; t < m+n; t++) {
            nums1[t] = temp[t];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;

        int[] nums2 = new int[]{2,5,6};
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));

    }
}
