package easy.easy21;

import Entitie.ListNode;

/**
 * Created by teds on 2019/1/28.
 */
public class Fastest21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode dummy = new ListNode(0);
        dummy.next = l1;
        ListNode cur = dummy;
        while(l1!=null && l2 != null){
            if(l1.val<=l2.val){
                l1 = l1.next;
            }else{
                ListNode next = l2.next;

                l2.next = cur.next;
                cur.next = l2;

                l2 = next;
            }
            cur = cur.next;
        }
        if(l2!=null){
            cur.next = l2;
        }
        return dummy.next;
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
