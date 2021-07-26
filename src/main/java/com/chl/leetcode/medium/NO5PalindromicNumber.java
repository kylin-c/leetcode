package com.chl.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname NO5PalindromicNumber
 * @Description TODO
 * @Date 2021/7/21 20:32
 * @Created by CaoHanLin
 */
public class NO5PalindromicNumber {
    public String longestPalindrome(String s) {
        StringBuffer str1 = new StringBuffer(s);
        StringBuffer str2 = str1.reverse();
        char[] c1 = str1.toString().toCharArray();
        char[] c2 = str2.toString().toCharArray();
        for (int i = 0; i < c1.length; i++) {
            
        }
        return s;
    }
}
