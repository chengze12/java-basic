package com.chengze.Algrithom.Bfs;

import com.chengze.Algrithom.support.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTreverse {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res= new ArrayList<List<Integer>>();
        helper(res, root,0);
        System.out.println(res);
        return res;
    }
    private void helper(List<List<Integer>> res,TreeNode root, int level){
        if(root==null)
            return ;
        if(level>=res.size()){
            res.add(0,new ArrayList<Integer>());
        }
        helper(res, root.left,level+1);
        helper(res,root.right,level+1);
        res.get(res.size()-level-1).add(root.val);
    }


    public List<Integer> Tryagain(TreeNode root){
        List<Integer> res= new LinkedList<>();
        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();

            for(int i=0; i<size; i++){
                TreeNode cur= queue.poll();
                res.add(cur.val);
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                }
            }
        }
        System.out.println(res);
        return res;
    }

//    public List<Integer> treversal

    public  static  void main (String arg[]){
        LevelOrderTreverse solution= new LevelOrderTreverse();
        LevelOrderTreverse solution1= new LevelOrderTreverse();

        TreeNode root= new TreeNode(1);
        TreeNode left= new TreeNode(3);
        TreeNode right= new TreeNode(4);

        root.left=left;
        root.right=right;

        left.left=new TreeNode(9);
        right.left=new TreeNode(7);
        left.right= new TreeNode(6);
        right.right=new TreeNode(5);

        solution.levelOrderBottom(root);
        solution1.Tryagain(root);
    }

}
