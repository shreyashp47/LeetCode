class Solution {
    fun minimumSize(nums: IntArray, maxOperations: Int): Int {
        val totalBags = nums.size + maxOperations

        fun countBags(maxEach: Int) : Int {
            var count = 0
            for (num in nums) {
                count += num / maxEach + if (num % maxEach == 0) 0 else 1
            }
            return count 
        }

        var left = 1
        var right = nums.maxOf { it }
        while (left <= right) {
            val mid = left + ((right - left) shr 1)
            val bags = countBags(mid)
            if (bags <= totalBags) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return left
    }
}