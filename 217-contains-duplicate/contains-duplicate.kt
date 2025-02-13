class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        var map = mutableListOf<Int>()
        for(i in nums){
            if(map.contains(i) )return true
            map.add(i)
        }
        return false
    }
}