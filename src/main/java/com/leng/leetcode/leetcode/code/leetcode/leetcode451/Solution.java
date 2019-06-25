package com.leng.leetcode.leetcode.code.leetcode.leetcode451;

import java.util.*;

/**
 * @author leng
 * @date 2019/5/16
 **/
public class Solution {



    public String frequencySort(String s) {
        Map<String, Integer> map = new HashMap<>();
        for (String ss : s.split("")) {
            if (map.containsKey(ss)) {
                Integer i = map.get(ss);
                i++;
                map.put(ss, i);
            } else {
                map.put(ss, 1);
            }
        }
        StringBuilder res = new StringBuilder();
        map = sortMapByValue(map);
        for (String sss : map.keySet()) {
            Integer ii = map.get(sss);
            for (int i=0;i<ii;i++) {
                res.append(sss);
            }
        }
        return res.toString();
    }


    public static Map<String, Integer> sortMapByValue(Map<String, Integer> oriMap) {
        if (oriMap == null || oriMap.isEmpty()) {
            return null;
        }
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(
                oriMap.entrySet());
        entryList.sort(new MapValueComparator());

        Iterator<Map.Entry<String, Integer>> iter = entryList.iterator();
        Map.Entry<String, Integer> tmpEntry;
        while (iter.hasNext()) {
            tmpEntry = iter.next();
            sortedMap.put(tmpEntry.getKey(), tmpEntry.getValue());
        }
        return sortedMap;
    }



    static class MapValueComparator implements Comparator<Map.Entry<String, Integer>> {

        @Override
        public int compare(Map.Entry<String, Integer> me1, Map.Entry<String, Integer> me2) {

            return me2.getValue().compareTo(me1.getValue());
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.frequencySort("tree"));
    }
}
