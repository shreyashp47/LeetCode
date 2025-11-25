class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        var num = n
        if(num == 0) return false 
        while(num%2 == 0){
            num = num/2
            
        }
        if(num == 1) return true 
        else 
            return false
    }
}