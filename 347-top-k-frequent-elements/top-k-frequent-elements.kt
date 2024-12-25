class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        var map = HashMap<Int,Int>()
     val pq = PriorityQueue<Pair<Int, Int>> { p1, p2 ->
            Integer.compare(p2.second, p1.second)
        }
        for(i in nums){
            map[i] = map.getOrDefault(i,0)+1
        } 
        map.forEach { x, y -> 
            pq.offer(Pair(x, y))
        }
         val res = mutableListOf<Int>()
         var ct = k 
        while(ct > 0) {
            val x = pq.peek()
            if(x != null) {
                res.add(x.first)
                pq.remove(x)
            }
            ct--
        }
        return res.toIntArray()
    }
}