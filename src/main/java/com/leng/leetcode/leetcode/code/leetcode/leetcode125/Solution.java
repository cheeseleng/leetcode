package com.leng.leetcode.leetcode.code.leetcode.leetcode125;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author leng
 * @date 2019/4/22
 **/
public class Solution {



    public boolean isPalindrome(String s) {
        List<String> l = new ArrayList<>();
        for (String tmp : s.split("")) {
            if (isNumberic(tmp)) {
                l.add(tmp);
            } else if (check(tmp)) {
                l.add(tmp.toLowerCase());
            }
        }
        int i = 0;
        while (i<l.size()/2) {
            if (!l.get(i).equals(l.get(l.size()-1-i))) {
                return false;
            }
            i++;
        }
        return true;
    }


    /**
     * 判断字符串是否为数字
     * @param str
     * @return
     */
    public static boolean isNumberic(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    /**
     * 判断一个字符串是否为字母
     * @param fstrData
     * @return
     */
    public static boolean check(String fstrData) {
        char c = fstrData.charAt(0);
        if (((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
            return true;
        } else {
            return false;
        }
    }

}
