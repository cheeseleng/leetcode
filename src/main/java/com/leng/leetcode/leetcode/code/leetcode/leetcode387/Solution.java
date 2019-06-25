package com.leng.leetcode.leetcode.code.leetcode.leetcode387;

/**
 * @author leng
 * @date 2019/6/13
 **/
public class Solution {


    public int firstUniqChar(String s) {
        if (s.length() == 1) {
            return 0;
        }
        int index = 0;
        String[] ss = s.split("");
        while (index < s.length()) {
            String nowString = ss[index];
            int start = 0;
            while (start < s.length()) {
                if (start == index) {
                    start++;
                    continue;
                }
                if (ss[start].equals(nowString)) {
                    index++;
                    break;
                } else {
                    start++;
                }
            }
            if (start == s.length()) {
                return index;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstUniqChar("dddccdbba"));
    }
}
