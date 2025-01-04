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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        
        var ans = ListNode(0)
        var curr = ans
        var p1 = l1
        var p2 = l2
        var carry = 0
        
        while(p1!=null || p2!=null){
            val x = p1?.`val` ?: 0
        val y = p2?.`val` ?: 0
        val sum = x + y + carry
             carry = sum / 10
             curr.next = ListNode(sum%10)
             curr =  curr.next!!


            p1 = p1?.next
            p2 = p2?.next
        }

        if(carry >0 )
        {
            curr.next = ListNode(carry)
        }

        return ans.next
        
    }
}