package com.leng.leetcode.leetcode.code.leetcode.leetcode49;

import java.util.*;

/**
 * @author leng
 * @date 2019/3/26
 **/
public class Solution {



    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s: strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sort = String.valueOf(c);
            if (res.containsKey(sort)) {
                List<String> list = res.get(sort);
                list.add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                res.put(sort, list);
            }
        }
        return new ArrayList<>(res.values());
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(solution.groupAnagrams(s));
    }
}
