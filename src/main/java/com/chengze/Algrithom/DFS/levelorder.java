package com.chengze.Algrithom.DFS;

import com.chengze.Algrithom.support.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class levelorder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res= new LinkedList<List<Integer>>();
        if(root==null){
            return res;
        }
        helper(res, root, 0);
        System.out.println(res);
        return res;
    }
    private void helper(List<List<Integer>> res, TreeNode root, int level){
        if(root==null){
            res.get(level).add(root.val);
        }
        if(level==res.size()){
            res.add(new LinkedList<Integer>());
        }
        res.get(level).add(root.val);
        helper(res, root.left, level+1);
        helper(res, root.right, level+1);
    }

    public  static  void main (String arg[]){
        levelorder solution= new levelorder();


        TreeNode root= new TreeNode(1);
        TreeNode left= new TreeNode(3);
        TreeNode right= new TreeNode(4);

        root.left=left;
        root.right=right;

//        left.left=new TreeNode(9);
//        right.left=new TreeNode(7);
        right.left= new TreeNode(6);
        right.right=new TreeNode(5);

        solution.levelOrder(root);

    }
}
