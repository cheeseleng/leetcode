package com.leng.leetcode.leetcode.code.leetcode.leetcode4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leng
 * @date 2017/12/19
 **/
public class Solution {


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> arrays = new ArrayList<>();
        // 合并数组长度
        int size = nums1.length + nums2.length;
        // 中位数坐标数组
        int[] middlePoint;

        if (size % 2 == 0) {
            middlePoint = new int[]{size / 2 - 1, size / 2};
        } else {
            middlePoint = new int[]{size / 2};
        }

        if (nums1.length == 0) {
            arrays.add(nums2[middlePoint[0]]);
            if (middlePoint.length == 2) {
                arrays.add(nums2[middlePoint[1]]);
            }
        } else if (nums2.length == 0) {
            arrays.add(nums1[middlePoint[0]]);
            if (middlePoint.length == 2) {
                arrays.add(nums1[middlePoint[1]]);
            }
        } else {
            // 数组坐标
            int[] points = new int[]{0, 0};

            // 取两数组最大的长度
            int maxLength = Math.max(nums1.length, nums2.length);
            for (int i = 0;i < maxLength;i++) {
                if (compare(points, nums1, nums2, middlePoint[0], arrays)) {
                    break;
                }
            }
            if (middlePoint.length == 2) {
                compare(points, nums1, nums2, middlePoint[1], arrays);
            }
        }
        return arrays.stream().mapToInt(Integer::intValue).sum() / (double) arrays.size();
    }


    private boolean compare(int[] points, int[] nums1, int[] nums2, int middle, List<Integer> arrays) {
        if (points[0] >= nums1.length) {
            points[1] = points[1] + 1;
            if (points[0] + points[1] - 1 == middle) {
                arrays.add(nums2[points[1] - 1]);
                return true;
            }
        } else if (points[1] >= nums2.length) {
            points[0] = points[0] + 1;
            if (points[0] + points[1] - 1 == middle) {
                arrays.add(nums1[points[0] - 1]);
                return true;
            }
        } else if (nums1[points[0]] >= nums2[points[1]]) {
            points[1] = points[1] + 1;
            if (points[0] + points[1] - 1 == middle) {
                arrays.add(nums2[points[1] - 1]);
                return true;
            }
        } else {
            points[0] = points[0] + 1;
            if (points[0] + points[1] - 1 == middle) {
                arrays.add(nums1[points[0] - 1]);
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num1 = new int[]{1, 2};
        int[] num2 = new int[]{3};
        System.out.println(solution.findMedianSortedArrays(num1, num2));
    }
}
