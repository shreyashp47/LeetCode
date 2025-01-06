class Solution {
    fun lengthOfLastWord(s: String): Int {
        
        var str = s.trim()
        var r = str.length-1 
       
        while(r>=0 && str[r] != ' '  ){ 
            r--
            
        }
        return  str.length-1 - r
    }
}