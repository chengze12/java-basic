package com.chengze.Algrithom;

import java.util.Arrays;

import static java.lang.String.valueOf;

public class StringSort {
    public void sortString(String[] str){
        Arrays.sort(str);
        for(String word: str){
            System.out.println(word);
        }

    }
    public static void main(String[] arg){
        StringSort solution= new StringSort();
        String [] s= {"ab", "cd", "ac", "ad","abcd"};
        solution.sortString(s);
    }
}
