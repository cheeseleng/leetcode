package com.leng.leetcode.leetcode.code.leetcode.leetcode459;

/**
 * @author leng
 * @date 2019/6/25
 **/
public class Solution {


    public boolean repeatedSubstringPattern(String s) {
        String ss = s + s;
        ss = ss.substring(1, ss.length()-1);
        return ss.contains(s);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.repeatedSubstringPattern("abcabcabcabc"));
    }
}
