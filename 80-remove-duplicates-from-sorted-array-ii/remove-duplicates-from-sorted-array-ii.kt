class Solution {
    fun removeDuplicates(nums: IntArray): Int {
    var num = nums[0]  // nums.length >= 1
     var count = 0
     var j = 0

        for (i in nums.indices) {
            if(num == nums[i]) {
                count++ 
                if(count<3) nums[j++] = num
            }else{
                num = nums[i]
                nums[j++] = num
                count = 1
                
            }
        
        }
     
     return j
    }
}