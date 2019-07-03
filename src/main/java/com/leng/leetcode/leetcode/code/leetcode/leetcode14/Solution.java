package com.leng.leetcode.leetcode.code.leetcode.leetcode14;

/**
 * @author leng
 * @date 2019/7/2
 **/
public class Solution {


    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] ss = {"flower","flow","flight"};
        System.out.println(solution.longestCommonPrefix(ss));
    }
}
