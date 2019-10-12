package com.leng.leetcode.leetcode.code.leetcode.leetcode15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leng
 * @date 2019/10/12
 **/
public class Solution {


    /**
     * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
     *
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int k = 0; k < nums.length-1; k++) {
            int i = k + 1;
            int j = nums.length - 1;
            if (nums[k] > 0) {
                break;
            }
            if (k > 0) {
                if (nums[k-1] == nums[k]) {
                    continue;
                }
            }
            while (i < j) {
                int r = nums[k] + nums[i] + nums[j];
                if (r == 0) {
                    List<Integer> list = Arrays.asList(nums[k], nums[i], nums[j]);
                    res.add(list);
                    while (i < j && nums[j-1] == nums[j]) {
                        j--;
                    }
                    while (i < j && nums[i+1] == nums[i]) {
                        i++;
                    }
                    j--;
                    i++;
                } else if (r > 0) {
                    // 过滤重复值
                    while (i < j && nums[j-1] == nums[j]) {
                        j--;
                    }
                    j--;
                } else {
                    // 过滤重复值
                    while (i < j && nums[i+1] == nums[i]) {
                        i++;
                    }
                    i++;
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1, -1, -1, 1, 2, 2};
        System.out.println(solution.threeSum(nums));
    }

}
