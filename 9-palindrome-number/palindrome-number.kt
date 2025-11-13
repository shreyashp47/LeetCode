class Solution {
fun isPalindrome(x: Int): Boolean {
        var rev : String = ""+x
    	rev = rev.reversed()
        if(rev == x.toString()) return true
   			else return false
}
}