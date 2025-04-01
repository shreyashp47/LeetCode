class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var sPt = 0
        var tPt = 0 

        while(sPt<s.length && tPt<t.length ){
             if(s[sPt]== t[tPt]){
                sPt++
             }
             tPt++
        }
        return sPt == s.length
    }
}