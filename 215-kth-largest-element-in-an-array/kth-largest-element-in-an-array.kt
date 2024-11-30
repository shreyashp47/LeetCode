class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
    val maxQueue = PriorityQueue<Int>(compareByDescending { it })
    var ans = 0
    for(i in nums)
        maxQueue.add(i)
    for(i in 1..k){
      ans =  maxQueue.poll()
    }
    return ans
    }
}