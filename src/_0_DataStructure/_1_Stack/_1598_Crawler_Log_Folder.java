package _0_DataStructure._1_Stack;

import java.util.Stack;

/**
 * @author ting.wen
 * @create 2022-04-22 11:36 PM
 * @pkgName _0_DataStructure._1_Stack
 * @Description
 */
public class _1598_Crawler_Log_Folder {

    public static int minOperations(String[] logs) {

        int depth = 0;
        for (String log: logs) {
            if (log.equals("../")) {
                if (depth > 0) {
                    depth --;
                }

            } else if (log.equals("./")) {
                ;
            } else {
                depth ++;
            }
        }

        return depth;
    }

    public static void main(String[] args) {

        String[] logs = new String[]{"d1/","../","../","../"};
        int res = minOperations(logs);
        System.out.println("res = " + res);

        String str = "../";
        String str1 = "../";
        System.out.println(str == str1);

    }
}
