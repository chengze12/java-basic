package com.chengze.Algrithom.heavywater;

public class MaxDifference {
    public int mandiff(int[] nums){
        int min=Integer.MAX_VALUE;
        int res=0;
        for(int i=0; i<nums.length; i++){
            min= Math.min(min, nums[i]);
            res= Math.max(res, nums[i]-min);
        }
        System.out.println(res);
        return res;
    }
    public static void main(String[] args){
        MaxDifference solution= new MaxDifference();
        int[] nums={7,2,3,10,2,4,8,1};
        solution.mandiff(nums);
    }
}
