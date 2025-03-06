class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var w1 = 0
        var w2 = 0 
        
        var ans = StringBuilder()
        while(w1 < word1.length && w2< word2.length){
            ans.append(word1[w1++])
            ans.append(word2[w2++])
        }
        while(w1 < word1.length)  ans.append(word1[w1++])
         while(w2 < word2.length)  ans.append(word2[w2++])

        return ans.toString()

    }
}