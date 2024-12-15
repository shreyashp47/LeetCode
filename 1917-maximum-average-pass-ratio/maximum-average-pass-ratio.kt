class Solution {
fun maxAverageRatio(classes: Array<IntArray>, extraStudents: Int): Double {
    // Max-Heap PriorityQueue: Compare based on potential increase in pass ratio
    val pq = PriorityQueue<Pair<IntArray, Double>>(compareByDescending { it.second })

    // Initialize the PriorityQueue with initial potential increases
    for (cls in classes) {
        val pass = cls[0].toDouble()
        val total = cls[1].toDouble()
        val delta = ((pass + 1) / (total + 1)) - (pass / total)
        pq.offer(cls to delta)
    }

    // Assign extra students
    repeat(extraStudents) {
        val (cls, _) = pq.poll()
        val pass = cls[0].toDouble()
        val total = cls[1].toDouble()
        // Update the class with one extra passing student
        cls[0]++
        cls[1]++
        // Recalculate the new potential increase and push it back to the queue
        val newDelta = ((pass + 2) / (total + 2)) - ((pass + 1) / (total + 1))
        pq.offer(cls to newDelta)
    }

    // Calculate the final average pass ratio
    var totalRatio = 0.0
    for ((cls, _) in pq) {
        totalRatio += cls[0].toDouble() / cls[1].toDouble()
    }

    return totalRatio / classes.size
}}
 