package com.leng.leetcode.leetcode.code.leetcode.leetcode485;

/**
 * @author leng
 * @date 2019/6/25
 **/
public class Solution {



    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int tmp = 0;
        int res = 0;
        while (i < nums.length) {
            if (nums[i] == 0) {
                res = Math.max(tmp, res);
                tmp = 0;
            } else {
                tmp++;
            }
            i++;
        }
        return Math.max(tmp, res);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1};
        System.out.println(solution.findMaxConsecutiveOnes(nums));
    }
}
