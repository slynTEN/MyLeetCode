package easy.easy21;

import Entitie.ListNode;


/**
 * Created by teds on 1/17/2019.
 */
public class Solution21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        if (l1.val > l2.val) {
            ListNode tmp = l1;
            l1 = l2;
            l2 = tmp;
        }
        ListNode result = l1, l1Next, l2Next;

        while(true)
        {
            while (l1.next != null) {
                if (l1.next.val < l2.val) {
                    l1 = l1.next;
                } else {
                    break;
                }
            }
            l1Next = l1.next;
            l1.next = l2;
            if (l1Next == null) {
                return result;
            }

            while (l2.next != null) {
                if (l1Next.val > l2.next.val) {
                    l2 = l2.next;
                } else {
                    break;
                }
            }
            l2Next = l2.next;
            l2.next = l1Next;
            if (l2Next == null) {
                return result;
            }
            l2 = l2Next;
        }
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
