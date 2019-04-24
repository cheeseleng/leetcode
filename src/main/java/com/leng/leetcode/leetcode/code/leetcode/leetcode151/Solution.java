package com.leng.leetcode.leetcode.code.leetcode.leetcode151;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leng
 * @date 2019/4/24
 **/
public class Solution {


    public String reverseWords(String s) {
        List<String> res = new ArrayList<>();
        for (String s1 : s.split(" ")) {
            if (!"".equals(s1.trim())) {
                res.add(s1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = res.size()-1;i>=0;i--) {
            sb.append(res.get(i));
            sb.append(" ");
        }
        return sb.toString().trim();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseWords("a good   example"));
    }
}
