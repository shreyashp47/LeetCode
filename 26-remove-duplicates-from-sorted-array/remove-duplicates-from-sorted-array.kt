class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var count = 1
      for(i in 1..nums.size-1){
        if(nums[i] != nums[i-1]){
            nums[count] = nums[i]
            count++
        }


      }
      return count
    }
}