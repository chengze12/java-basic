package com.chengze.Algrithom;

public class testbreak {
    public void test(){
        for(int i=0; i<3; i++){
            for(int j=10; j<15; j++){
                System.out.println(j);
                if(j==12){
                    break;
                }
            }
            System.out.println(i);
        }
    }
    public static void main(String[] arg){
        testbreak solution=new  testbreak();
        solution.test();
    }
}
