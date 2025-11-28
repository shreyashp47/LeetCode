class Solution {
    fun integerBreak(n: Int): Int {
        if (n <= 3) return n - 1   
        
        var num = n
        var product = 1
        
        while (num > 4) {
            product *= 3
            num -= 3
        }
        
        return product * num
    }
}
