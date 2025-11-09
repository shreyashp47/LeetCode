class Solution {
    fun reverse(x: Int): Int {
        var ans = 0
        var re = x
        while(re!=0){
            val rem = re%10
            if (ans > Int.MAX_VALUE / 10 || (ans == Int.MAX_VALUE / 10 && rem > 7)) {
                return 0 // Overflow for positive
            }
            if (ans < Int.MIN_VALUE / 10 || (ans == Int.MIN_VALUE / 10 && rem < -8)) {
                return 0 // Overflow for negative
            }
            re = re/10
            ans = ans*10+rem
            
        }
    
        return ans
        
    }
}