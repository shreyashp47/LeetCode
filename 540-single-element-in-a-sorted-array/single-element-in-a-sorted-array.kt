class Solution {
    fun singleNonDuplicate(nums: IntArray): Int {
         
     var h = nums.size-1
     var l = 0
     
     while(l<h){
         var mid = (h+l)/2
         if(mid%2==1){
             mid--
         }
         
         if(nums[mid]==nums[mid+1]){
             l = mid+2
         }else{
             h = mid
         }
     }
     return nums[l]
        
    }
}