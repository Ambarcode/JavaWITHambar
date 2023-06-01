package com.ak.Questions;

public class RemoveDuplicatesFromSortedArray {

}
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode temp1=head;
        ListNode temp2=head.next;

        while(temp2!=null){
            if(temp1.val==temp2.val){
                temp1.next=temp2.next;
            }
            else{
                temp1=temp1.next;
            }

            temp2=temp2.next;
        }

        return head;

    }
}
