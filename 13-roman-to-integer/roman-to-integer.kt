class Solution {
    
    fun romanToInt(s: String): Int {
        
        var sum = 0
        var modifiedString = s 
            .replace("IV", "IIII")
            .replace("IX", "VIIII")
            .replace("XL", "XXXX")
            .replace("XC", "LXXXX")
            .replace("CD", "CCCC")
            .replace("CM", "DCCCC")
        var charArray = modifiedString.toCharArray()
        for(i in charArray){
            sum = sum + helper(i)
        }
        
        println("$s : $sum")
        return sum
    }

    fun helper(char: Char): Int {
        return when(char) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> 0
        }
    }
}