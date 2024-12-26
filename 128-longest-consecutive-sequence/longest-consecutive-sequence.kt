class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if(nums.size == 0)
            return  0
       var map = HashMap<Int,Int>()
     var min = -1
     var count = 0 
     for(i in nums){
         map[i] = 1
         min = Math.min(min,i)
     }
     
     for(i in map){

        if(map.getOrDefault(i.key-1,0)==0){
        var ct = 1
         var x = i.key
         while(map.getOrDefault(x +1,0) > 0){
             ct = ct+1
             x++
         }
         count = Math.max(ct,count)
         
        }
     }
     return count
    }
}