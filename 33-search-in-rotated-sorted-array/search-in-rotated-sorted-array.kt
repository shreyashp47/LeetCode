class Solution {
    fun search(nums: IntArray, target: Int): Int {
     
     var l = 0 
     var h = nums.size-1
     while(l<=h){
         val mid = l+(h-l)/2
         if(nums[mid]==target) return mid
         
         if(nums[l]<=nums[mid]){
         if(target<nums[mid] && target>=nums[l]) h = mid-1
         else l = mid + 1
         }else {
             if(target > nums[mid] && target <= nums[h]) l = mid + 1 
             else h = mid-1 
          
         }
         
     }
        return -1
    }
}