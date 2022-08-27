package other;

import com.sun.deploy.util.StringUtils;

/**
 * @author ting.wen
 * @create 2022-05-16 10:20 PM
 * @pkgName other
 * @Description
 */
public class recursion {

    public static void med() {

    }

    public static void main(String[] args) {

        int fix = 50;
        int len = 64 - fix;
        String str = "";
        for (int i = 0; i < fix; i++) {
            str += "0";
        }
        System.out.println(str);
        for (int i = 0; i < Math.pow(2, len); i++) {
//            String.format("%0"+len+"s", Integer.toBinaryString(i));
//
            String s = String.format("%"+len+"s\n", Integer.toBinaryString(i)).replace(" ","0");
            System.out.printf(s);
        }
    }
}
