class Solution {
    fun isArraySpecial(nums: IntArray, queries: Array<IntArray>): BooleanArray {
      var ans = BooleanArray(queries.size)
     var arr = IntArray(nums.size)
     arr[0] = 0 
     for(i in 1..nums.size-1){ 
         if(nums[i-1]%2 == nums[i]%2){
             arr[i] = (arr[i-1]+1)
         }else arr[i] = (arr[i-1])
     }
     
     
     for(i in 0..queries.size-1){
         var one = arr[queries[i][1]]
         var two = arr[queries[i][0]]
         if( (one - two) != 0){
             ans[i] = false
         }else ans[i] = true
     }
    
     
     return ans
    }
}