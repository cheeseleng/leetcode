package com.leng.leetcode.leetcode.code.leetcode.leetcode260;

/**
 * @author leng
 * @date 2019/4/28
 **/
public class Solution {


    public int[] singleNumber(int[] nums) {
        int[] re = new int[2];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum ^= nums[i];
        }
        int flag = sum & (-sum);
        for (int num : nums) {
            if ((num & flag) == 0) {
                re[0] ^= num;
            } else {
                re[1] ^= num;
            }
        }
        return re;
    }


    public static void main(String[] args) {
        int[] nums = {1 , 2 , 1 , 3 , 2 , 5};
        Solution solution = new Solution();
        System.out.println(solution.singleNumber(nums));
    }


}
