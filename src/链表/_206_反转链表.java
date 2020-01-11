package 链表;

import java.util.ArrayList;

public class _206_反转链表 {
    class Solution {
        public ListNode reverseList(ListNode head) {

            if(head==null||head.next==null) return head;

            ListNode newHead=reverseList(head.next);
            head.next.next=head;
            head.next=null;
            return newHead;

        }
        //迭代的方式
        public ListNode reverseList2(ListNode head) {
            if(head==null||head.next==null){
                return head;
            }
            ListNode newhead=null;

            while (head!=null){
                ListNode tmp=head.next;
                head.next=newhead;
                newhead=head;
                head=tmp;
            }
            return newhead;

        }
    }

    public static void main(String[] args) {

    }
}
