package com.chengze.OOD;

import com.chengze.Algrithom.support.TreeNode;

import java.util.Stack;

public class dsTree {
//    public String serialize(TreeNode root) {
//        Stack<TreeNode> stack= new Stack<>();
//        stack.push(root);
//        StringBuilder sb= new StringBuilder();
//        while(!stack.isEmpty()){
//            TreeNode temp= stack.pop();
//            if(temp!=null){
//                sb.append(temp.val);
//                sb.append(",");
//                stack.push(temp.left);
//                stack.push(temp.right);
//            }else{
//                sb.append("%,");
//            }
//        }
//        System.out.println(sb.toString().substring(0, sb.length()-1));
//        return sb.toString().substring(0, sb.length()-1);
//    }
//
//    // Decodes your encoded data to tree.
//    public TreeNode deserialize(String data) {
//        if(data==null){
//            return null;
//        }
//        String[] chars= data.split(",");
//        return helper(chars, 0);
//    }
//    private TreeNode helper(String[] chars, int index){
//        if(chars[index].equals("%")){
//            return null;
//        }
//        TreeNode cur= new TreeNode(Integer.parseInt(chars[index]));
//        cur.left=helper(chars, index+1);
//        cur.right= helper(chars, index+1);
//        return cur;
//    }


//    public String serialize(TreeNode root) {
//        if(root==null)
//            return null;
//        Stack<TreeNode> res= new Stack<TreeNode>();
//        res.push(root);
//        StringBuilder sb= new StringBuilder();
//        while(!res.isEmpty()){
//            TreeNode t=res.pop();
//            if(t!=null){
//                sb.append(t.val+",");
//                res.add(t.right);
//                res.add(t.left);
//            }else{
//                sb.append("#,");
//            }
//        }
//        System.out.println(sb.toString().substring(0, sb.length()-1));
//        return sb.toString().substring(0,sb.length()-1);
//    }

    public String serialize(TreeNode root) {
        if(root==null){
            return "#";
        }
        System.out.println(""+root.val+","+serialize(root.left)+","+serialize(root.right));
        return ""+root.val+","+serialize(root.left)+","+serialize(root.right);
    }

    public TreeNode deserialize(String data) {
        if(data==null)
            return null;
        int[] t={0};
        String[] arr=data.split(",");
        return helper(arr,t);
    }
    private TreeNode helper(String[] arr, int[] t){
        if(arr[t[0]].equals("#")){
            return null;
        }
        TreeNode root= new TreeNode(Integer.parseInt(arr[t[0]]));

        root.left=helper(arr, t);
        t[0]=t[0]+1;
        root.right=helper(arr, t);
        System.out.println(root.val);
        return root;
    }

//    public String serialize(TreeNode root) {
//        if(root==null)
//            return null;
//        Stack<TreeNode> res= new Stack<TreeNode>();
//        res.push(root);
//        StringBuilder sb= new StringBuilder();
//        while(!res.isEmpty()){
//            TreeNode t=res.pop();
//            if(t!=null){
//                sb.append(t.val+",");
//                res.add(t.right);
//                res.add(t.left);
//            }else{
//                sb.append("#,");
//            }
//        }
//        return sb.toString().substring(0,sb.length()-1);
//    }
//    public TreeNode deserialize(String data) {
//        if(data==null)
//            return null;
//        //int[] t={0};
//        String[] arr=data.split(",");
//        return helper(arr,0);
//    }
//    private TreeNode helper(String[] arr, int t){
//        if(arr[t].equals("#")){
//            return null;
//        }
//        TreeNode root= new TreeNode(Integer.parseInt(arr[t]));
//        t=t+1;
//        root.left=helper(arr, t);
//        t=t+1;
//        root.right=helper(arr, t);
//        System.out.println(root.val);
//        return root;
//    }


    public static void main(String arg[]){
        dsTree solution =new dsTree();
        TreeNode root= new TreeNode(1);
        TreeNode left= new TreeNode(2);
        TreeNode right= new TreeNode(3);

        root.left=left;
        root.right=right;

//        left.left=new TreeNode(9);
//        right.left=new TreeNode(7);
        right.left= new TreeNode(4);
        right.right=new TreeNode(5);
        solution.serialize(root);

        String string= new String("1,2,#,#,3,4,#,#,5,#,#");
        solution.deserialize(string);
    }
}
