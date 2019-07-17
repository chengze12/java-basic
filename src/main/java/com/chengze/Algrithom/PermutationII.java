package com.chengze.Algrithom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PermutationII {
//    public List<List<Integer>> permuteUnique(int[] nums) {
//        List<List<Integer>> res= new LinkedList<>();
//        if(nums==null || nums.length==0){
//            return res;
//        }
//        boolean[] visited= new boolean[nums.length];
//        Arrays.sort(nums);
////        helper(nums, res, new LinkedList<Integer>(), visited);
//        helper(nums, res, new LinkedList<>(),0,new ArrayList<>());
//        System.out.println(res);
//        return res;
//    }
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


    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res= new LinkedList<>();
        if(nums==null || nums.length==0){
            return res;
        }
        Arrays.sort(nums);
        LinkedList<Integer> temp= new LinkedList<Integer>();
        for(int i=0; i<nums.length; i++){
            temp.add(nums[i]);
        }
        helper( res, 0, temp);
        return res;
    }
    private void helper( List<List<Integer>> res, int index, LinkedList<Integer> temp){
        if(index==temp.size()){
            res.add(new LinkedList<Integer>(temp));
            return;
        }
        for(int i=index; i<temp.size(); i++){
            if(temp.get(i)==temp.get(index) && i!=index){
                continue;
            }
            swap(i, index, temp);
            helper( res, i+1, temp);
            swap(i, index, temp);
        }
    }
    private void swap(int left, int right, List<Integer> temp){
        int tempres= temp.get(left);
        temp.set(left, temp.get(right));
        temp.set(right,tempres);
    }

    public  static  void main (String arg[]) {
        PermutationII solution = new PermutationII();
        int [] nums={1,2,3};
        solution.permuteUnique(nums);
    }

}
