package LinkedListQues;

public class ReorderList {
       class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
     public void reorderList(ListNode head) {
        if(head== null || head.next == null)return;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev1 = null;
        while(fast != null && fast.next != null){
            prev1 = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev1.next = null;
        ListNode mid = slow;
        ListNode curr = mid;
        ListNode prev = null;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }


      ListNode temp1 = head;
      ListNode temp2 = prev;
      ListNode next1;
      ListNode next2;
      while(temp1 != null && temp2 != null){
        next1 = temp1.next;
        next2 = temp2.next;
        temp1.next = temp2;
        if(next1 == null)return;
        temp2.next = next1;
        temp1 = next1;
        temp2 = next2;
      }

      return ;

    }
}