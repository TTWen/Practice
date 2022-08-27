package _0_DataStructure._2_Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ting.wen
 * @create 2022-05-08 10:43 PM
 * @pkgName _0_DataStructure._2_Array
 * @Description
 */
public class _119_Pascals_Triangle_II {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> temp = new ArrayList<>();



        for (int i = 0; i < rowIndex + 1; i++) {
            for (int j = temp.size() - 1; j >= 1; j--) {
                temp.set(j, temp.get(j) + temp.get(j - 1));
            }
            temp.add(1);
            temp = new ArrayList<>(temp);
        }

        return temp;
    }

    public static void main(String[] args) {

        int numRows = 5;
        List<Integer> res = getRow(numRows);

        System.out.println(res.toString());
    }
}
