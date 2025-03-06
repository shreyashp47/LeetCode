class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var i = 0
        var j = 0
        val strBuilder = StringBuilder()

        while(i < word1.length && j < word2.length) {
            strBuilder.append(word1[i])
            strBuilder.append(word2[j])
            i++
            j++
        }

        while (i < word1.length) {
            strBuilder.append(word1[i])
            i++
        }

        while (j < word2.length) {
            strBuilder.append(word2[j])
            j++
        }

        return strBuilder.toString()
    }
}