package com.chengze.Algrithom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class wiggleSort {
    public void wSort(int[] nums) {
        if(nums.length==0 || nums==null)
            return;
        for(int i=1;i<nums.length;i++){
            if(i%2==1 &&nums[i]<nums[i-1] ||i%2==0 && nums[i]>nums[i-1]){
                swap(nums,i);
            }
        }

    }
    private void swap(int [] nums, int i){
        int temp=nums[i];
        nums[i]=nums[i-1];
        nums[i-1]=temp;
    }
    public static void main(String arg[]){
        wiggleSort solution= new wiggleSort();
        int [] nums= {3,5,2,1,6,4};
        solution.wSort(nums);
    }
}

