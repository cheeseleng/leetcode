package com.leng.leetcode.leetcode.code.leetcode.leetcode442;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leng
 * @date 2019/5/8
 **/
public class Solution {


    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> rs = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            if(nums[Math.abs(nums[i])-1]<0) {
                rs.add(Math.abs(nums[i]));
            }else {
                nums[Math.abs(nums[i])-1]*=-1;
            }
        }

        return rs;
    }


    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int[] nums = {4,3,2,7,8,2,3,1};
//        System.out.println(solution.findDuplicates(nums));
        System.out.println(System.getProperty("java.library.path"));
    }
}
