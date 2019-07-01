package com.leng.leetcode.leetcode.code.leetcode.leetcode506;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author leng
 * @date 2019/6/28
 **/
public class Solution {


    public String[] findRelativeRanks(int[] nums) {
        Map<Integer, String> map = new LinkedHashMap<>();
        for (int num : nums) {
            map.put(num, "");
        }
        quickSort(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                map.put(nums[i], "Gold Medal");
            } else if (i == nums.length - 2) {
                map.put(nums[i], "Silver Medal");
            } else if (i == nums.length - 3) {
                map.put(nums[i], "Bronze Medal");
            } else {
                map.put(nums[i], String.valueOf(nums.length - i));
            }
        }
        return map.values().toArray(new String[0]);
    }


    public void quickSort(int[] nums, int left, int right) {
        int tmpLeft = left;
        int tmpRight = right;
        if (tmpLeft < tmpRight) {
            int tmp = nums[tmpLeft];
            while (tmpLeft != tmpRight) {
                if (tmpRight > tmpLeft && nums[tmpRight] >= tmp) {
                    tmpRight--;
                }
                nums[tmpLeft] = nums[tmpRight];
                if (tmpRight > tmpLeft && nums[tmpLeft] <= tmp) {
                    tmpLeft++;
                }
                nums[tmpRight] = nums[tmpLeft];
            }
            nums[tmpRight] = tmp;
            quickSort(nums, left, tmpLeft - 1);
            quickSort(nums, tmpRight + 1, right);
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {5, 4, 3, 2, 1};
        String[] ss = solution.findRelativeRanks(nums);
    }
}
