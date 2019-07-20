package com.chengze.Algrithom;

import com.chengze.Algrithom.support.TreeNode;

import java.util.HashMap;

public class findmaxpath {
    int res= Integer.MIN_VALUE;
    public int findmax(TreeNode root){
        helper(root);
        System.out.println(res);
        return res;
    }
    private int helper(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=Math.max(0,helper(root.left));
        int right=Math.max(0,helper(root.right));
        res=Math.max(res, left+right+root.val);
        return root.val+Math.max(left, right);
    }

//    private TreeNode findpath(TreeNode root, int res){
//        HashMap<TreeNode, TreeNode>;
//    }

    public static void main(String[] arg){
        findmaxpath solution=  new findmaxpath();
        TreeNode root= new TreeNode(1);    //       1
        TreeNode left= new TreeNode(3);    //    3     -4
        TreeNode right= new TreeNode(-4);   // -9  7  6   5

        root.left=left;
        root.right=right;

        left.left=new TreeNode(-9);
        left.right=new TreeNode(7);
        right.left= new TreeNode(6);
        right.right=new TreeNode(5);
        solution.findmax(root);
    }
}
