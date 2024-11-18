class Solution {
    fun repeatedSubstringPattern(s: String): Boolean {
       var n = s.length
     for (i in 1..n/2){
         if(n%i == 0){ 
             var sub = s.substring(0,i)
             var sb = StringBuilder()
             repeat(n/i){
                 sb.append(sub)
             }
             if(sb.toString().equals(s)) return true
         }
     }
     return false
        
        
    }
}