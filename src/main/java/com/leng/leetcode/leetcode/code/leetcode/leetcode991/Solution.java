package com.leng.leetcode.leetcode.code.leetcode.leetcode991;

/**
 * @author leng
 * @date 2019/3/29
 **/
public class Solution {



    public int brokenCalc(int X, int Y) {
        int ans = 0;
        while (Y > X) {
            ans++;
            if (Y % 2 == 1) {
                Y++;
            }
            else {
                Y /= 2;
            }
        }
        return ans + X - Y;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.brokenCalc(1, 1000000000));
    }
}
