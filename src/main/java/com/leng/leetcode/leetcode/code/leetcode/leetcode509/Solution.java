package com.leng.leetcode.leetcode.code.leetcode.leetcode509;

/**
 * @author leng
 * @date 2019/6/28
 **/
public class Solution {


    public int fib(int N) {
        if (N == 0) {
            return 0;
        } else if (N == 1) {
            return 1;
        } else {
            return fib(N - 1) + fib(N - 2);
        }
    }


    public int fibDp(int N) {
        if (N == 0 || N == 1) {
            return N;
        }
        int[] dp = new int[N + 1];
        dp[1] = dp[2] = 1;
        for (int i = 3; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[N];
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fibDp(5));
    }
}
