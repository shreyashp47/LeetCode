class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
      val ans = IntArray(nums.size)
		var mul = 1
        for (i in nums.indices) {
            ans[i] = mul
            mul*=nums[i]
        }
       
        var right = 1
        for (i in nums.indices.reversed()) {
            ans[i] *= right;
            right *= nums[i];
        } 
        return ans 
    }
}