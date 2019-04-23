package com.leng.leetcode.leetcode.code.leetcode.leetcode136;

/**
 * @author leng
 * @date 2019/4/23
 **/
public class Solution {


    /**
     * 异或
     * @param nums 数组
     * @return
     */
    public int singleNumber(int[] nums) {
        int a = 0;
        for (int num : nums) {
            a = a ^ num;
        }
        return a;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4,1,2,1,2};
        System.out.println(solution.singleNumber(nums));
    }
}
