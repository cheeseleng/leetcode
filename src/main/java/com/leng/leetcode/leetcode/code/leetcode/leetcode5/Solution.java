package com.leng.leetcode.leetcode.code.leetcode.leetcode5;

/**
 * @author leng
 * @date 2017/12/28
 **/
public class Solution {

    public String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];

        int i, j;

        for (i = 0; i < s.length(); i++) {
            for (j = 0; j < s.length(); j++) {
                if (i >= j) {
                    //当i == j 的时候，只有一个字符的字符串; 当 i > j 认为是空串，也是回文
                    dp[i][j] = true;
                } else {
                    //其他情况都初始化成不是回文
                    dp[i][j] = false;
                }
            }
        }

        return null;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.longestPalindrome("aa");
    }
}
