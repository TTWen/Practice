package _0_DataStructure._2_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ting.wen
 * @create 2022-05-08 10:43 PM
 * @pkgName _0_DataStructure._2_Array
 * @Description
 */
public class _118_Pascals_Triangle {

    public static List<List<Integer>> generate(int numRows) {

    /**
     * [1,2,1]，
     * j = 2，找到最后一位开始，找到倒数第一个和倒数第二个，1和2，
     * 加起来放在row 的row[2]
     *
     * j = 1，找到倒数第二位和倒数三位，2和1
     * 加起来放在 row 的row[1]
      */
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            for (int j  = temp.size() - 1; j >= 1; j--) {
                temp.set(j, temp.get(j) + temp.get(j-1));
            }
            temp.add(1);
            res.add(new ArrayList<>(temp));
            System.out.println(temp.toString());
        }

        return res;

    }

    public static void main(String[] args) {

        int numRows = 5;
        List<List<Integer>> res = generate(numRows);

        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
}
