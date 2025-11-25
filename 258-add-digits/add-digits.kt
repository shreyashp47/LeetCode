class Solution {
    fun addDigits(num: Int): Int {
        var n = num
        while(n/10 >=1){
            val div = n/10
            val rem = n%10
            n = div+rem
        }
        return n
        
    }
}