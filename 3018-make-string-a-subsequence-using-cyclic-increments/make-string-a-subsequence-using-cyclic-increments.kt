class Solution {
    fun canMakeSubsequence(str1: String, str2: String): Boolean {
    var j = 0
    for(i in str1){
        if(i == str2[j] || (i - 'a' + 1) %26 == (str2[j]- 'a') ){
            j++
        } 
        if(j == str2.length) return true
    }
        return false
    }
}