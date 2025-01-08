class Solution {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length-1

        while(left<right){

            while(left < right && !s[left].isLetterOrDigit()){
                left++
            }
            while(left < right && !s[right].isLetterOrDigit()){
                right--
            } 

            if(s[left].toLowerCase()!=s[right].toLowerCase()){
                return false
            }else{
                right-- 
                left++
            }

        } 
        
        return true
    }
}