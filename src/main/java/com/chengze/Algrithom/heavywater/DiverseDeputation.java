package com.chengze.Algrithom.heavywater;

public class DiverseDeputation {
    public int menwithwomen(int men, int women){
        if(men<=0 || women<=0 || men+women<3){
            return 0;
        }
        if(men==1) {
            System.out.println(women * (women - 1) / 2);
            return women * (women - 1) / 2;
        }else{
            if(women==1){
                System.out.println(men+men*(men-1)/2);
                return men+men*(men-1)/2;
            }else{
                System.out.println(men*(women*(women-1)/2) + (men*(men-1)/2)*women);
                return men*(women*(women-1)/2) + (men*(men-1)/2)*women;
            }
        }
    }
    public static void main(String[] args){
        int men=4;
        int women=2;
        DiverseDeputation solution= new DiverseDeputation();
        solution.menwithwomen(men, women);
    }
}
