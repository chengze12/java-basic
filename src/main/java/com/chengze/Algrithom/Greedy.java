package com.chengze.Algrithom;

import java.lang.reflect.Array;
import java.util.*;

public class Greedy {
    public int getmin(int filesnum, List<Integer> files){
        if(files==null || files.size()==0){
            return 0;
        }
        int[] temp= new int[files.size()];
        for(int i=0; i<files.size(); i++){
            temp[i]=files.get(i);
        }
        Arrays.sort(temp);
        int [] res= new int[files.size()];
        res[0]=temp[0];
        for(int i=1; i<files.size(); i++){
            res[i]=temp[i]+res[i-1];
        }
        int result=0;
        for(int i=0; i<res.length; i++){
            result=result+res[i];
        }
        result=result -res[0];
        System.out.println(result);
        return result;
    }


    public int onemore(int number, List<Integer> filesize){
        if(filesize==null || filesize.size()==0){
                return 0;
        }PriorityQueue<Integer> pq = new PriorityQueue<>(number,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }});
        for(int i=0; i<filesize.size(); i++){
            int temp=filesize.get(i);
            pq.add(temp);
        }
        int res= 0;
        int tenpres=pq.poll();
        while(!pq.isEmpty()){
            tenpres=tenpres+pq.poll();
            res=res+tenpres;
        }
        System.out.println(res);
        return res;
    }


    public int thethird(int number, List<Integer> filesize){
        if(filesize==null || filesize.size()==0){
            return 0;
        }
        int[] temp= new int[filesize.size()];
        for(int i=0; i<filesize.size(); i++){
            temp[i]=filesize.get(i);
        }
        helper(temp, 0, temp.length-1);
        int res=0;
        int tempres=temp[0];
        for(int i=1; i<temp.length; i++){
            tempres=tempres+temp[i];
            res=res+tempres;
        }
        System.out.println(res);
        return res;
    }

    private void helper(int[] temp, int l, int r ){
        if(l<r){
            int i=l;
            int j=r;
            int cur=temp[l];
            while(i<j){
                while(i<j && temp[j]>=cur){
                    j--;
                }
                if(i<j){
                    temp[i++]=temp[j];
                }
                while(i<j && temp[i]<cur){
                    i++;
                }
                if(i<j){
                    temp[j--]=temp[i];
                }
            }
            temp[i]=cur;
            helper(temp, l, i-1);
            helper(temp, i+1, r);
        }

    }



    public int thefifth(int number, List<Integer> files){
        if(number==0 || files==null){
            return 0;
        }
        int res=0;
        int[] temp= new int[files.size()];

        for(int i=0; i<files.size(); i++){
            temp[i]=files.get(i);
        }
        Arrays.sort(temp);
        for(int i=0; i<files.size();i++){
            res= res+temp[i]*(files.size()-i);
        }
        res=res-temp[0];
        System.out.println(res);
        return res;
    }

    public  static  void main (String arg[]){
        Greedy solution= new Greedy();


        List<Integer> numbers= new ArrayList<>();
        numbers.add(0,20);
        numbers.add(1,4);
        numbers.add(2,2);
        numbers.add(3,8);
        solution.thefifth(4,numbers);

        Greedy solution1= new Greedy();
        List<Integer> numbers1= new ArrayList<>();
        numbers1.add(0,1);
        numbers1.add(1,2);
        numbers1.add(2,5);
        numbers1.add(3,10);
        numbers1.add(4,35);
        numbers1.add(5,89);
        solution1.thefifth(6,numbers1);


    }
}


