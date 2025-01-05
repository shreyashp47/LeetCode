class Solution {
    fun majorityElement(nums: IntArray): Int {
        var map = HashMap<Int,Int>()
        var max = 0
        var ans = 0

        for(i in nums){
            map[i] = map.getOrDefault(i,0) +1
            if(map.getOrDefault(i,0)>=max){
                ans = i
                max = map.getOrDefault(i,0)
            }
        }
        return ans
    }
}