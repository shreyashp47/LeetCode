class Solution {
    fun isPalindrome(x: Int): Boolean {
    if(x<0) return false
    var num = x
    var rev = 0
    while(num!=0){
        var pop = num % 10
        num = num / 10
        rev = rev * 10 + pop
    }
    if(rev == x) return true
    else return false 
    
    }
}