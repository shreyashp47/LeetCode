class Solution {
    fun firstUniqChar(s: String): Int {
        val charCount = mutableMapOf<Char, Int>()
    val queue: Queue<Char> = LinkedList()
 
    for (char in s) {
        charCount[char] = charCount.getOrDefault(char, 0) + 1
        if (charCount[char] == 1) {
            queue.add(char)  
            println(char)
        }
    }
    while (queue.isNotEmpty()){ 
         val firstChar = queue.peek()
        if (charCount[firstChar] == 1) {
            return s.indexOf(firstChar)  
        }
        queue.poll()
    }

    return -1
    }
}