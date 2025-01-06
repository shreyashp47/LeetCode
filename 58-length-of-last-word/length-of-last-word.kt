class Solution {
    fun lengthOfLastWord(s: String): Int {
        
        var str = s
        var r = str.length-1 
        var count = 0
          while(r>=0 && str[r] == ' '  ){ 
            r--
          }
       
        while(r>=0 && str[r] != ' '  ){ 
            count++
            r--
            
        }
        return  count
    }
}