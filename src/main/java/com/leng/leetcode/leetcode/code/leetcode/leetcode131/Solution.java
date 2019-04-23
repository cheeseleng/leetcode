package com.leng.leetcode.leetcode.code.leetcode.leetcode131;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leng
 * @date 2019/4/23
 **/
public class Solution {

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backTrack(s.toCharArray(), 0, new ArrayList<>(), res);
        return res;
    }
    private static void backTrack(char[] s, int idx, List<String> cur, List<List<String>> res){
        if(idx == s.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i = idx; i < s.length; i++){
            if(isPalind(s, idx, i)){
                cur.add(new String(s, idx, i-idx+1));
                backTrack(s, i + 1, cur, res);
                cur.remove(cur.size()-1);
            }
        }
    }
    private static boolean isPalind(char[] s, int i, int j){
        while(i < j){
            if(s[i++] != s[j--]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.partition("aab"));
    }
}
