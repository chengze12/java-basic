package com.chengze.Algrithom;

public class ImplementStr {
    public int strStr(String s1, String s2) {
        if(s1==null && s2==null) {
            return 0;
        }
        for(int i=0; i<s1.length(); i++){
            for(int j=0; j<s2.length(); j++){
                if(j==s2.length()-1){
                    System.out.println(i);
                    return i;
                }
                if(i+j>s1.length()){
                    return -1;
                }
                if(s1.charAt(i+j)!=s2.charAt(j)){
                    break;
                }
            }
        }
        return 1;

    }
    public  static  void main (String arg[]) {
        ImplementStr solution = new ImplementStr();
        String s1 = "hello";
        String s2 = "ll";
        solution.strStr(s1, s2);
    }
}
