package com.blind75.arrays.easy;

import com.blind75.helper.Task;

import java.util.Arrays;

public class ValidAnagram extends Task {
    @Override
    protected void run() {
        String s = "anagram";
        String t = "nagaram";
        System.out.println("bruteForce ==>" + bruteForce(s, t));
    }

    private boolean bruteForce(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] si = new int[26];
        int[] ti = new int[26];
        for (int i = 0; i < s.length(); i++) {
            si[s.charAt(i) - 'a']++;
            ti[t.charAt(i) - 'a']++;
        }
        return Arrays.equals(si,ti);
    }

    public static void main(String[] args) {
        new ValidAnagram().run();
    }
}
