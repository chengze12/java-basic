package com.chengze.Algrithom;

import java.util.*;

public class LC140 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Map<Integer, List<String>> map= new HashMap<>();
        HashSet<String> set= new HashSet<>();
        for(String word:wordDict){
            set.add(word);
        }
        List<String> start= new LinkedList<>();
        start.add("");
        map.put(s.length(), start);

        for(int i=s.length()-1; i>=0; i--){
            List<String> temp= new LinkedList<>();
            for(int j=i+1; j<=s.length(); j++){
                if(set.contains(s.substring(i,j))){
                    for(String words : map.get(j)){
                        if(words.isEmpty()){
                            temp.add(s.substring(i,j)+ ""+ words);
                        }else{
                            temp.add(s.substring(i,j)+ " "+ words);
                        }
                    }
                }
            }
            map.put(i, temp);
        }
        System.out.println(map.get(0));
        return map.get(0);
    }
    public static void main(String arg[]){
        LC140 solution= new LC140();
        List<String> dict=new LinkedList<>();
        dict.add("cat"); dict.add("cats"); dict.add("and");
        dict.add("sand"); dict.add("dog");
        String s="catsanddog";
        solution.wordBreak(s, dict);
    }
}
