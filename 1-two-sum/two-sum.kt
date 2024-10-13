class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
    var map = HashMap<Int, Int>()
     for(i in 0..nums.size-1){ 
         val c =  target - nums[i] 
         if(map.containsKey(c) ){
             return intArrayOf(map[c]!!,i)
         }
         map[nums[i]] = i
     } 
     return intArrayOf() 
    }
}