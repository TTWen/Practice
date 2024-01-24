package _4_LC_hot100;

import java.util.HashMap;

public class _3_longest_substring_without_repeating_characters {

    public static void main(String[] args) {

        String s = "tmmzuxt";  // tmmzuxttmmzuxt
//        String s = "abcabcbb";  // tmmzuxttmmzuxt
        int res = lengthOfLongestSubstring2(s);
        System.out.println("------------res:" + res);
    }

    public static int lengthOfLongestSubstring1(String s) {
        if (s == null)
            return 0;
        if (s.length() <= 1) {
            return s.length();
        }

        char[] chars = s.toCharArray();

        int res = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j < chars.length; j++) {
                if (!hashMap.containsKey(chars[j])) {
                    hashMap.put(chars[j], 1);
                } else {
                    res = Math.max(res, hashMap.size());
                    hashMap.clear();
                    break;
                }
            }
        }
        return res;
    }

    public static int lengthOfLongestSubstring2(String s) {
        //滑动窗口
        int res = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0, j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if (hashMap.containsKey(ch)) {
                i = Math.max(hashMap.get(ch) + 1, i);
//                System.out.println(i);
            }

            res = Math.max(res, j - i + 1);
//            System.out.println("res:" + res);
            hashMap.put(ch, j);
//            System.out.println(hashMap);
        }
        return res;

    }
}