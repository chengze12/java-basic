package com.chengze.Algrithom;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class CC {
    public List<String> CC(char[][] chars, List<String> words){
        HashSet<Character> set= new HashSet<>();
        int n=chars.length;
        int m=chars[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m ; j++){
                set.add(chars[i][j]);
            }
        }
        List<String> res= new LinkedList<>();
        int size= words.size();
        for(int i=0; i< size; i++){
            String string=words.get(i);
            if(checkword(string, set)){
                res.add(string);
            }else{
                continue;
            }
        }
        System.out.println(res);
        return res;
    }
    private boolean checkword(String string, HashSet<Character> set){
        int n=string.length();
        for(int i=0; i<n; i++){
            if(!set.contains(string.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] arg){
        CC solution= new CC();
//        char[][] chars=new char[4][4];
//        chars[0][0]='j';
        char[][] chars={{'j','c','z','e'},
                        {'v','a','x','b'},
                        {'x','t','n','u'},
                        {'i','a','n','k'},
                        };
        List<String> words= new LinkedList<>();
        words.add("cat");
        words.add("dog");
        words.add("byte");
        words.add("tube");
        solution.CC(chars, words);
    }
}
