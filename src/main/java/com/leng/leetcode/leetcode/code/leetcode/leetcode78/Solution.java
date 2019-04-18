package com.leng.leetcode.leetcode.code.leetcode.leetcode78;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author leng
 * @date 2019/4/18
 **/
public class Solution {


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int num : nums) {
            List<List<Integer>> res1 = new ArrayList<>();
            for (List<Integer> re : res) {
                List<Integer> tmp = new ArrayList<>(re);
                tmp.add(num);
                res1.add(tmp);
            }
            res.addAll(res1);
        }
        return res;
    }


    public static <T> List<T> depCopy(List<T> srcList) {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        try {
            ObjectOutputStream out = new ObjectOutputStream(byteOut);
            out.writeObject(srcList);

            ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
            ObjectInputStream inStream = new ObjectInputStream(byteIn);
            List<T> destList = (List<T>) inStream.readObject();
            return destList;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Solution solution = new Solution();
        System.out.println(solution.subsets(nums));
    }
}
