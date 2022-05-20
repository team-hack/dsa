package com.blind75.arrays.easy;

import com.blind75.helper.Task;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram extends Task {
    @Override
    protected void run() {
        String s = "anagram";
        String t = "nagaram";
        //System.out.println("bruteForce ==>" + bruteForce(s, t));
        System.out.println("optimal ==>" + optimal(s, t));
    }

    /**
     * if string is ascii based O(N) for time and space complexity
     * @param s
     * @param t
     * @return
     */
    private boolean bruteForce(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] si = new int[26];
        int[] ti = new int[26];
        for (int i = 0; i < s.length(); i++) {
            si[s.charAt(i) - 'a']++;
            ti[t.charAt(i) - 'a']++;
        }
        return Arrays.equals(si, ti);
    }

    /**
     * if string is unicode based
     * O(N) for time and space complexity
     * @param s
     * @param t
     * @return
     */
    private boolean optimal(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.toCharArray()[i];
            char d = t.toCharArray()[i];
            map.put(c, map.getOrDefault(c, 0) + 1);
            map.put(d, map.getOrDefault(d, 0) - 1);
        }
        for (Map.Entry<Character, Integer> set : map.entrySet()
        ) {
            if (set.getValue() != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        new ValidAnagram().run();
    }
}
