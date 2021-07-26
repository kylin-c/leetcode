package com.chl.leetcode.medium;

import java.util.*;

/**
 * @Classname NO3NoRepetitionStr
 * @Description TODO
 * @Date 2021/7/15 15:39
 * @Created by CaoHanLin
 */
public class NO3NoRepetitionStr {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    private static int lengthOfLongestSubstring(String str) {
        Set<Character> window = new HashSet<Character>();
        int rk = 0,result = 0, len = str.length();
        for (int i = 0; i < len; i++) {
            if(i!=0){
                //为什么要i - 1? 因为如果一旦不满足下面的while循环我们就要弹出while而执行for的增量，for指针要走到下一个了我，
                //要移除的是窗口最左边的元素
                window.remove(str.charAt(i - 1));
            }
            while ( rk < len && !window.contains(str.charAt(rk))){
                window.add(str.charAt(rk));
                ++ rk ;
            }
            result = Math.max(result , window.size());
        }
        return result;
    }


    public static int lengthOfLongestSubstringX(String s) {
        //给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
        /**
         * 输入: s = "abcabcbb"
         * 输出: 3
         * 解释: 因为无重复字符的最长子串是 "abb"，所以其长度为 3。
         */
        Map<Character, Integer> char_index = new HashMap<Character, Integer>();
        TreeSet<Integer> len = new TreeSet<Integer>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (char_index.containsKey(chars[i])) {
                len.add( i - char_index.get(chars[i]));
            }
            char_index.put(chars[i],i);
        }
        return len.size()==0?(chars.length==1?1:chars.length):len.last();
    }


}
