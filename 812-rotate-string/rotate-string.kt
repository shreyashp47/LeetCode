class Solution {
    fun rotateString(s: String, goal: String): Boolean {
        if(s.length != goal.length) return false
        var str = goal+goal 
        return str.contains(s)
    }
}