class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
         var count = 0
        
        for(i in 0..nums.size -1 ){ 
            if(nums[i] != `val`){
                nums[count++] = nums[i]
            }
        } 
        return count
    }
}