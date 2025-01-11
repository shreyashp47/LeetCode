class Solution {
    fun addBinary(a: String, b: String): String {
        var aBinary = a.toBigInteger(2) 
        var bBinary = b.toBigInteger(2)
        var sum = aBinary + bBinary
        return sum.toString(2)
        
    }
}