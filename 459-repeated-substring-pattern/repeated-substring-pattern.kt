class Solution {
    fun repeatedSubstringPattern(s: String): Boolean {
        
       var n = s.length
        if (n <= 1) return false
     for (i in 1..n/2){
         if(n%i == 0){ 
             var sub = s.substring(0,i)
             var sb = StringBuilder()
             val repeated = sub.repeat(n / i)
                if (repeated == s) {
                    return true
                }
         }
     }
     return false
        
        
    }
}