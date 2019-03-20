package com.leng.leetcode.leetcode.code.leetcode.leetcode8;

import org.springframework.util.StringUtils;

import java.math.BigDecimal;


/**
 * @author leng
 * @date 2019/3/15
 **/
public class Solution {


    public static int myAtoi(String str) {
        StringBuilder res = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        String[] input = str.trim().split("");
        String a = "-";
        String b = " ";
        String c = "+";
        if (input.length == 1) {
            if (getIntString(input[0]) != null) {
                return new BigDecimal(str).intValue();
            } else {
                return 0;
            }
        } else if (getIntString(input[0]) == null && !input[0].equals(a) && !input[0].equals(b) && !input[0].equals(c)) {
            return 0;
        } else if (getIntString(input[1]) == null && getIntString(input[0]) == null) {
            return 0;
        }
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals(a) || input[i].equals(b) || input[i].equals(c)) {
                if (i != input.length - 1) {
                    if (getIntString(input[i + 1]) != null) {
                        if (tmp.length() != 0) {
                            res = tmp;
                            break;
//                            tmp = new StringBuilder();
                        }
                        if (!input[i].equals(b)) {
                            tmp.append(input[i]);
                        }
                    }
                } else {
                    res = tmp;
                }
            } else {
                if (getIntString(input[i]) != null) {
                    tmp.append(input[i]);
                    if (i == input.length - 1) {
                        if (res.length() < tmp.length()) {
                            res = tmp;
                        }
                    }
                } else {
                    res = tmp;
                    break;
//                    if (res.length() < tmp.length()) {
//                        res = tmp;
//                    }
//                    tmp = new StringBuilder();
                }
            }
        }
        if (res.length() == 0) {
            return 0;
        }
        BigDecimal r = new BigDecimal(res.toString());
        if (r.compareTo(new BigDecimal(Integer.MIN_VALUE)) < 0) {
            return Integer.MIN_VALUE;
        } else if (r.compareTo(new BigDecimal(Integer.MAX_VALUE)) > 0) {
            return Integer.MAX_VALUE;
        } else {
            return new BigDecimal(res.toString()).intValue();
        }
    }


    private static String getIntString(String s) {
        try {
            return new BigDecimal(s).toString();
        } catch (NumberFormatException e) {
            return null;
        }
    }


    public static void main(String[] args) {
        System.out.println(myAtoi("9223372036854775808"));
    }
}
