package com.chengze;

public class Solution {
    String username = "pf";

    public void getUsername(String username) {
        username = "gh";
//      this.username = username;
        System.out.println(this.username);
//        return this.username;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        s.getUsername("caite");

    }
}


    //}
//    public Solution(){
//        username="t";
//    }
//
//    public Solution(String username){
//        this.username=username;
//    }
//
//    public String toString(){
//        return String.valueOf(this.username);
//    }
//
//    public static void main(String[] args) {
//        String YU= new test(YT)
//        Solution solution = new Solution();
//        System.out.println(solution);
//    }

