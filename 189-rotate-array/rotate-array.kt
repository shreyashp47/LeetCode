class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        var arr = IntArray(nums.size)
         val steps = k % nums.size
        for(i in 0..nums.size-steps-1){
            arr[i] = nums[i]
        }
        var tep = 0
        for(i in nums.size-steps..nums.size-1){
            nums[tep] = nums[i]
            tep++ 
        }
        for(i in 0..arr.size-steps-1){
            nums[tep] = arr[i]
            tep++
        }
    }
}