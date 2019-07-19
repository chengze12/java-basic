package com.chengze.Algrithom;

import com.chengze.Algrithom.support.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class LC113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res= new LinkedList<>();
        if(root==null){
            return res;
        }
        helper(res, root, sum,new LinkedList<Integer>());
        System.out.println(res);
        return res;
    }
    private void helper(List<List<Integer>> res, TreeNode root, int sum, LinkedList<Integer> temp){
        if(root==null && sum!=0){
            return;
        }
        if(root==null && sum==0){
            res.add(new LinkedList<Integer>(temp));
            return;
        }
        temp.add(root.val);
        helper(res, root.left,sum-root.val, temp);
        helper(res, root.right, sum-root.val, temp);
        temp.remove(temp.size()-1);
    }
    public static void main(String srg[]){
        int sum=6 ;
        TreeNode root= new TreeNode(1);
        TreeNode left= new TreeNode(2);
        TreeNode right= new TreeNode(5);

        root.left=left;
        root.right=right;

        left.left=new TreeNode(3);
        left.right=new TreeNode(4);
        right.left= new TreeNode(0);
        right.right=new TreeNode(6);

        LC113 solution= new LC113();
        solution.pathSum(root, sum);
    }
}
