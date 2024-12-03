class Solution {
    fun addSpaces(s: String, spaces: IntArray): String {
        val ans = StringBuilder()
        var currentIndex = 0

        for(i in spaces){
            ans.append(s.substring(currentIndex, i)) 
            ans.append(" ")
            currentIndex = i
        }
        ans.append(s.substring(currentIndex))
        return ans.toString()
    }
}