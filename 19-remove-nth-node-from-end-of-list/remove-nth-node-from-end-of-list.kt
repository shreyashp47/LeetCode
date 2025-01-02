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
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        if(head ==null ) return null
        if(n==1 && head?.next == null) return null
        var ans = ListNode()
        ans.next = head
        var slow: ListNode? = ans
        var fast: ListNode? = ans

        for(i in 0..n){
            slow = slow?.next
        }

        while(slow!=null){
            slow = slow?.next
            fast = fast?.next
        }

        fast?.next = fast?.next?.next

        return ans.next
    }
}