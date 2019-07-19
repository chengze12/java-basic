package com.chengze.Algrithom;

import java.util.*;

public class LC140 {
//    public List<String> wordBreak(String s, List<String> wordDict) {
//        Map<Integer, List<String>> map= new HashMap<>();
//        HashSet<String> set= new HashSet<>();
//        for(String word:wordDict){
//            set.add(word);
//        }
//        List<String> start= new LinkedList<>();
//        start.add("");
//        map.put(s.length(), start);
//
//        for(int i=s.length()-1; i>=0; i--){
//            List<String> temp= new LinkedList<>();
//            for(int j=i+1; j<=s.length(); j++){
//                if(set.contains(s.substring(i,j))){
//                    for(String words : map.get(j)){
//                        if(words.isEmpty()){
//                            temp.add(s.substring(i,j)+ ""+ words);
//                        }else{
//                            temp.add(s.substring(i,j)+ " "+ words);
//                        }
//                    }
//                }
//            }
//            map.put(i, temp);
//        }
//        System.out.println(map.get(0));
//        return map.get(0);
public List<String> wordBreak(String s, List<String> wordDict) {
    HashSet<String> set=new HashSet<>();
    for(String word: wordDict){
        set.add(word);
    }
    HashMap<Integer, List<String>> map=new HashMap<>();
    return helper(s, 0, set, map);
}
    private List<String> helper(String s, int start, Set<String> set, HashMap<Integer, List<String>> map){
        if(map.containsKey(start)){
            return map.get(start);
        }
        List<String> res= new ArrayList<>();
        if(start ==s.length()){
            res.add("");
            return res;
        }
        String cur= s.substring(start);
        for(String word : set){
            if(cur.startsWith(word)){
                List<String> sublist=helper(s, start+word.length(), set, map);
                for(String sub : sublist){
                    res.add(word + (sub.isEmpty() ? "": " ")+ sub);
                }
            }
        }
        map.put(start, res);
        System.out.println(res);
        return res;
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
