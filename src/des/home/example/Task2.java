package des.home.example;

public class Task2 {

     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode startNode;
        ListNode ln;
        int count;
        startNode = new ListNode((l1.val + l2.val) % 10);
        count = (l1.val + l2.val) / 10;
        ln = startNode;
        while (l1.next != null || l2.next != null){
            if (l1.next != null && l2.next != null){
                ln.next = new ListNode((l1.next.val + l2.next.val + count) % 10);
                count = (l1.next.val + l2.next.val + count) / 10;
                l1 = l1.next;
                l2 = l2.next;
                ln = ln.next;
            } else if (l1.next != null){
                ln.next = new ListNode((l1.next.val + count) % 10);
                count = (l1.next.val + count) / 10;
                l1 = l1.next;
                ln = ln.next;
            } else {
                ln.next = new ListNode((l2.next.val + count) % 10);
                count = (l2.next.val + count) / 10;
                l2 = l2.next;
                ln = ln.next;
            }
        }
        if (count != 0){
            ln.next = new ListNode(count);
        }
        return startNode;
    }
}
