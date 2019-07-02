package com.leng.leetcode.leetcode.code.leetcode.leetcode520;

/**
 * @author leng
 * @date 2019/7/1
 **/
public class Solution {


    public boolean detectCapitalUse(String word) {
        int upper = 0;
        boolean res = true;
        for (int i = 0; i < word.length(); i++) {
            if (i < word.length() - 1 && Character.isUpperCase(word.charAt(i + 1))) {
                upper += 1;
                res =  false;
            }
        }
        if (Character.isUpperCase(word.charAt(0))) {
            upper += 1;
        }
        return res || upper == word.length();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.detectCapitalUse("aA"));
        System.out.println(solution.detectCapitalUse("A"));
        System.out.println(solution.detectCapitalUse("a"));
        System.out.println(solution.detectCapitalUse("Aa"));
        System.out.println(solution.detectCapitalUse("AaA"));
        System.out.println(solution.detectCapitalUse("Aaa"));
        System.out.println(solution.detectCapitalUse("AAa"));
        System.out.println(solution.detectCapitalUse("aaA"));
        System.out.println(solution.detectCapitalUse("aAA"));
        System.out.println(solution.detectCapitalUse("AAA"));
        System.out.println(solution.detectCapitalUse("aaa"));
    }
}
