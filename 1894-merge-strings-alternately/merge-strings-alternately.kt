class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var w1 = 0
        var w2 = 0 
        var ans = "" 
        while(w1 < word1.length || w2< word2.length){
            if(w1 < word1.length)
            ans = ans + word1[w1++]
            if (w2< word2.length)
            ans = ans+ word2[w2++]
        }

        return ans

    }
}