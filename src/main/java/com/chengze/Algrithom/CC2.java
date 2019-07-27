package com.chengze.Algrithom;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class CC2 {
    int m;
    int n;
    List<String> res= new LinkedList<>();
    public List<String> findword(char[][] chars, List<String> words){
        //HashSet<Character> set= new HashSet<>();
        n=chars.length;
        m=chars[0].length;

        for(String word: words){
            char c=word.charAt(0);
                for(int i=0; i<n; i++){
                    for(int j=0; j<m; j++){
                        if(chars[i][j]==c){
                            helper(chars, word, i, j, 0);
                        }
                    }
                }

        }
        System.out.println(res);
        return res;
    }
    private void helper(char[][] chars, String word, int i, int j, int index){
        if(i<0 || j<0 || i>=n || j>= m|| index>=word.length() || word.charAt(index)!=chars[i][j] ){
            return;
        }
        HashSet<String> set= new HashSet<>();
        if(index==word.length()-1){
            res.add(word);
        }
        helper(chars, word, i+1, j, index+1);
        helper(chars, word, i, j+1, index+1);
        helper(chars, word, i, j-1, index+1);
        helper(chars, word, i-1, j, index+1);
        helper(chars, word, i+1,j+1, index+1);
    }
    public static void main(String[] arg){
        CC2 solution= new CC2();
//        char[][] chars=new char[4][4];'
//        chars[0][0]='j';
        char[][] chars={{'j','c','a','n'},
                        {'t','u','a','b'},
                        {'x','b','t','n'},
                        {'i','e','n','k'},
                        };
        List<String> words= new LinkedList<>();
        words.add("cat");
        words.add("dog");
        words.add("byte");
        words.add("tube");
        words.add("tank");
        solution.findword(chars, words);

        char[] line1={'a','b','c'};
        char[] line2={'d','e','f'};
        char[] line3={'g','h','i'};
        char[][] input={line1, line2, line3};
    }
}
