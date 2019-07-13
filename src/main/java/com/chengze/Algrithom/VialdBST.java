package com.chengze.Algrithom;

import com.chengze.Algrithom.support.TreeNode;

public class VialdBST {
    TreeNode pre=null;
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        if(!isValidBST(root.left)){
            return false;
        }
        if(pre!=null && pre.val>=root.val){
            return false;
        }
        pre=root;
        System.out.println(isValidBST(root.right));
        return isValidBST(root.right);
    }
    public  static  void main (String arg[]) {
        VialdBST solution = new VialdBST();
        TreeNode root= new TreeNode(3);
        TreeNode left= new TreeNode(2);
        TreeNode right= new TreeNode(4);
        left.left= new TreeNode(1);

        root.left=left;
        root.right=right;
        solution.isValidBST(root);
    }
}
