class Solution {
      fun twoSum(nums: IntArray, target: Int): IntArray {
      var list = mutableMapOf<Int,Int>()
      for(i in nums.indices){
          var diff = target - nums[i]
          if(list.contains(diff)) 
          return intArrayOf(list[diff]!!,i)
          list[nums[i]] =  i
      }
        return intArrayOf()
    }
}