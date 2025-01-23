class Solution {
    fun maxArea(height: IntArray): Int {
        var ans = 0
        var left = 0
        var right = height.size - 1

        while(left<right){
            var min = Math.min(height[left], height[right])
            ans = Math.max(ans, min * (right-left))
            if(height[left] > height[right]) right--
            else left ++
        }
        return ans
    }
}