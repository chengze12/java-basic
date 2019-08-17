package com.chengze.Algrithom.support;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TryOA {
    public void OATry(String s, int a, List<String> list ){
        System.out.println(s+a+list);
    }
    public static void main(String[] args){
        String s="Chengze";
        int a=1;
        List<String> list=new ArrayList<>();
        list.add("chengze");
        list.add("Jinyao");
        list.add("ryo");
        TryOA solution= new TryOA();
        solution.OATry(s,a, list);
    }
}
