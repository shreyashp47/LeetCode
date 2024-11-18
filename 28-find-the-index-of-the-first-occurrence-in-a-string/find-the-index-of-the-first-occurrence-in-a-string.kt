class Solution {
     fun strStr(haystack: String, needle: String): Int {
      
       if(needle.length > haystack.length)
      return -1
      
     for(i in 0..(haystack.length - needle.length)){ 
         if(haystack.substring(i,i+needle.length) == needle){
             return i
         }
     }
      
     
        return -1
        }
}