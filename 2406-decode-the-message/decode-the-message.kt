class Solution {
    fun decodeMessage(key: String, message: String): String {
         val map = mutableMapOf<Char, Char>()
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    var index = 0
    for(i in key){
       if (i.isLetter() && !map.containsKey(i)) {
        map[i] = alphabet[index]
        index++
                }
    }
    val decodedMessage = StringBuilder()
    for (i in message){
        if(i == ' ')
        decodedMessage.append(' ')  
        else {
           decodedMessage.append(map[i] ?: i)
        }
    }
    
        return decodedMessage.toString()
    }
}