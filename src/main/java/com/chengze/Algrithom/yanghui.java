package com.chengze.Algrithom;

import java.util.LinkedList;
import java.util.List;

public class yanghui {
    public List<Integer> getRow(int row) {
        List<Integer> res= new LinkedList<Integer>();
        if(row<0){
            return res;
        }
        for(int i=0; i<=row; i++){
            res.add(1);
            for(int j=res.size()-2;j>=1; j--){
                res.set(j, res.get(j)+ res.get(j-1));
            }
        }
        System.out.println(res);
        return res;
    }

    public  static  void main (String arg[]){
        yanghui solution= new yanghui();
        int k=4;

        solution.getRow(k);
    }

}
