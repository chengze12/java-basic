package com.chengze.Algrithom;

public class PermutationinString {
    public boolean checkInclusion(String s1, String s2) {
        if(s1==null || s1.length()==0){
            return true;
        }
        int k=s1.length();
        char[] chars= s1.toCharArray();
        int left=0;
        int right=chars.length-1;
        while(left<right){
            char c=chars[left];
            chars[left]=chars[right];
            chars[right]=c;
            left++; right--;
        }
        String reverseds1=new String(chars);
        for(int i=0; i<=s2.length()-k; i++){
            if(s2.substring(i, i+k).equals(reverseds1)){
                System.out.println(1);
                return true;
            }else{
                continue;
            }
        }
        System.out.println(-1);
        return false;
    }

    public  static  void main (String arg[]) {
        PermutationinString solution = new PermutationinString();
        String s1="adc";
        String s2="dcda";
        solution.checkInclusion(s1, s2);
    }


//    @Override
//    public boolean equals( Object o) {
//        return true;
//    }
}
