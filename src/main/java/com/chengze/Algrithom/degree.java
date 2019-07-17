package com.chengze.Algrithom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class degree {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, ArrayList<Integer>> map= new HashMap<>();
        int number =0;
        int count=0;
        int max=0;
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                ArrayList<Integer> temp= new ArrayList<>(map.get(nums[i]));
                temp.set(1,i);
                count=temp.get(2)+1;
                temp.set(2,count);
                max=Math.max(max, count);
                if(max==count){
                    number=nums[i];
                }
                map.put(nums[i], temp);
            }else{
                ArrayList<Integer> temp= new ArrayList<>(3);
                temp.add(0,i);
                temp.add(1,0);
                temp.add(2,1);
                map.put(nums[i], temp);
            }
        }
        System.out.println(map.get(number).get(1)-map.get(number).get(0));
        return map.get(number).get(1)-map.get(number).get(0);
    }
    public static void main(String arg[]){
        degree solution= new degree();
        int[] nums={1, 2, 2, 3, 1};
        solution.findShortestSubArray(nums);
    }
}
