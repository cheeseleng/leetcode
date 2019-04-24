package com.leng.leetcode.leetcode.code.leetcode.leetcode135;

/**
 * @author leng
 * @date 2019/4/23
 **/
public class Solution {


    /**
     * 先给每个人一个糖，初始化tmp数组为额外糖果。
     * 从左向右遍历，如果i+1分数高，tmp[i+1]=tmp[i]+1。
     * 再从后往前遍历，如果i比i+1分数高，那么比较tmp[i]和tmp[i+1]+1，如果tmp[i]小，更新。
     * 假如分数i-1<i，那么下一次继续检查，如果分数i-1>i，因为第一次tmp[i]>tmp[i-1]，从右往左更新tmp[i]只可能增加，依然满足大小关系
     */
    public int candy(int[] ratings) {
        int[] res = new int[ratings.length];
        for (int i=0;i<ratings.length;i++) {
            res[i] = 1;
        }
        for (int i=0;i<ratings.length-1;i++) {
            if (ratings[i+1] > ratings[i]) {
                res[i+1] = res[i]+1;
            }
        }
        for (int i=ratings.length-2;i>=0;i--) {
            if (ratings[i]>ratings[i+1]) {
                if (res[i]<res[i+1]+1) {
                    res[i] = res[i+1]+1;
                }
            }
        }
        int result = 0;
        for (int a:res) {
            result = result + a;
        }
        return result;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ratings = new int[]{1,2,87,87,87,2,1};
        int[] ratings1 = new int[]{1,0,2};
        int[] ratings2= new int[]{1,2,2};
        System.out.println(solution.candy(ratings));
        System.out.println(solution.candy(ratings1));
        System.out.println(solution.candy(ratings2));
    }
}
