package com.example.demo.leetcode.leetcode3;

import java.util.*;

/**
 * @author leng
 * @date 2017/12/19
 **/
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) {
            return 1;
        }
        if (s.isEmpty()) {
            return 0;
        }
        List<String> l = new ArrayList<>();
        int length = 0;
        for (String s1 : s.split("")) {
            if (!l.contains(s1)) {
                l.add(s1);
                if (length < l.size()) {
                    length = l.size();
                }
            } else {
                if (length < l.size()) {
                    length = l.size();
                }
                Iterator<String> it = l.iterator();
                while(it.hasNext()){
                    if (!l.contains(s1)) {
                        break;
                    }
                    it.next();
                    it.remove();
                }
                l.add(s1);
            }
        }
        return length;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("nfpdmpi"));
        System.out.println(solution.lengthOfLongestSubstring("au"));
    }
}
