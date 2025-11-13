class Solution {
    fun isPalindrome(x: Int): Boolean {
        var rev =  reverse(x)
        if(rev == x && x>=0) return true
   			else return false
        
    }
fun reverse(x: Int): Int {
        var ans = 0
        var re = x
        while(re!=0){
            val rem = re%10
            re = re/10
            ans = ans*10+rem
            
        }
        return ans
        
    }

}