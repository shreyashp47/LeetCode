class Solution {
    fun singleNumber(nums: IntArray): Int {
        var ans = 0 
     
        for(i in nums){
            print( ans xor i )
            ans = ans xor i
        }
        return ans
    }
   
}