package com.chengze.Algrithom.heavywater;

import com.chengze.Algrithom.support.ListNode;

import java.util.HashSet;

public class RedundancyLinkedList {
    public ListNode redundancy(ListNode head){
        HashSet<Integer> set= new HashSet<>();
        if(head.next==null) {
            System.out.println(head.val);
            return head;
        }
        ListNode pre= head;
        ListNode cur=head.next;
        set.add(head.val);
        while(cur!=null){
            if(set.contains(cur.val)){
                pre.next=cur.next;
                cur=cur.next;
            }else{
                set.add(cur.val);
                cur=cur.next;
                pre=pre.next;
            }
        }
        ListNode temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args){
        RedundancyLinkedList solution= new RedundancyLinkedList();
        ListNode head=new ListNode(1);
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(2);
        ListNode fourth=new ListNode(3);
        head.next=second;
        second.next=third;
        third.next=fourth;
        solution.redundancy(head);
    }
}
