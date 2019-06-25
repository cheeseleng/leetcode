package com.leng.leetcode.leetcode.code.leetcode.leetcode264;

/**
 * @author leng
 * @date 2019/4/28
 **/
public class Solution {




    public int nthUglyNumber(int n) {
        if (n <= 0) {
            return 0;
        }
        int[] result = new int[n];
        result[0] = 1;//作为第一个丑树
        int divisor2 = 0;
        int divisor3 = 0;
        int divisor5 = 0;
        for (int i = 1;i < n;i++) {
            int multiply2 = result[divisor2] * 2;
            int multiply3 = result[divisor3] * 3;
            int multiply5 = result[divisor5] * 5;
            int min = Math.min(multiply2,Math.min(multiply3,multiply5));
            //将最小的丑树放入结果集中，用于下一次计算
            result[i] = min;
            //找出对应此次计算最小丑树的因子，并移动指针指向下一次计算丑树对应的老丑树下标
            if (multiply2 == min) {
                divisor2++;
            }
            if (multiply3 == min) {
                divisor3++;
            }
            if (multiply5 == min) {
                divisor5++;
            }
        }
        return result[n-1];
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.nthUglyNumber(10));
    }
}
