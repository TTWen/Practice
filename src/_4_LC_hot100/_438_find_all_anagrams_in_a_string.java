package _4_LC_hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _438_find_all_anagrams_in_a_string {

    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";

        List<Integer> res = findAnagrams(s, p);
        System.out.println(res);
    }

    public static List<Integer> findAnagrams(String s, String p) {
        if (s == null || p == null || s.length() <= 0 || p.length() <= 0)
            return null;

        List<Integer> res = new ArrayList<>();

        char[]p_c = p.toCharArray();
        Arrays.sort(p_c);

        for (int i = 0; i <= s.length() - p.length(); i++) {
            String ss = s.substring(i, i + p.length());

            char[]ss_c = ss.toCharArray();
            Arrays.sort(ss_c);

            if (Arrays.equals(ss_c, p_c)) {
                res.add(i);
            }
        }
        return res;
    }
}
