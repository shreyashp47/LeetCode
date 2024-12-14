class Solution {
    fun continuousSubarrays(nums: IntArray): Long {
      var start = 0
    var result = 0L
    val minDeque: Deque<Int> = LinkedList() // Tracks indices of minimum values
    val maxDeque: Deque<Int> = LinkedList() // Tracks indices of maximum values

    for (end in nums.indices) {
        // Maintain minDeque: Remove indices of elements larger than nums[end]
        while (minDeque.isNotEmpty() && nums[minDeque.last()] > nums[end]) {
            minDeque.removeLast()
        }
        minDeque.addLast(end)

        // Maintain maxDeque: Remove indices of elements smaller than nums[end]
        while (maxDeque.isNotEmpty() && nums[maxDeque.last()] < nums[end]) {
            maxDeque.removeLast()
        }
        maxDeque.addLast(end)

        // Shrink window if condition is violated
        while (nums[maxDeque.first()] - nums[minDeque.first()] > 2) {
            if (minDeque.first() == start) minDeque.removeFirst()
            if (maxDeque.first() == start) maxDeque.removeFirst()
            start++
        }

        // Count valid subarrays ending at 'end'
        result += (end - start + 1)
    }

    return result  
    }
}