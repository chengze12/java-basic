package com.chengze.Algrithom;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LC438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res= new LinkedList<>();
        char[] chars= p.toCharArray();
        Arrays.sort(chars);
        String string= new String(chars);
        int l=p.length();
        for(int i=0; i<s.length()-l; i++){
            String temp= s.substring(i, i+l);
            char[] tempchars=temp.toCharArray();
            Arrays.sort(tempchars);
            String tempstring= new String(tempchars);
            if(tempstring.equals(string)){
                res.add(i);
            }
        }
        System.out.println(res);
        return res;
    }
    public static void main(String[] args){
        LC438 solution= new LC438();
        String s="cbaebabacd";
        String p="abc";
        solution.findAnagrams(s,p);
    }
}
