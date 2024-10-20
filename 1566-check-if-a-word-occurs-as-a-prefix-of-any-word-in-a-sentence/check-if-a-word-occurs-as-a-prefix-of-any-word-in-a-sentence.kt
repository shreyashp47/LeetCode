class Solution {
    fun isPrefixOfWord(sentence: String, searchWord: String): Int {
         var words = sentence.split(" ")
        for(i in 0..words.size-1){
            if(words[i].startsWith(searchWord)){
                return i+1
            }
        }
    return -1
    }
}