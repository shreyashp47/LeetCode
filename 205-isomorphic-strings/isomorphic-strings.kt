class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        var map = HashMap<Char,Char>()

        for(i in 0..s.length-1){
            if(map.containsKey(s[i])){
                if(map.getOrDefault(s[i],"") != t[i]) return false
               
            }else if(map.containsValue(t[i])){
                if(map.getOrDefault(s[i],"") != t[i]) return false
            }else {
                map[s[i]] = t[i]
            }

        }
        
        return true
    }
}