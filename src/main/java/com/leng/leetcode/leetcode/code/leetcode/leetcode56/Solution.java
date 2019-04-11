package com.leng.leetcode.leetcode.code.leetcode.leetcode56;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leng
 * @date 2019/4/10
 **/
public class Solution {




    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() == 1) {
            return intervals;
        }
        for (int i=0;i<intervals.size();i++) {
            for (int j=0;j<intervals.size();j++) {
                if (i<j) {
                    if (intervals.get(i).start > intervals.get(j).start) {
                        // swap
                        Interval tmp = intervals.get(i);
                        intervals.set(i, intervals.get(j));
                        intervals.set(j, tmp);
                    }
                }
            }
        }
        List<Interval> res = new ArrayList<>();
        int i=0;
        while (i<intervals.size()-1) {
            if (intervals.get(i).end >= intervals.get(i+1).start) {
                Interval tmp = new Interval(intervals.get(i).start, Math.max(intervals.get(i).end, intervals.get(i+1).end));
                intervals.set(i, null);
                intervals.set(i+1, tmp);
            }
            i++;
        }
        for (Interval interval : intervals) {
            if (interval != null) {
                res.add(interval);
            }
        }
        return res;
    }


    public static void main(String[] args) {
        Interval i1 = new Interval(4,5);
        Interval i2 = new Interval(1,4);
        Interval i3 = new Interval(0,1);
//        Interval i4 = new Interval(15,18);
        List<Interval> intervals = new ArrayList<>();
        intervals.add(i1);
        intervals.add(i2);
        intervals.add(i3);
//        intervals.add(i4);
        Solution solution = new Solution();
        System.out.println(solution.merge(intervals));

    }
}
