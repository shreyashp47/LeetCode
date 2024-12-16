class Solution {
    fun getFinalState(nums: IntArray, k: Int, multiplier: Int): IntArray {
         
        val minHeap = PriorityQueue<Pair<Int, Int>>(compareBy<Pair<Int, Int>> { it.second }.thenBy { it.first })

          
         for (i in nums.indices) {
            minHeap.offer(i to nums[i])
            }
        for (i in 1..k) {
            val min = minHeap.poll()
            val newValue = min.second * multiplier
            nums[min.first] = newValue
            minHeap.offer(min.first to newValue)
        }
         
         return nums
    }
}