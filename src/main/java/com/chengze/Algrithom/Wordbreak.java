package com.chengze.Algrithom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Wordbreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        if(wordDict.size()==0){
            return false;
        }
//        HashMap<String, Integer> map = new HashMap<>();
//        for (String word : wordDict) {
//            map.put(word, map.getOrDefault(word, 0) + 1);
//        }
//        int start = 0;
//        int match = 0;
//        int maxWord = 0;
//        int wordlength = 0;
//        for(int i = 0; i < wordDict.size(); i++){
//            wordlength = wordDict.get(i).length();
//            if(wordlength > maxWord){
//                maxWord = wordlength;
//            }
//        }
//        for (int end = 0; end < s.length(); end++) {
//            String left = s.substring(start, end+1);
//            if (map.containsKey(left)) {
//                map.put(left, map.get(left) - 1);
//                if (map.get(left) <= 0) {
//                    match++;
//                }
//            }
//            if (match >= wordDict.size()) {
//                return true;
//            }
//            if(end-start+1 >= maxWord){
//                start++;
//
//            }
//
//        }
//        return false;
        HashSet<String> set= new HashSet<>();
        for(String word: wordDict){
            set.add(word);
        }
        boolean[] dp= new boolean[s.length()+1];
        dp[0]=true;
        for(int i=0;i<s.length(); i++){
            for(int j=i; j>=0; j--){
                if(dp[j] && set.contains(s.substring(j, i+1))){
                    dp[i+1]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
    public static void main(String args[]) {
        Wordbreak solution = new Wordbreak();

        String s = "leetcodeleet";
        List<String> wordDict = new ArrayList<String>();
        wordDict.add("cat");
        wordDict.add("leet");
        wordDict.add("sand");
        wordDict.add("code");
        wordDict.add("cat");
        boolean result = solution.wordBreak(s,wordDict);
        System.out.println(result);
    }
}
