class Solution {
    fun reverseVowels(s: String): String {
       
        val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        val map = mutableListOf<Char>()

        for(c in s){
            if(vowels.contains(c) )
                map.add(c)
        }
        var index = map.size - 1
        val ans = StringBuilder()
        for(c in s){
            if(vowels.contains(c)){
                ans.append(map[index--])
                }
                else ans.append(c)
        }
        return ans.toString()
    }
}