package com.leng.leetcode.leetcode.code.leetcode.leetcode165;

/**
 * @author leng
 * @date 2019/4/25
 **/
public class Solution {




    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int p1=0,p2=0;
        int sum1=0,sum2=0;
        while(p1<v1.length || p2<v2.length){
            if(p1<v1.length){
                sum1=Integer.parseInt(v1[p1++]);
            }
            if(p2<v2.length){
                sum2=Integer.parseInt(v2[p2++]);
            }
            if(sum1<sum2){
                return -1;
            }else if(sum1>sum2){
                return 1;
            }
            sum1=0;
            sum2=0;
        }
        return 0;
    }
}
