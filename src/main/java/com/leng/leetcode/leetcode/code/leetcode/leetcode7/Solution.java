package com.leng.leetcode.leetcode.code.leetcode.leetcode7;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author leng
 * @date 2019/3/15
 **/
public class Solution {



    public static int reverse(int i) {
        if (i == 0) {
            return 0;
        }
        long res = 0;
        while (i != 0) {
            res = res * 10 + i % 10;
            i = i / 10;
        }
        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)res;
        }
    }



    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }

}
