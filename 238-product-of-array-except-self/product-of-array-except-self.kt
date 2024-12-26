class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
         var n = nums.size
       val result = IntArray(n) { 0 }
        var mul = 1
        for (i in 0..n-1) {
             result[i] = mul
            mul*=nums[i] 
        }
       
        var right = 1
        for (i in n-1 downTo 0 ) {
            result[i] *= right;
            right *= nums[i];
        } 
        return result 
    }
}