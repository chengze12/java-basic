package com.chengze.Algrithom;

import com.chengze.Algrithom.support.ListNode;

import java.util.LinkedList;
import java.util.List;

public class symmtricList {

        public boolean isPalindrome(ListNode head) {
            if(head==null){
                return true;
            }
            ListNode reversed= reverse(head);
            while(head!=null && reversed!=null){
                if(head.val!=reversed.val){
                    return false;
                }else{
                    head=head.next;
                    reversed=reversed.next;
                }
            }
            return true;
        }
        private ListNode reverse(ListNode head){
            ListNode newhead=null;
            while(head!=null){
                ListNode Next= head.next;
                head.next=newhead;
                newhead=head;
                head=Next;
            }
            return newhead;
        }

    public  static  void main (String arg[]) {
        symmtricList solution = new symmtricList();

        List<Integer> numbers= new LinkedList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);

//        solution.isPalindrome();
        }

}
