package com.leng.leetcode.leetcode.code.leetcode.leetcode984;

/**
 * @author leng
 * @date 2019/3/27
 **/
public class Solution {



    public String strWithout3a3b(int A, int B) {
        StringBuilder res = new StringBuilder();
        if (A > 2 || B > 2) {
            while (A > 0 && B > 0) {
                if (B > A) {
                    if (res.toString().endsWith("b")) {
                        res.append("a");
                        A--;
                    } else {
                        if (B > 1) {
                            res.append("bb");
                            B = B - 2;
                        } else {
                            res.append("b");
                            B--;
                        }
                    }
                } else {
                    if (res.toString().endsWith("a")) {
                        res.append("b");
                        B--;
                    } else {
                        if (A > 1) {
                            res.append("aa");
                            A = A - 2;
                        } else {
                            res.append("a");
                            A--;
                        }
                    }
                }
            }
        }
        for (int i=0;i<A;i++) {
            res.append("a");
        }
        for (int i=0;i<B;i++) {
            res.append("b");
        }
        return res.toString();
    }


    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.strWithout3a3b(1, 3));
    }
}
