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
    fun hasCycle(head: ListNode?): Boolean {
        if(head == null || head.next == null) return false
        var node = head
        var map = HashMap<ListNode,Int>()
        while(node!=null){
            if(map.containsKey(node)) return true

            map[node] = node.`val`
            node = node.next
        }
        return false
    }
}