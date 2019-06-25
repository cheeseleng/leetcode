package com.leng.leetcode.leetcode.code.leetcode.leetcode263;

/**
 * @author leng
 * @date 2019/4/28
 **/
public class Solution {



    public boolean isUgly(int num) {
        if (num == 1) {
            return true;
        }
        if (num == 0) {
            return false;
        }
        int a = 0;
        if (num % 2 == 0) {
            num = num / 2;
            a++;
        } else if (num % 3 == 0) {
            num = num / 3;
            a++;
        } else if (num % 5 == 0) {
            num = num / 5;
            a++;
        }
        if (a == 0) {
            return false;
        }
        return isUgly(num);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isUgly(0));
    }
}
