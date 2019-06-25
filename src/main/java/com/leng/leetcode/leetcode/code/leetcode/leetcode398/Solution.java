package com.leng.leetcode.leetcode.code.leetcode.leetcode398;

import java.util.Random;

/**
 * @author leng
 * @date 2019/5/8
 **/
public class Solution {


    private int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;
    }

    public int pick(int target) {
        Random r = new Random();
        int result = 0;
        int cnt = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                cnt++;
                if(r.nextInt(cnt) == 0) {
                    result  = i;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3};
        Solution solution = new Solution(nums);
        System.out.println(solution.pick(3));
    }
}
