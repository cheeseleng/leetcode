package com.leng.leetcode.leetcode.code.leetcode.leetcode9;

/**
 * @author leng
 * @date 2019/7/2
 **/
public class Solution {


    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        StringBuilder s = new StringBuilder(String.valueOf(x)).reverse();
        return s.toString().equals(String.valueOf(x));
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(-32123));
    }
}
