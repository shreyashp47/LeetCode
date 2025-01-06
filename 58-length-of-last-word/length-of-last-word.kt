class Solution {
    fun lengthOfLastWord(s: String): Int {
        var sp = s.trim().split(" ")

        var length = sp.size

        return sp[sp.size-1].length

        
    }
}