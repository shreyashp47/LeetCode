/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1
        var l1 = list1
        var l2 = list2
        var head =  ListNode(0);

        if(l1.`val` > l2.`val`) { //comparing and merging
            head = l2;
            l2 = l2.next;
        }
        else {
            head = l1;
            l1 = l1.next;
        }
        
        head.next = mergeTwoLists(l1, l2);
        return head;

       
    }
}