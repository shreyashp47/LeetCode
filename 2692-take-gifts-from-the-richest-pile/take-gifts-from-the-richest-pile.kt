class Solution {
    fun pickGifts(gifts: IntArray, k: Int): Long {
          val pq = PriorityQueue<Int>(compareByDescending { it })
		for( i in gifts){
    		pq.add(i)
		}
        for(i in 1..k){
            var max = pq.poll()
            var p = Math.sqrt(max.toDouble()).toInt()
            pq.add(p)
        }
        var sum = 0L
        for(i in pq){
            sum = sum+i
        }
    return sum
    }
}