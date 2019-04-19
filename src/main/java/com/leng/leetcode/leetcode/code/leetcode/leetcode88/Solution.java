package com.leng.leetcode.leetcode.code.leetcode.leetcode88;

import java.util.Arrays;

/**
 * @author leng
 * @date 2019/4/19
 **/
public class Solution {



    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m-- + n-- - 1;
        while (m >= 0 && n >= 0) {
            nums1[p--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }

        while (n >= 0) {
            nums1[p--] = nums2[n--];
        }
    }


    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        Solution solution = new Solution();
        solution.merge(nums1, 3, nums2, 3);
    }
}
