class Solution {
    fun search(nums: IntArray, target: Int): Int {
      var l = 0
      var h = nums.size-1
      
      while(l<=h){
          var mid = l + (h-l)/2
          if(nums[mid] == target) return mid
          if(nums[l] == target) return l
          if(nums[h] == target) return h
          
           if (nums[l] <= nums[mid]) {
 			if (target >= nums[l] && target < nums[mid]) {
                h = mid - 1
            } else {
                l = mid + 1
            }
          }else {
              if(target > nums[mid] && target <= nums[h]) l = mid + 1 
              else h = mid - 1 
              
          }
          
          
      }
      
      return -1
    }
}