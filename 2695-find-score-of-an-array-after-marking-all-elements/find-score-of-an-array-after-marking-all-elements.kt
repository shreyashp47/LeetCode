class Solution {
    fun findScore(nums: IntArray): Long {
    var n = nums.size
     val copy = Array(n) { IntArray(2) }
     for( i in 0..n-1){
        copy[i][0] = nums[i]
        copy[i][1] = i
     }
		copy.sortWith(compareBy { it[0] })
        var ans = 0L
     for(i in 0..n-1){
         var element = copy[i][0]
         var idx = copy[i][1]
         if(nums[idx]<0) continue
         ans = ans+nums[idx]
         nums[idx] = -nums[idx]
         
         if(idx-1 >= 0 && nums[idx-1] > 0){
             nums[idx-1] = -nums[idx-1]
         }
         if(idx+1 < n && nums[idx+1] > 0){
             nums[idx+1] = -nums[idx+1]
         }
     }
      return ans
    }
}