class Solution {
    fun missingNumber(nums: IntArray): Int {
         var n = nums.size
         var sum = 0 
         for(i in nums){
            sum = sum + i
         }
          var allSum = n * (n+1) / 2
         return allSum - sum
        
    }
}