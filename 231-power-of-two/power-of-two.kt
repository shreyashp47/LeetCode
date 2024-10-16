class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
   for (i in 0..30) { // Adjusted the range
        val num = 1 shl i // 2^i is equivalent to shifting 1 by i bits
        if (num == n)
            return true
    }
    return false
    }
}