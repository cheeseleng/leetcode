package com.leng.leetcode.leetcode.code.leetcode.leetcode287;

/**
 * @author leng
 * @date 2019/5/6
 **/
public class Solution {



    public int findDuplicate(int[] nums) {
        int fast = 0;
        int slow = 0;
        while (true) {
            fast = nums[nums[fast]];
            slow = nums[slow];
            if (fast == slow) {
                fast = 0;
                while (nums[fast] != nums[slow]) {
                    fast = nums[fast];
                    slow = nums[slow];
                }
                return nums[slow];
            }
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,3,4,2,2};
        System.out.println(solution.findDuplicate(nums));
    }
}
