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
    }

    public static void main(String[] args) {

    }
}
