package com.chengze.Algrithom;

public class CountCoin {
    public int coinChange(int[] coins, int amount) {
        if(coins==null | coins.length==0){
            return 0;
        }
        int [] res= new int[amount+1];
        for(int i=1; i<=amount; i++){
            res[i]=Integer.MAX_VALUE;
            for(int j=0; j<coins.length; j++){
                if(i>= coins[j] && res[i-coins[j]]!=Integer.MAX_VALUE) {
                    res[i] = Math.min(res[i], res[i - coins[j]]) + 1;
                }
            }
        }

        int result= res[amount]== Integer.MAX_VALUE? -1: res[amount];
        System.out.println(result);
        return result;
    }
    public static void main(String arg[]){
        CountCoin solution= new CountCoin();
        int[] coins={2};
        int amount=3;
        solution.coinChange(coins, amount);
    }
}
