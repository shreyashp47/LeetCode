class Solution {
    fun minSteps(s: String, t: String): Int {
    var map = HashMap<Char,Int>()
    for(i in s.toCharArray()){
        if(map.getOrDefault(i,0)==0)
        map[i] = 1
        else map[i] = map.getOrDefault(i,0)+1
        
    } 
    var count = 0
    for(i in t.toCharArray()){ 
        if(!map.containsKey(i) || map.getOrDefault(i,0)<1) 
        count +=1
        else map[i] = map.getOrDefault(i,0)-1
    } 
        
    return count
    }
}