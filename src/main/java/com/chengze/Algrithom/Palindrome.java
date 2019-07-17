package com.chengze.Algrithom;

import org.checkerframework.checker.units.qual.A;

import java.util.LinkedList;
import java.util.List;

public class Palindrome {
    public List<List<String>> partition(String s) {
        List<List<String>> res= new LinkedList<>();
        if(s==null || s.length()==0){
            return res;
        }
        helper(res, s, new LinkedList<String>());
        System.out.println(res);
        return res;
    }
    private void helper(List<List<String>> res, String s, LinkedList<String> temp){
        if(s.length()==0){
            res.add(new LinkedList<String>(temp));
        }
        for(int i=0; i<s.length(); i++){
            if(isValid(s.substring(0,i+1))){
                temp.add(s.substring(0,i+1));
                helper(res, s.substring(i+1), temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    private boolean isValid(String s){
        int right=s.length()-1;
        int left=0;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String arg[]){
        Palindrome solution = new Palindrome();
        String s="aab";
        solution.partition(s);
    }
}
