class Solution {
    fun isPowerOfFour(n: Int): Boolean {
        if(n == 0) return false
        if(n == 1) return true
        var num = n
        while(num%4 == 0){
            num = num/4
            if(num == 1) return true
        }
        return false
    }
}