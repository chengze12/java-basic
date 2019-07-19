package com.chengze.Algrithom;

import com.chengze.Algrithom.support.TreeNode;

import java.util.Stack;

public class LC114 {
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur=stack.pop();
            if(cur.right!=null){
                stack.push(cur.right);
            }
            if(cur.left!=null){
                stack.push(cur.left);
            }
            if(!stack.isEmpty()){
                cur.right=stack.peek();
            }
            cur.left=null;
        }
        System.out.println(root.val);
    }
    public  static  void main (String arg[]){
        LC114 solution= new LC114();


        TreeNode root= new TreeNode(1);
        TreeNode left= new TreeNode(2);
        TreeNode right= new TreeNode(5);

        root.left=left;
        root.right=right;

        left.left=new TreeNode(3);
        left.right=new TreeNode(4);
//        right.left= new TreeNode(6);
        right.right=new TreeNode(6);

        solution.flatten(root);

    }
}
