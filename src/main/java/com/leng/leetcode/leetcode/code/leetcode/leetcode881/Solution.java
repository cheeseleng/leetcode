package com.leng.leetcode.leetcode.code.leetcode.leetcode881;

import java.util.Arrays;

/**
 * @author leng
 * @date 2019/3/28
 **/
public class Solution {


    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = people.length-1;
        int res = 0;
        while (i<j) {
            if (people[i] + people[j] <= limit) {
                res++;
                i++;
                j--;
            } else {
                res++;
                j--;
            }
        }
        if (i == j) {
            res++;
        }
        return res;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] people = {3,5,3,4};
        System.out.println(solution.numRescueBoats(people, 3));
    }
}
