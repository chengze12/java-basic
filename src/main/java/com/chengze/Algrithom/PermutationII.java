package com.chengze.Algrithom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PermutationII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res= new LinkedList<>();
        if(nums==null || nums.length==0){
            return res;
        }
        boolean[] visited= new boolean[nums.length];
        Arrays.sort(nums);
//        helper(nums, res, new LinkedList<Integer>(), visited);
        helper(nums, res, new LinkedList<>(),0,new ArrayList<>());
        System.out.println(res);
        return res;
    }
//    private void helper(int[] nums, List<List<Integer>> res, LinkedList<Integer> temp, boolean[] visited){
//        if(temp.size()==nums.length){
//            res.add(new LinkedList<Integer>(temp));
//            return;
//        }
//        for(int i=0; i<nums.length; i++){
//            if(!visited[i]){
//                if(i>0 && nums[i]==nums[i-1]&& visited[i-1]){
//                    continue;
//                }
//                visited[i]=true;
//                temp.add(nums[i]);
//                helper(nums, res, temp, visited);
//                temp.remove(temp.size()-1);
//                visited[i]=false;
//            }
//        }
//    }


    private void helper(int[] nums, List<List<Integer>> res, LinkedList<Integer> temp,int l,ArrayList<Integer> tempNums){
//        if(temp.size()==nums.length){
            res.add(new LinkedList<Integer>(temp));
//            return;
//        }
        for(int i=l; i<nums.length; i++){
        //&&temp.indexOf(nums[i])==i
//            if(tempNums.size()>i && tempNums.get(i)==nums[i]){
//                continue;
//            }
            temp.add(nums[i]);
//            tempNums.add(nums[i]);
            helper(nums, res, temp,i+1,tempNums);
            temp.remove(temp.size()-1);
//            tempNums.remove(tempNums.size()-1);
        }
    }

    public  static  void main (String arg[]) {
        PermutationII solution = new PermutationII();
        int [] nums={1,1,2};
        solution.permuteUnique(nums);
    }

}
