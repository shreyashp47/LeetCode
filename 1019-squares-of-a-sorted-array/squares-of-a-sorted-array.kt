class Solution {
      fun sortedSquares(nums: IntArray): IntArray {
        var result = IntArray(nums.size)
        var left = 0
        var pos = nums.size-1
        var right = nums.size-1
       while(left <= right){ 
           if(nums[left] * nums[left]  < nums[right] * nums[right] ){ 
               result[pos] = nums[right] * nums[right] 
               right--
           }else{  
               result[pos] = nums[left] * nums[left] 
               left++
           } 
           pos--
       }
        return result
    }
}