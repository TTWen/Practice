package _4_LC_hot100;

/*
https://leetcode.cn/problems/group-anagrams/description/?envType=study-plan-v2&envId=top-100-liked
 */



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _49_group_anagrams {
    public static void main(String[] args) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};

        List<List<String>> res = groupAnagrams(strs);

        System.out.println("res:" + res);

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs.length <= 0 || strs == null) {
            return res;
        }

        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String s = String.valueOf(chars);

            if (hashMap.get(s) != null) {
                hashMap.get(s).add(str);
            } else {
                List<String> l = new ArrayList<>();
                l.add(str);
                hashMap.put(s, l);
            }
        }

        System.out.println(hashMap);
        hashMap.forEach((key, value) -> {
                    res.add(value);
                }
        );
        return res;
    }
}
