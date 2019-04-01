package com.leng.leetcode.leetcode.code.leetcode.leetcode20;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author leng
 * @date 2019/3/29
 **/
public class Solution {


    public static int a = 0;
    public static int b = 0;
    public static int c = 0;


    public boolean isValid(String s) {
        while (s.contains("()")||s.contains("{}")||s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        return "".equals(s);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("{[]}"));
    }
}
