class Solution {
    fun lengthOfLastWord(s: String): Int {
        
        var str = s.trim()
        var r = str.length-1 
        var count = 0
        while(r>=0 && str[r] != ' '  ){ 
            r--
            count++


        }
        return count
    }
}