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
    fun reverseList(head: ListNode?): ListNode? {
       if(head==null || head.next==null) return head 
       var prev = head
       var current = head.next
       prev.next = null
       while(current!=null){
        val next = current.next
        current.next = prev
        prev = current
        current = next
       }

        return prev
    }
}