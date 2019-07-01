package com.chengze.OA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryAllocator {

    private List<HashMap<String, Integer>> res= new ArrayList<>();
    private List<String> fruits= new ArrayList<>();

    /**
     *
     * @param input  How many and which kind of fruits I need
     * @param inventory  How many fruits do I have in each inventory hold
     * @return
     */

    public List<HashMap<String,Integer>> InventoryAllocator(Map<String, Integer> input,List<HashMap<String,Integer>> inventory){

        //storage the friut name I need
        for(Map.Entry<String, Integer> fruit: input.entrySet()) {
          String friutname=fruit.getKey();
            fruits.add(friutname);
        }

        // figure out how many map I need in the res
        for(HashMap name : inventory){
            res.add(new HashMap<>());
        }
        recursiveAllocator(res, input,inventory , 0);
        System.out.println(res);
        return res;
    }

    /**
     *
     * @param res  The res I will submit
     * @param input  How many and which kind of fruits I need
     * @param inventory How many fruits do I have in each inventory hold
     * @param fruitIndex Which fruit to choose now

     */

    public void recursiveAllocator(List<HashMap<String, Integer>> res, Map<String, Integer> input, List<HashMap<String,Integer>> inventory,int fruitIndex){
        //exit condition
        if(input==null || inventory==null || fruitIndex>fruits.size()-1){
            return;
        }
        // number:  number of fruits I need
        // i :  the bucket number I am going to choose
        int number=input.get(fruits.get(fruitIndex));
        int i=0;

        // to find if we have already got the number I need for specific friut;
        // if after I have looped all the inventory, I still havent get the number of friut I need, break;
        while(number> 0){
            if(i> inventory.size()-1){
                break;
            }
            res.get(i).put(fruits.get(fruitIndex), Math.min(number,inventory.get(i).get(fruits.get(fruitIndex))));
            number= number-inventory.get(i).get(fruits.get(fruitIndex));
            i++;
        }
        recursiveAllocator(res, input, inventory, fruitIndex+1);
    }



    public  static  void main (String arg[]){

        InventoryAllocator solution= new InventoryAllocator();

        HashMap<String, Integer> input= new HashMap<>();
        //Case 1 : fulfill apples [{apple:4},{pear:4}]
        input.put("apple", 6);
        input.put("pear", 4);

        List<HashMap<String, Integer>> wehave= new ArrayList<>();
        HashMap<String, Integer> one= new HashMap<String, Integer>();
        HashMap<String, Integer> two= new HashMap<String, Integer>();
        HashMap<String, Integer> Three= new HashMap<String, Integer>();
        one.put("apple", 1); one.put("pear", 2);
        two.put("apple", 4); two.put("pear", 2);
        Three.put("apple", 1); Three.put("pear", 1);

        wehave.add(one); wehave.add(two); wehave.add(Three);
        solution.InventoryAllocator(input, wehave);




        //Case 2 : fulfill pears
        InventoryAllocator solution1= new InventoryAllocator();

        HashMap<String, Integer> needs= new HashMap<>();
        needs.put("apple", 5);
        needs.put("pear", 6);

        List<HashMap<String, Integer>> wehave1= new ArrayList<>();
        HashMap<String, Integer> a= new HashMap<String, Integer>();
        HashMap<String, Integer> b= new HashMap<String, Integer>();
        HashMap<String, Integer> c= new HashMap<String, Integer>();
        a.put("apple", 1); a.put("pear", 2);
        b.put("apple", 4); b.put("pear", 2);
        c.put("apple", 1); c.put("pear", 6);

        wehave1.add(a); wehave1.add(b); wehave1.add(c);
        solution1.InventoryAllocator(needs, wehave1);

//      both not fulfill
        InventoryAllocator solution2= new InventoryAllocator();

        HashMap<String, Integer> needs1= new HashMap<>();
        needs1.put("apple", 5);
        needs1.put("pear", 6);

        List<HashMap<String, Integer>> wehave2= new ArrayList<>();
        HashMap<String, Integer> a1= new HashMap<String, Integer>();
        HashMap<String, Integer> b1= new HashMap<String, Integer>();
        HashMap<String, Integer> c1= new HashMap<String, Integer>();
        a1.put("apple", 1); a1.put("pear", 1);
        b1.put("apple", 2); b1.put("pear", 1);
        c1.put("apple", 1); c1.put("pear", 0);

        wehave2.add(a1); wehave2.add(b1); wehave2.add(c1);
        solution2.InventoryAllocator(needs1, wehave2);

    }
}








