package com.chengze.Algrithom;

import java.util.Arrays;

public class OnStageStudent {
    public int student(int[] nums, int k){
        if(nums==null || nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int res=0;
        if(k>nums.length){
            return nums.length;
        }
        for(int i=0; nums[i]+k<nums[nums.length-1]; i++){
            for(int j=i; nums[j]<=nums[i]+k; j++){
                res=Math.max(res, j-i+1);
            }
        }
        System.out.println(res);
        return res;
    }
    public static void main(String[] args){
        OnStageStudent solution= new OnStageStudent();
        int[] nums={5,5,5,4,6,7,1,2};
        int k=0;
        solution.student(nums, k);
    }
}
