class Solution {
    fun maximumBeauty(nums: IntArray, k: Int): Int {
        val sortedNums = nums.sorted()
        var left = 0
        val threshold = k * 2
        for (num in sortedNums) {
            if (threshold < num - sortedNums[left]) {
                left++
            }
        }
        return sortedNums.size - left
    }
}