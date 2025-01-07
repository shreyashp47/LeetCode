class Solution {
    fun canJump(nums: IntArray): Boolean {
        var slow = 0 
        var n  = nums.size
        var reach = 0

        while(slow < n){
            if(slow > reach) return false
            reach = Math.max(reach, slow+nums[slow])
        slow++
        }
        return true
    }
}