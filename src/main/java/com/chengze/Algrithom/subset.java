package com.chengze.Algrithom;

import java.util.ArrayList;
import java.util.List;

public class subset {
    public List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        for(int i : S) {
            List<List<Integer>> tmp = new ArrayList<>();
            for(List<Integer> sub : res) {
                List<Integer> a = new ArrayList<>(sub);
                a.add(i);
                tmp.add(a);
            }
            res.addAll(tmp);
        }
        System.out.println(res);
        return res;
    }
    public  static  void main(String arg[]){
        subset solution = new subset();
        int[] nums={1,2,3};
        solution.subsets(nums);
        Integer a=128;
        Integer b=new Integer(128);
        Integer c=127;
        Integer d=127;
        Integer e=new Integer(127);
        System.out.println(e==d);
    }
}
