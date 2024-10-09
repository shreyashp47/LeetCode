class Solution {
    fun check(nums: IntArray): Boolean {
        var count = 0
        for(i in 0 until nums.size){
            if(nums[i] > nums[(i+1)%nums.size])
                count++
            if(count>1) return false 
            }
     return true
    }
}