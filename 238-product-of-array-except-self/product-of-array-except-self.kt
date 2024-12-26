class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
         var n = nums.size
       val result = IntArray(n) { 0 }
		result[0] = 1;
        for (i in 1..n-1) {
            result[i] = result[i - 1] * nums[i - 1];
        }
       
        var right = 1
        for (i in n-1 downTo 0 ) {
            result[i] *= right;
            right *= nums[i];
        } 
        return result 
    }
}