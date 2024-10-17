class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
      
     var map  = HashMap<Int,Int>()
     var result = 0
     map[0] = 1
     
     var sum = 0
     
     for(i in nums){
         sum += i
         
         if(map.containsKey(sum - k)){
             result += map[sum - k] ?: 0
         }
         
         map[sum] = map.getOrDefault(sum,0) +1
         
     }
        return result   
    }
}