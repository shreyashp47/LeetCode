class Solution {
    fun findMin(nums: IntArray): Int {
       var min = nums[0]
    for(i in nums){
        if(min>i){
            min = i
        }
    }
    return min
          
    }
}