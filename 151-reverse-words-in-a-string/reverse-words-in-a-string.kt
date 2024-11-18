class Solution {
    fun reverseWords(s: String): String {
        var split = s.split(" ")
        var ans =""

        for(i in split.size-1 downTo 0){
            ans = ans.trim()+" "+split[i].trim()
        }
        
        return ans.trim()
    }
}