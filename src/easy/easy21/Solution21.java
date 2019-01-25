package easy.easy21;

import Entitie.ListNode;

/**
 * Created by teds on 1/17/2019.
 */
public class Solution21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null)
            return null;
        if(l1.val > l2.val) {
            ListNode tmp = l1;
            l1 = l2;
            l2 = tmp;
        }
        while(l1 != null && l2 != null) {
            if(l2.val > l1.next.val) {
                l1 = l1.next;
                continue;
            } else {
                l1.next = new ListNode(l2.val);
                l2 = l2.next;
                continue;
            }
        }
        return l1;
    }
    public static void main(String[] args) {
        ListNode n11 = new ListNode(1);
        ListNode n12 = new ListNode(2);
        ListNode n13 = new ListNode(4);
        n11.next = n12;
        n12.next = n13;
        ListNode n21 = new ListNode(1);
        ListNode n22 = new ListNode(3);
        ListNode n23 = new ListNode(4);
        n21.next = n22;
        n22.next = n23;
        ListNode node = mergeTwoLists(n11, n21);
        assert (node.val == 1);
        assert (node.next.val == 1);
        assert (node.next.next.val == 2);
        assert (node.next.next.next.val == 3);
        assert (node.next.next.next.next.val == 4);
        assert (node.next.next.next.next.next.val == 4);
    }
}
