package com.leng.leetcode.leetcode.code.leetcode.leetcode997;

import java.util.*;

/**
 * @author leng
 * @date 2019/4/10
 **/
public class Solution {

    public int findJudge(int N, int[][] trust) {
        List<Integer> a = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int[] beTrust = new int[N+1];
        for (int[] tmp:trust) {
            a.add(tmp[0]);
            beTrust[tmp[1]]++;
        }
        for (int i=beTrust.length-1;i>0;i--) {
            if (beTrust[i]==N-1&&!a.contains(i)) {
                res.add(i);
            }
        }
        if (res.size() != 1) {
            return -1;
        } else {
            return res.get(0);
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] trust = {{1,2}};
        System.out.println(solution.findJudge(2, trust));
    }
}
