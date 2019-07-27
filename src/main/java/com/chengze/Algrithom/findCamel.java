package com.chengze.Algrithom;

import java.util.LinkedList;
import java.util.List;

public class findCamel {
    public List<List<Integer>> findres(int [] nums){
        List<List<Integer>> res= new LinkedList<>();
        for(int i=0; i< nums.length-2; i++){
            int temp=nums[i];
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                if(nums[i]<nums[left] && nums[i]<nums[right]){
                    List<Integer> tempres= new LinkedList<>();
                    tempres.add(nums[i]);
                    tempres.add(nums[left]);
                    tempres.add(nums[right]);
                    res.add(tempres);
                }
                left++;
                right--;
            }
        }
//        List<Integer> needtoremove=new LinkedList<>();
        for(int i=res.size()-1; i>=0; i--){
            List<Integer> cur= new LinkedList<>(res.get(i));
            if(cur.get(1) < cur.get(2)){
                res.remove(res.get(i));
            }else{
                continue;
            }
        }
        System.out.println(res);
        return res;
    }
    public static void main(String[] arg){
        findCamel solution= new findCamel();
        int[] nums={1,2,3,4,7,5};
        solution.findres(nums);
    }
}
