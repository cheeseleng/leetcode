package com.leng.leetcode.leetcode.code.leetcode.leetcode121;

/**
 * @author leng
 * @date 2019/3/29
 **/
public class Solution {



    public int maxProfit(int[] prices) {
        int res=0;
        for (int i=0;i<prices.length;i++) {
            for (int j=0;j<prices.length;j++) {
                if (j>i) {
                    if (prices[j]>prices[i]) {
                        res = Math.max(res, prices[j]-prices[i]);
                    }
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {7,6,4,3,1};
        System.out.println(solution.maxProfit(prices));
    }
}
