class Solution {
    fun repeatLimitedString(s: String, repeatLimit: Int): String {
        val chars = s.toCharArray()
        chars.sort() // Sort the characters
        val result = StringBuilder()
        var freq = 1
        var pointer = chars.size - 1

        for (i in chars.indices.reversed()) {
            if (result.isNotEmpty() && result.last() == chars[i]) {
                if (freq < repeatLimit) {
                    result.append(chars[i])
                    freq++
                } else {
                    while (pointer >= 0 && (chars[pointer] == chars[i] || pointer > i)) {
                        pointer--
                    }

                    if (pointer >= 0) {
                        result.append(chars[pointer])
                        val temp = chars[i]
                        chars[i] = chars[pointer]
                        chars[pointer] = temp
                        freq = 1
                    } else {
                        break
                    }
                }
            } else {
                result.append(chars[i])
                freq = 1
            }
        }
        return result.toString()
    }
}
