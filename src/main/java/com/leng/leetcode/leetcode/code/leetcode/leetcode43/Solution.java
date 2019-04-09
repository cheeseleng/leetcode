package com.leng.leetcode.leetcode.code.leetcode.leetcode43;

import java.math.BigInteger;

/**
 * @author leng
 * @date 2019/4/9
 **/
public class Solution {




    public String multiply(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int[] mul = new int[num1.length()+num2.length()];
        for (int i=num1.length()-1;i>=0;--i) {
            for (int j=num2.length()-1;j>=0;--j) {
                int bitmul = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
                bitmul += mul[i+j+1]; // 先加低位判断是否有新的进位

                mul[i+j] += bitmul / 10;
                mul[i+j+1] = bitmul % 10;
            }
        }
        int i=0;
        while(i < mul.length-1 && mul[i] == 0) {
            i++;
        }
        for (;i<mul.length;i++) {
            res.append(mul[i]);
        }
        return res.toString();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.multiply("200000", "3"));
    }
}
