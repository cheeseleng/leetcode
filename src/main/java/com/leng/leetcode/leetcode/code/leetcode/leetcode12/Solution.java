package com.leng.leetcode.leetcode.code.leetcode.leetcode12;

import java.util.*;

/**
 * @author leng
 * @date 2019/3/20
 **/
public class Solution {


    public static final Map<Integer, String> map = new HashMap<>();

    public static final List<Integer> list = new ArrayList<>();

    Solution() {
        map.put(0, "");
        map.put(1, "I");
        map.put(2, "II");
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(6, "VI");
        map.put(7, "VII");
        map.put(8, "VIII");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");

        list.add(1);
        list.add(10);
        list.add(100);
        list.add(1000);
    }


    public String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        if (map.containsKey(num)) {
            return map.get(num);
        } else {
            List<Integer> nums = getIntegers(num);
            for (int i=0;i<nums.size();i++) {
                res.append(getSingleRoman(nums.get(i), (int) Math.pow(10, nums.size() - i - 1)));
            }
        }
        return res.toString();
    }


    private List<Integer> getIntegers(int num) {
        List<Integer> nums = new ArrayList<>();
        String[] ss = String.valueOf(num).split("");
        for (String s : ss) {
            nums.add(Integer.valueOf(s));
        }
        return nums;
    }



    private String getSingleRoman(int i, int j) {
        if (i == 0 && j == 1) {
            return "";
        }
        if (list.contains(j) && map.containsKey(i * j)) {
            return map.getOrDefault(i * j, "");
        } else if (i < 5) {
            if (list.contains(j)) {
                StringBuilder sb = new StringBuilder();
                for (int a = 0; a < i; a++) {
                    sb.append(map.get(j));
                }
                return sb.toString();
            } else {
                int b = String.valueOf(j).split("").length;
                StringBuilder sb = new StringBuilder();
                sb.append(map.get(j));
                for (int a = 0; a < i; a++) {
                    sb.append(map.get((int) Math.pow(10, b-1)));
                }
                return sb.toString();
            }
        } else {
            i = i - 5;
            j = j * 5;
            return getSingleRoman(i, j);
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.intToRoman(1994));
    }


}
