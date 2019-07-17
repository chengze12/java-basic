package com.chengze.Algrithom;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> nums) {
//        int n=triangle.size();
//        if(triangle==null ||n==0){
//            return 0;
//        }
//        int m=triangle.get(n-1).size();
//        int[][] res= new int[n][m];
//        res[0][0]=triangle.get(0).get(0);
//        for(int i=1; i<n; i++){
//            int level=triangle.get(i).size();
//            for(int j=0; j<level; j++){
//                if(j==0){
//                    res[i][j]=triangle.get(i).get(j)+res[i-1][j];
//                }else{
//                    res[i][j]=triangle.get(i).get(j)+ Math.min(res[i-1][j], res[i-1][j-1]);
//                }
//            }
//        }
//        int result=Integer.MAX_VALUE;
//        for(int i=0; i<m; i++){
//            result=Math.min(result, res[n-1][i]);
//        }
//        System.out.println(result);
//        return result;
        int n= nums.size();
        if(nums==null || n==0){
            return 0;
        }
        List<Integer> res= new ArrayList<>();
        res.add(nums.get(0).get(0));
        for(int i=0; i<n; i++){
            int size= nums.get(i).size();
            for(int j=0; j<size; j++){
                if(j==0){
                    res.set(0, res.get(0)+nums.get(size).get(0));
                }else if(j==size-1){
                    res.add(size-1, res.get(j-2)+nums.get(i).get(j));
                }
                else{
                    res.set(j, nums.get(i).get(j)+Math.min(nums.get(i-1).get(j), nums.get(i-1).get(j-1)));
                }
            }
        }
        int min=Integer.MIN_VALUE;
        for(int i=0; i<res.size(); i++){
            min=Math.min(min, res.get(i));
        }
        System.out.println(min);
        return min;
    }
    public  static  void main (String arg[]) {
        Triangle solution= new Triangle();
        List<Integer> l1=new ArrayList<>();
        l1.add(2);
        List<Integer> l2=new ArrayList<>();
        l2.set(0,3); l2.add(4);
        List<Integer> l3=new ArrayList<>();
        l3.add(6);  l3.add(5); l3.add(7);
        List<Integer> l4=new ArrayList<>();
        l4.add(4); l4.add(1); l4.add(8); l4.add(3);

        List<List<Integer>> input=new LinkedList<>();
        input.add(l1); input.add(l2); input.add(l3); input.add(l4);
        solution.minimumTotal(input);


    }
}
