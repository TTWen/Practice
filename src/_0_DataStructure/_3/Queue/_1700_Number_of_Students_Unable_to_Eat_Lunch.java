package _0_DataStructure._3.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ting.wen
 * @create 2022-06-15 9:36 PM
 * @pkgName _0_DataStructure._3.Queue
 * @Description
 */
public class _1700_Number_of_Students_Unable_to_Eat_Lunch {

    public static int countStudents(int[] students, int[] sandwiches) {
        int p = 0;
        int q = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == 0) {
                p++;
            }
            else {
                q++;
            }
        }

        for (int j = 0; j < sandwiches.length; j++) {
            if (sandwiches[j] == 0) {
                p--;
            }
            else {
                q--;
            }

//            if ( p < 0 || q < 0) {
//                return students.length - j;
//            } // pass
            if (p < 0)
                return q;
            if (q < 0)
                return p; // pass
        }

        return 0;
    }

    public static void main(String[] args) {

        int[] students = new int[]{1, 1, 1, 0, 0, 1};
        int[] sandwiches = new int[]{1, 0, 0, 0, 1, 1};
        int res = countStudents(students, sandwiches);
        System.out.println("res = " + res);
    }
}
