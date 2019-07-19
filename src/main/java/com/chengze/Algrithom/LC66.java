package com.chengze.Algrithom;

public class LC66 {
    public int[] plusOne(int[] digits) {
    int n=digits.length;
    for(int i=n-1;i>=0;i--){
        if(digits[i]<9){
            digits[i]=digits[i]+1;
            System.out.println(digits);
            return digits;
        }else{
            digits[i]=0;
        }
    }
    int[] res=new int[n+1];
    res[0]=1;
    System.out.println(res);
    return res;
    }
    public static void main(String arg[]){
        LC66 solution= new LC66();
        int[] nums={1,2,3};
        solution.plusOne(nums);
    }
}
