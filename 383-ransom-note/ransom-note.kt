class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
var map = HashMap<Char,Int>()
        for(i in magazine){
            map[i] = map.getOrDefault(i,0)+1
        } 

        for(i in ransomNote){
            if(map.getOrDefault(i,0)<=0){
                return false
            }else{
                map[i] = map.getOrDefault(i,0)-1
            }
        }
        return true
    }
}