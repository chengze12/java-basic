package com.chengze.Algrithom;

import java.util.Arrays;

public class trysplit {
    private String[] trysplit(String string) {
        String [] chars= string.split(",");
        System.out.println(Arrays.deepToString(chars));
        return chars;
    }
    public static void main(String arg[]){
        trysplit solution= new trysplit();
        String string = new String("1,2,#,#,3,4,#,#,5,#,#");
        solution.trysplit(string);
    }
//    stream
}
