class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
    val words = s.split(" ")
    if (pattern.length != words.size) {
        return false // Early return if lengths don't match
    }

    val charToWord = HashMap<Char, String>()
    val wordToChar = HashMap<String, Char>()

    for (i in pattern.indices) {
        val char = pattern[i]
        val word = words[i]

        // Check if the current character already maps to a different word
        if (charToWord.containsKey(char) && charToWord[char] != word) {
            return false
        }

        // Check if the current word already maps to a different character
        if (wordToChar.containsKey(word) && wordToChar[word] != char) {
            return false
        }

        // Establish the bidirectional mapping
        charToWord[char] = word
        wordToChar[word] = char
    }

    return true
}

}