package com.leng.leetcode.leetcode.code.qlcode.qlcode1;

/**
 * @author leng
 * @date 2018/10/19
 * <p>
 * http://www.qlcoder.com/task/751e
 **/

public class Solution {


    private static Integer get2333Num() {
        int result = 0;
        for (int i = 1; i < 10000; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                result += 1;
            }
            if (result == 2333) {
                return i;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println(Solution.get2333Num());
    }
}
