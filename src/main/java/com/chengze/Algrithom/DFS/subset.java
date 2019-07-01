package com.chengze.Algrithom.DFS;

import java.util.LinkedList;
import java.util.List;

public class subset {
    public List<List<Integer>> subsetsm(int[] nums) {
        List<List<Integer>> res= new LinkedList<List<Integer>>();
        if(nums.length==0 || nums==null){
            return res;
        }
        LinkedList<Integer> temp= new LinkedList<Integer>();
        helper( res, nums, 0, temp);
        System.out.println(res);
        return res;
    }
    private void helper(List<List<Integer>> res, int[] nums, int index, LinkedList<Integer> temp){
        res.add(new LinkedList<Integer>(temp));
        for(int i=index; i<nums.length; i++){
            temp.add(nums[i]);
            helper(res, nums, i+1, temp);
            temp.remove(temp.size()-1);
        }
    }

    public  static  void main (String arg[]){
        subset solution= new subset();
        int [] numbers={1,2,3};

        solution.subsetsm(numbers);
    }
}
