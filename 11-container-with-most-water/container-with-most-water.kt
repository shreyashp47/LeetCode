class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0 
        var right = height.size - 1
        var ans = 0
        while(left<right){
            val minHeight = Math.min(height[left],height[right])
            val mostWater = (right - left ) * minHeight

            
            ans = Math.max(ans,mostWater)
            if(height[left]>height[right]) right--
            else left++

        } 

        return ans
    }
}