package com.chengze.Algrithom;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class FindMaxInLeft {
    public Integer[] findmax(int[] nums){
        Stack<Integer> stack= new Stack<>();
        Integer[] res= new Integer[nums.length];
        for(int i=nums.length-1; i>=0; i--){
            if(stack.isEmpty()){
                res[i]=-1;
                stack.push(nums[i]);
            }else{
                if(stack.peek()>nums[i]){
                    res[i]=stack.peek();
                    stack.push(nums[i]);
                }else{
                    while(!stack.empty()&&stack.peek()<nums[i]){
                        stack.pop();
                    }
                    if(stack.empty()){
                        res[i]=-1;
                    }else{
                        res[i]=stack.peek();
                    }
                    stack.push(nums[i]);
                }
            }
        }
        System.out.println(Arrays.deepToString(res));
        return res;
    }
    public static void main(String[] arg){
        FindMaxInLeft solution= new FindMaxInLeft();
        int[] nums={2,5,7,1,4,8};
        solution.findmax(nums);
    }
}
