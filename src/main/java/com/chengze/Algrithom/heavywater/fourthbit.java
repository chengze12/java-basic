package com.chengze.Algrithom.heavywater;

public class fourthbit {
    public int fbit(int a){

        if ((a&8) == 8){
            System.out.println(1);
            return 1;
        }else{
            System.out.println(0);
            return 0;
        }
    }
    public static void main(String[] args){
        fourthbit solution= new fourthbit();
        int a=10;
        solution.fbit(a);
    }
}
