package physicsWallah.Linked_list.Questions;

import java.util.List;

public class twinSum {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
        public static ListNode reverse(ListNode head){
            ListNode curr = head;
            ListNode prev = null;
            ListNode agla = null;
            while(curr != null){
                agla = curr.next;
                curr.next = prev;
                prev = curr;
                curr = agla;
            }
            return prev;
        }
        public static int pairSum(ListNode head) {
            if(head == null){
                return 0;
            }
            ListNode slow = head;
            ListNode fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode half = slow.next;
            slow.next = null;
            ListNode rev = reverse(half);
            int ans = 0;
            ListNode first = head;
            while(rev!=null){
                ans = Math.max(ans , (rev.val + first.val));
                rev = rev.next;
                first = first.next;
            }
            return ans;
        }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(pairSum(a));
    }
}
