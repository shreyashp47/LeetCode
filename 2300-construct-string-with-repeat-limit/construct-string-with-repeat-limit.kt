class Solution {
    fun repeatLimitedString(s: String, repeatLimit: Int): String {
       val result = IntArray(26){0}
        for(count in 0..s.length-1) {
            result[s[count]-'a']++
        }
        var i = 25
        var j = i
        var count = 0
        var ans = StringBuilder("")
        while(i>=0 && j>=0) {
            while(i>=0 && result[i]==0) {
                i--
            }
            if(i<0) {
                continue
            }
            // println("i = $i, j = $j, count = $count, ans = ${ans.toString()}")
            if(count<repeatLimit) {
                ans.append((i+'a'.toInt()).toChar())
                result[i]--
                if(result[i]==0) {
                    count = 0
                }else {
                    count++
                }
            }else {
                j = i-1
                while(j>=0 && result[j]==0) {
                    j--
                }
                if(j<0) {
                    continue
                }
                ans.append((j+'a'.toInt()).toChar())
                result[j]--
                count = 0
            }
        }
        return ans.toString()
    }
}
