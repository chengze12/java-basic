package com.chengze.Algrithom;

import java.util.LinkedList;
import java.util.List;

public class haven {
    private List<List<Integer>> getn(int target){
        //
        List<List<Integer>> res= new LinkedList<>();
        helper(res, target, 1, new LinkedList<Integer>());
        System.out.println(res);
        return res;

    }
    private void helper(List<List<Integer>> res, int target, int number, LinkedList<Integer> temp){
        if(target<0){
            return;
        }
        if(target==0 && temp.size()==3){
            res.add(new LinkedList<>(temp));
        }
        for(int i=number; i<=9; i++){
            temp.add(i);
            helper(res, target-i, i+1, temp);
            temp.remove(temp.size()-1);
        }
    }


    public  static  void main (String arg[]) {
        haven solution = new haven();
        int a=22;
        solution.getn(a);
    }
}
