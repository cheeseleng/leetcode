package com.leng.leetcode.leetcode.code.qlcode.qlcode2;

/**
 * @author leng
 * @date 2018/10/22
 *
 * http://www.qlcoder.com/task/7566
 **/
public class Solution {


    private static int[] good = {509,838,924,650,604,793,564,651,697,649,747,787,701,605,644};


    private static void getOptimal() {
        int maxWeight = 0;
        String maxMethod = "";

        for (int i = 0; i < 1 << good.length; i++) {
            StringBuilder method = new StringBuilder(Integer.toBinaryString(i));

            while (method.length() < good.length) {
                method.insert(0, "0");
            }
            int sum = 0;
            int limit = 5000;
            for (int j = 0; j < method.length(); j++) {
                if (method.charAt(j) == '1') {
                    sum += good[j];
                }
                if (sum > limit) {
                    break;
                }
            }
            if (sum <= limit && sum > maxWeight) {
                maxWeight = sum;
                maxMethod = method.toString();
            }
        }
        StringBuilder result = new StringBuilder();
        int resultWeight = 0;
        for (int j = 0; j < maxMethod.length(); j++) {
            if (maxMethod.charAt(j) == '1') {
                result.append(j + 1).append("-");
                resultWeight += good[j];
            }
        }
        if (result.length() > 0) {
            result = new StringBuilder(result.substring(0, result.length() - 1));
        }
        System.out.println(result);
        System.out.println(resultWeight);
    }


    public static void main(String[] args) {
        getOptimal();
    }

}
