/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode add = new ListNode(0);
        ListNode current =add;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;

            }

            carry = sum /10;
            current.next = new ListNode(sum  % 10);
            current = current.next;
        }
        return add.next;

    }

    public static void printList(ListNode node){
        while(node != null){
            System.out.print(node.val);
            if(node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
       Solution S = new Solution();

       ListNode l1 = new ListNode (2);
       l1.next = new ListNode(4);
       l1.next.next = new ListNode(3);

       ListNode l2 = new ListNode(5);
       l2.next = new ListNode(6);
       l2.next.next = new ListNode(4);

       ListNode result = S.addTwoNumbers(l1,l2);

       System.out.print("Output: ");
       printList(result);
    }
}