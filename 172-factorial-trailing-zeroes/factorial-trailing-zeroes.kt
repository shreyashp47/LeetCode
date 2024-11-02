class Solution {
    fun trailingZeroes(n: Int): Int {
         
    var count = 0
    var current = n
    
    while (current >= 5) {
        current /= 5
        count += current
    }
    
    return count
    }
}