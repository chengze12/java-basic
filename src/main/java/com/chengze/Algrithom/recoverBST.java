package com.chengze.Algrithom;

import com.chengze.Algrithom.support.TreeNode;

public class recoverBST {
    TreeNode pre= null;
    TreeNode first=null;
    TreeNode second=null;
    public void recoverTree(TreeNode root) {
        helper(root);
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);
        System.out.println(root.right.left.val);
        return;
    }
    private void helper(TreeNode root){
        if(root==null){
            return;
        }
        helper(root.left);
        if(pre!=null && pre.val>root.val){
            if(first==null){
                first=pre;
            }
            second=root;
        }
        pre=root;
        helper(root.right);
    }
    public static void main(String[] arg){
        recoverBST solution= new recoverBST();

//        TreeNode root=new TreeNode(2);
//        TreeNode left= new TreeNode(1);  //  2
//        root.left=left;
//        TreeNode right= new TreeNode(3);//1      3
//        root.right=right;
//        right.left=new TreeNode(4);      //   4


        TreeNode root=new TreeNode(1);
        TreeNode left=new TreeNode(3);
        root.left=left;
        left.right= new TreeNode(2);
        solution.recoverTree(root);
    }
}
