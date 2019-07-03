package com.leng.leetcode.leetcode.code.leetcode.leetcode557;

/**
 * @author leng
 * @date 2019/7/2
 **/
public class Solution {


    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        for (String s1 : s.split(" ")) {
            res.append(reverse(s1)).append(" ");
        }
        return res.deleteCharAt(res.length()-1).toString();
    }


    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseWords("Let's take LeetCode contest"));
    }
}
