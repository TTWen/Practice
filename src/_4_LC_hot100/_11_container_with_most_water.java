package _4_LC_hot100;


/*
https://leetcode.cn/problems/container-with-most-water/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class _11_container_with_most_water {

    public static void main(String[] args) {
        int[]height = new int[] {4,3,2,1,4};
        int res = maxArea(height);
        System.out.println("res:" + res);
    }

    public static int maxArea(int[] height) {
        int res = 0;

        if (height == null || height.length <= 1) {
            return res;
        }

        if (height.length == 2) {
            if (height[0] < height[1]) {
                return height[0];
            }
            else {
                return height[1];
            }
        }

        int i = 0;
        int j = height.length - 1;

        int h = 0;
        int area = 0;
        while (i < j) {
//            System.out.println(height[i] + "," +height[j]);
            h = Math.min(height[i], height[j]);
            area = h * (j - i);
            System.out.println("ares = " + area);

            res = Math.max(res, area);

            if (height[i] < height[j]) {
                i++;
            }
            else {
                j--;
            }
        }

        return res;
    }
}

/*
双指针
面积=(j-i)*MIN(h(i),h(j))
把较短的板子往里缩，MIN(h(i),h(j))有可能变小，有可能变大，有可能不变；面积有可能变小，变大，不变
把较长的板子往里缩，MIN(h(i),h(j))有可能变小，有可能不变；面积有可能变小，不变

 */

