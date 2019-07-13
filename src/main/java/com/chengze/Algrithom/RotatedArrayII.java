package com.chengze.Algrithom;

public class RotatedArrayII {
    public boolean search(int[] nums, int target) {
        if(nums==null || nums.length==0){
            return false;
        }
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                return true;
            }
            if(nums[mid]<nums[end]){
                if(target<=nums[end] && target>=nums[mid]){
                    start=mid+1;
                }else{
                    end=mid;
                }
            }else{
                if(target>=nums[start]&& target<=nums[mid]){
                    end=mid;
                }else{
                    start=mid+1;
                }
            }
        }
        return false;
    }
    public  static  void main (String arg[]) {
        RotatedArrayII solution = new RotatedArrayII();
        int [] nums={3,1,1};
        solution.search(nums, 3);
    }
}
