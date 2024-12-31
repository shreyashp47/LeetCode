class Solution {
    fun hammingWeight(n: Int): Int {
       var current = n
        var bits = 0

        while (current != 0) {
            if (current % 2 == 1) bits++
            current /= 2
        }

        return bits
    }
}