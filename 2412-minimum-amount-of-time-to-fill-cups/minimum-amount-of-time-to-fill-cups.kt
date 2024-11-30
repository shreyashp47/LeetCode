class Solution {
    fun fillCups(amount: IntArray): Int {
        val pq = PriorityQueue<Int>(Comparator { a, b -> b - a})
    for(i in amount)
    pq.add(i)
    var time =  0
     while(pq.peek() != 0) {
        var max1 = pq.poll()
        var max2 = pq.poll()
        time += 1
        pq.add(max1 - 1)
        pq.add(max2 - 1)
     
     }

        return time
    }
}