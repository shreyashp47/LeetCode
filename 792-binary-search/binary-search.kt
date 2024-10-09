class Solution {
    fun search(nums: IntArray, target: Int): Int {

         var start = 0
        var end = nums.size-1
        while(start<=end){ 
            var mid : Int = start+end 
            println(mid)
             if(nums[mid] == target){
                 return mid
             } else if(nums[mid]<target){
                 start = mid+1
             }else {
                 end = mid -1
             }
            
        }
        return -1
    }
}