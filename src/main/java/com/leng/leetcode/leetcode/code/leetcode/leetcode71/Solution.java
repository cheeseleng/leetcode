package com.leng.leetcode.leetcode.code.leetcode.leetcode71;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * @author leng
 * @date 2019/4/12
 **/
public class Solution {


    /**
     * 1.当遇到元素为''或者'.'时,直接删除.
     * 2.遇到元素为'..'时,如果此时i=0,则直接删除.否则将'..'与前一个元素一起删除.这个操作删除了2个元素,所以i -= 1
     * 3.如果以上两种情况都没有遇见的话,直接i += 1.
     */
    public String simplifyPath(String path) {
        if (path == null || path.length() == 0) {
            return path;
        }
        String[] strs = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String s : strs) {
            switch (s) {
                case "":
                case ".":
                    break;
                case "..":
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    break;
                default:
                    stack.push(s);
                    break;
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }
        StringBuilder ret = new StringBuilder();
        while (!stack.isEmpty()) {
            ret.insert(0, "/" + stack.pop());
        }
        return ret.toString();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.simplifyPath("/a/./b/../../c/"));
    }
}
