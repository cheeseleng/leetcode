package com.leng.leetcode.leetcode.code.leetcode.leetcode873;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leng
 * @date 2019/3/26
 **/
public class Solution {


    public int lenLongestFibSubseq(int[] A) {
        int N = A.length;
        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < N; ++i) {
            index.put(A[i], i);
        }

        Map<Integer, Integer> longest = new HashMap<>();
        int ans = 0;

        for (int k = 0; k < N; ++k) {
            for (int j = 0; j < k; ++j) {
                int i = index.getOrDefault(A[k] - A[j], -1);
                if (i >= 0 && i < j) {
                    int cand = longest.getOrDefault(i * N + j, 2) + 1;
                    longest.put(j * N + k, cand);
                    ans = Math.max(ans, cand);
                }
            }
        }
        return ans >= 3 ? ans : 0;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1,2,3,4,5,6,7,8};
        System.out.println(solution.lenLongestFibSubseq(a));
    }

}
