class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var count = 0
     var map = HashMap<Char,Int>() 
     
     var i = 0  
     for(j in s.indices){
         if (map.containsKey(s[j])) {
            // Move i to the right of the last occurrence of s[j]
            i = Math.max(map[s[j]]!! + 1, i)
        }
        // Update the map with the latest index of s[j]
        map[s[j]] = j
        // Calculate the max length
        count = Math.max(count, j - i + 1)
     } 
     
     return count
    }
}