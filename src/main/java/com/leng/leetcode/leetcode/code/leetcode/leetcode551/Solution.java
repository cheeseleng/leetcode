package com.leng.leetcode.leetcode.code.leetcode.leetcode551;

/**
 * @author leng
 * @date 2019/7/2
 **/
public class Solution {


    public boolean checkRecord(String s) {
        int a = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if ('A' == s.charAt(i)) {
                a++;
                if (a > 1) {
                    return false;
                }
            }
            if (s.charAt(i) == 'L' && i < s.length() - 2) {
                if (s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') {
                    l++;
                    if (l > 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.checkRecord("PPALLL"));
    }
}
