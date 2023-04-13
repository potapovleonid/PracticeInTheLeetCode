package des.home.example;

import java.util.ArrayList;
import java.util.List;

public class Task234 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public boolean isPalindrome(ListNode head) {
        List<Integer> allNodesValues = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            allNodesValues.add(node.val);
            node = node.next;
        }

        int front = 0;
        int back = allNodesValues.size() - 1;

        while (front < back) {
            if (!allNodesValues.get(front).equals(allNodesValues.get(back))) {
                return false;
            }
            back--;
            front++;
        }
        return true;
    }
}
