package com.chengze.Algrithom;

import com.chengze.Algrithom.support.ListNode;

import java.util.LinkedList;

public class PalindromeLinkdeList {
    boolean res= true;
    public boolean isPalindrome(ListNode head) {
//        if(head == null){
//            return true;
//        }
        ListNode slow = head;
        ListNode quick = head;
        if(slow !=null && slow.next == null){
            System.out.println(res);
            return true;
        }
        while(quick.next != null && quick.next.next != null ){
            slow = slow.next;
            quick = quick.next.next;
        }
        ListNode p1 = slow;
        ListNode p2 = slow.next;
        slow.next = null;
        ListNode p3 = new ListNode(0);
        if(quick != null && quick.next !=null){
            p3 = quick.next;
        }
        if(quick != null && quick.next == null){
            p3 = quick;
        }
        p3.next = null;
        ListNode cur = head;
        ListNode prev = null;
        while(cur !=null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        while(prev!=null && p2 != null){
            if(prev.val != p2.val){
                res=false;
                System.out.println(res);
                return false;
            }
            prev = prev.next;
            p3 = p3.next;
        }
        System.out.println(res);
        return true;
    }
    // head--p1
    // p2--p3
    //reverse head--p1, 再比较两段


    public static void main(String[] arg){
        ListNode input= new ListNode(1);
        ListNode second =new ListNode(0);
        ListNode third= new ListNode(0);
        input.next=second;
        second.next=third;
        PalindromeLinkdeList solution= new PalindromeLinkdeList();
        solution.isPalindrome(input);

    }
}
