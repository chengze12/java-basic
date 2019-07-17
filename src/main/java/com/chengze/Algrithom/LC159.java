package com.chengze.Algrithom;

import java.util.HashMap;

public class LC159 {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        HashMap<Character, Integer> map= new HashMap<>();
        int start=0;
        int res=0;
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
            if(map.size()>2){
                res=Math.max(res, i-start);
                while(map.size()>2){
                    char p=s.charAt(start);
                    int count=map.get(p);
                    if(count>1){
                        map.put(p, count-1);
                    }else{
                        map.remove(p);
                    }
                    start++;
                }
            }
        }
        System.out.println(Math.max(res, s.length()-start));
        return Math.max(res, s.length()-start);
    }
    public static void main(String arg[]){
        String input="cacabbb";
        LC159 solution= new LC159();
        solution.lengthOfLongestSubstringTwoDistinct(input);
    }
}
