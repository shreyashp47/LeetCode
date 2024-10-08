class Solution {
      fun sortedSquares(nums: IntArray): IntArray {
        
        var result = IntArray(nums.size)
        var left = 0
        var pos = nums.size-1
        var right = nums.size-1
        
        
       while(left <= right){
          	val l = nums[left] * nums[left] 
         	val  r = nums[right] * nums[right] 
           println("sqare $l $r")
           if(l < r){ 
               result[pos] = r
               right--
           }else{  
               result[pos] = l
               left++
               
           }
           println(result[pos])
           pos--
           
           
       }
        
        return result
        
    }
}