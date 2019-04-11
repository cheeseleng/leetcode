package com.leng.leetcode.leetcode.code.leetcode.leetcode70;

/**
 * @author leng
 * @date 2019/4/11
 **/
public class Solution {


    public int climbStairs(int n) {
        //爬第k阶台阶，可以是从第k-1阶爬上来，也可以是从第k-2阶爬上来，所以，爬上第k阶楼梯的方法为爬上第k-1阶楼梯的方法+爬上第k-2阶楼梯的方法
        //动态规划实现
        if (n == 1) {
            return 1;
        }

        int[] dp = new int[n + 1];  //dp[k]为爬上第k阶楼梯的方法数
        dp[1] = 1;
        dp[2] = 2;

        for (int k = 3; k <= n; k++) {
            dp[k] = dp[k - 2] + dp[k - 1];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.climbStairs(100));
    }
}
