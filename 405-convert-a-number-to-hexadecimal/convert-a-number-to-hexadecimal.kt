class Solution {
    fun toHex(num: Int): String {
         if(num == 0){
         return "0"
     }
        
     var valNum = num.toLong() // Use a long to handle the negative value case
        
     if (num < 0) {
            valNum = (1L shl 32) + num // 2^32 + num to handle negative numbers 
     }

     val res = StringBuilder()
        while (valNum != 0L) {
            val remainder = (valNum % 16).toInt() // Find remainder for base 16
            valNum /= 16 // Divide by 16 for the next iteration
            
            if (remainder >= 10) {
                res.append((remainder + 87).toChar()) // For 'a' to 'f' (10 to 15)
            } else {
                res.append(remainder) // For 0 to 9
            }
        }

        return res.reverse().toString() // Rev
     
       
    }
}