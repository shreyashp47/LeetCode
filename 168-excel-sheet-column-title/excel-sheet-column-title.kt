class Solution {
    fun convertToTitle(columnNumber: Int): String {
        var ans = ""
        var c = columnNumber

        while(c!=0){
            c = c-1
            var ch = 'A'+c%26
            ans  = ch+ans
            c = c/26
        }

        return ans
    }
}