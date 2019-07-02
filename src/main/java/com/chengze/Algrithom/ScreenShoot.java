package com.chengze.Algrithom;

import java.util.LinkedList;
import java.util.List;

public class ScreenShoot {
    List<Integer> lengthEach(List<Character> input){
        List<Integer> res=new LinkedList<>();
        if(input.size()==0 || input==null){
            return res;
        }
        int [] nums= new int[26];
        for(int i=0; i<input.size(); i++){
            nums[input.get(i)-'a']=i;
        }
        int max=0;
        int min=0;
        for(int j=0; j<input.size(); j++){
            max=Math.max(max, nums[input.get(j)-'a']);
            if(max==j){
                res.add(max-min+1);
                min=max+1;
            }

        }
        System.out.println(res);
        return res;
    }

    public  static  void main (String arg[]) {
        ScreenShoot solution = new ScreenShoot();


        List<Character> numbers = new LinkedList<>();
        numbers.add('a');
        numbers.add('b');
        numbers.add('a');
        numbers.add('b');
        numbers.add('c');
        numbers.add('b');
        numbers.add('a');
        numbers.add('c');
        numbers.add('a');
        numbers.add('d');
        numbers.add('e');
        numbers.add('f');
        numbers.add('e');
        numbers.add('g');
        numbers.add('d');
        numbers.add('e');
        numbers.add('g');
        numbers.add('h');
        numbers.add('i');
        numbers.add('j');
        numbers.add('h');
        numbers.add('k');
        numbers.add('l');
        numbers.add('i');
        numbers.add('j');
        solution.lengthEach(numbers);


    }
}
