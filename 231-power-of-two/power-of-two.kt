class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        if(n == 0) return false 
        var num = n
        while(num%2 == 0){
            num = num/2
            
        }
        if(num == 1) return true 
        else 
            return false
    }
}