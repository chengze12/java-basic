package com.chengze.Algrithom.heavywater;

import java.util.ArrayList;
import java.util.List;

public class Graycode {
    public int grayCode(int n) {
        List<Integer> rs=new ArrayList<Integer>();
        rs.add(0);
        for(int i=0;i<n;i++){
            int size=rs.size();
            for(int k=size-1;k>=0;k--)
                rs.add(rs.get(k) | 1<<i);
        }
        System.out.println(rs.size());
        return rs.size();
    }
    public static void main(String[] args){
        Graycode solution= new Graycode();
        int n=13;
        solution.grayCode(n);
    }
}
