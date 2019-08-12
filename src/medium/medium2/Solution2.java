package medium.medium2;

import Entitie.ListNode;

public class Solution2 {
    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode current = l3;
        int valEx = 0;
        while(l1 != null && l2 != null) {
            ListNode newNode = new ListNode(0);
            newNode.val = (l1.val + l2.val + valEx) % 10;
            valEx = (l1.val + l2.val + valEx) / 10;
            current.next = newNode;
            current = newNode;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null) {
            ListNode newNode = new ListNode(0);
            newNode.val = (l1.val + valEx) % 10;
            valEx = (l1.val + valEx) / 10;
            current.next = newNode;
            current = newNode;
            l1 = l1.next;
        }
        while(l2 != null) {
            ListNode newNode = new ListNode(0);
            newNode.val = (l2.val + valEx) % 10;
            valEx = (l2.val + valEx) / 10;
            current.next = newNode;
            current = newNode;
            l2 = l2.next;
        }
        if(valEx != 0) {
            ListNode newNode = new ListNode(valEx);
            current.next = newNode;
        }
        return l3.next;
    }

    public static void main(String[] args) {
        ListNode n11 = new ListNode(2);
        ListNode n12 = new ListNode(4);
        ListNode n13 = new ListNode(3);
        n11.next = n12;
        n12.next = n13;
        ListNode n21 = new ListNode(5);
        ListNode n22 = new ListNode(6);
        ListNode n23 = new ListNode(4);
        n21.next = n22;
        n22.next = n23;
        ListNode node = addTwoNumbers(n11, n21);
        assert (node.val == 7);
        assert (node.next.val == 0);
        assert (node.next.next.val == 8);
    }
}
