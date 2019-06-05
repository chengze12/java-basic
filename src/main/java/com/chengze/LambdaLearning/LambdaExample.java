package com.chengze.LambdaLearning;

import java.util.Comparator;

public class LambdaExample {

    public static void main(String[] args){

        Comparator<String> stringComparator= new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        int compareres= stringComparator.compare("chengze", "jinyao");
        System.out.println(compareres);

        //lambda
        Comparator<String> stringComparatorLambda = ( o1,  o2) -> o1.compareTo(o2);

        int reswithlambda=stringComparatorLambda.compare("chengze", "jinyao");
        System.out.println(reswithlambda);
    }
}
