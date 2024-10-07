class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        
        println("size ${nums.size}")
        var ans = IntArray(nums.size)
        
        for(i in 0..nums.size-1){
            println(nums[i]*nums[i])
            ans[i] = nums[i] * nums[i]
            println("ans[i] ${ans[i]}")
        }
        ans.sort()
        
        
        return ans
        
    }
}