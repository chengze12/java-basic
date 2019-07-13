package com.chengze.Algrithom;

import java.util.HashSet;

public class MissingPositive {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        int max=0;
        for(int i=0; i<nums.length; i++){
            max=Math.max(nums[i],max);
            set.add(nums[i]);
        }
        int res=0;
        for(int i=1;i<=max+1; i++){
            if(!set.contains(i)){
                res=i;
                System.out.println(i);
                return i;
            }else{
                continue;
            }
        }
        System.out.println(res+1);
        return res+1;
    }
    public  static  void main (String arg[]) {
        MissingPositive solution = new MissingPositive();
        int[] nums= {1,2,3,10,2147483647,9};
        solution.firstMissingPositive(nums);
    }
}
