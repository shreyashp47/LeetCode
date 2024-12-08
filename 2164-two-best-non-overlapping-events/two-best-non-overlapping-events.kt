class Solution { 
fun maxTwoEvents(events: Array<IntArray>): Int {
    // Step 1: Sort events by their start time
    events.sortBy { it[0] }

    var maxValue = 0
    var maxSingle = 0
    val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.first }) // Min-heap based on end time

    for (event in events) {
        val (start, end, value) = event

        // Remove events that end before the current event's start time
        while (pq.isNotEmpty() && pq.peek().first < start) {
            val (_, prevValue) = pq.poll()
            maxSingle = maxOf(maxSingle, prevValue)
        }

        // Update the maximum value using the current event
        maxValue = maxOf(maxValue, maxSingle + value)

        // Add the current event to the heap
        pq.add(end to value)
    }

    return maxValue
}

}