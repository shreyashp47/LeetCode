class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length){
        return false
        }
        var map = HashMap<Char,Int>()
        for(i in 0..s.length-1){
            map[s[i]] = map.getOrDefault(s[i],0) + 1
        }
        for(i in 0..t.length-1){

            if(map.getOrDefault(t[i],0)==0)
            return false
            else map[t[i]] = map.getOrDefault(t[i],0)-1
        }

        return true
    }
}