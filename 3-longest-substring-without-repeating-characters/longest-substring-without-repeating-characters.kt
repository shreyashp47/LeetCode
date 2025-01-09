class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
      var map = mutableSetOf<Char>()
      var slow = 0 
      var fast = 0 
      var max = 0

      while(fast < s.length){
        if(!map.contains(s[fast])){
            map.add(s[fast])
            fast++
            max = Math.max(max,map.size)
        }else{
            map.remove(s[slow])
            slow++
        }


      }
return max
    }
}