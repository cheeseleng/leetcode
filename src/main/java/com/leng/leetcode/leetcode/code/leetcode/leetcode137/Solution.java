package com.leng.leetcode.leetcode.code.leetcode.leetcode137;

/**
 * @author leng
 * @date 2019/4/24
 **/
public class Solution {



    public int singleNumber(int[] nums) {
        int one = 0, two = 0, three;
        for (int num : nums) {
            // two的相应的位等于1，表示该位出现2次
            two |= (one & num);
            // one的相应的位等于1，表示该位出现1次
            one ^= num;
            // three的相应的位等于1，表示该位出现3次
            three = (one & two);
            // 如果相应的位出现3次，则该位重置为0
            two &= ~three;
            one &= ~three;
        }
        return one;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums ={2,1,1,1};
        solution.singleNumber(nums);
    }

}
