class Solution {
    fun missingNumber(nums: IntArray): Int {
        val set :MutableSet<Int> = mutableSetOf()
        for(i in nums){
            set.add(i)
        }
        for(i in 0..set.size){
            if(!set.contains(i)) return i
        }
        return 0
        
    }
}