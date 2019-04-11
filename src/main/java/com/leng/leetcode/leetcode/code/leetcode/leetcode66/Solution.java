package com.leng.leetcode.leetcode.code.leetcode.leetcode66;

/**
 * @author leng
 * @date 2019/4/11
 **/
public class Solution {



    public int[] plusOne(int[] digits) {
        int[] res = new int[digits.length+1];
        res[0] = 1;
        for (int i=digits.length-1;i>=0;i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                if (i == 0) {
                    return res;
                } else {
                    digits[i] = 0;
                }
            }
        }
        return digits;
    }


    public static void main(String[] args) {
        int[] digits1 = {9,9,9,9};
        int[] digits2 = {9};
        Solution solution = new Solution();
        int[] res1 = solution.plusOne(digits1);
        int[] res2 = solution.plusOne(digits2);
    }
}
