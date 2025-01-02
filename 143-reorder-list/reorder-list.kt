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
    fun reorderList(head: ListNode?): Unit {
         if(head == null || head.next == null) return
       var slow = head
       var fast = head

       while(fast != null && fast.next != null){
        slow = slow!!.next
        fast = fast!!.next!!.next
       }

       var second = slow!!.next
        slow.next = null
       var prev: ListNode? = null

       while(second!=null){
        var next = second.next
        second.next = prev 
        prev = second 
        second = next
       }
        
        var first = head 
         second = prev
       while(second!=null){
        var temp1 = first!!.next
        var temp2 = second!!.next

        first.next = second
        second.next = temp1

        first = temp1
        second = temp2 

       }
    }
 
}