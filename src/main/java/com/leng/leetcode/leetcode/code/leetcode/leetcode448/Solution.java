package com.leng.leetcode.leetcode.code.leetcode.leetcode448;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leng
 * @date 2019/5/8
 **/
public class Solution {


    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            nums[Math.abs(num) - 1] = -Math.abs(nums[Math.abs(num) - 1]);

        }
        for (int i=0;i<nums.length;i++) {
            if (nums[i] > 0) {
                res.add(i+1);
            }
        }
        return res;
    }


    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int[] nums = {4,3,2,7,8,2,3,1};
//        System.out.println(solution.findDisappearedNumbers(nums));
        System.out.println(2^11);
        System.out.println(3^11);
    }
}
