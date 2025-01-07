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
    fun rotateRight(head: ListNode?, k: Int): ListNode? {
    if (head == null || head.next == null || k == 0) return head

        var size = 1
        var tail = head
        while(tail?.next!=null){ //Calculate the size of the list
            tail = tail?.next
            size++
        } 

        var rotation = k % size //Calculate the effective rotations needed
        if(rotation == 0) return head
        println("$rotation $size")

        var slow = head
        var fast = head
        for(i in 0 until rotation){ //Find the new head
            fast =fast?.next
        }

        while(fast?.next !=null){
            slow = slow?.next
            fast = fast.next
        }

        println( " "+ slow?.next?.`val`+
        " " +fast?.next?.`val`

        )

        val ans = slow?.next
        slow?.next = null
        fast?.next = head
 

        return ans
    }
}