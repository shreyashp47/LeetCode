class Solution {
    fun maxArea(height: IntArray): Int {
          var left = 0
        var right = height.size - 1
        var maxArea = 0

        while (left < right) {
            maxArea = max(maxArea, (right - left) * min(height[left], height[right]))
            if (height[left] <= height[right]) {
                left++
            } else {
                right--
            }
        }

        return maxArea
    }
}