class Solution {
    fun fib(n: Int): Int {
        if(n==0) return 0
        if(n==1) return 1
        var a = 0
        var b = 1
        for(i in 2..n){
            val temp = a + b
            a = b
            b = temp 
        }
        return b
    }
}