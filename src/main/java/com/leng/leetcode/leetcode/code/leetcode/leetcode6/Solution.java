package com.leng.leetcode.leetcode.code.leetcode.leetcode6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leng
 * @date 2019/3/14
 **/
public class Solution {



    public static String convert(String s, int numRows) {
        String[] strings = s.split("");
        List<List<String>> resultList = new ArrayList<>();
        List<String> row = new ArrayList<>();
        int order = 0;
        for (int i=0; i<s.length(); i++) {
            if (row.size() >= numRows) {
                resultList.add(row);
                row = new ArrayList<>();
            }
            row.add(strings[order]);
            order += 1;
        }
        StringBuffer result = new StringBuffer();
        for (int i=0; i<numRows; i++) {
            int finalI = i;
            resultList.forEach(x -> result.append(x.get(finalI)));
        }
        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }



}
