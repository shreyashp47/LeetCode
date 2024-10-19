class Solution {
    fun isAnagram(s: String, t: String): Boolean {
 if(s.length != t.length){
        return false
     }
    
    var map = HashMap<Char,Int>()
    for(i in s.toCharArray()){
        if(map.getOrDefault(i,0)==0)
        map[i] = 1
        else map[i] = map.getOrDefault(i,0)+1
        
    }
    println(map)
    for(i in t.toCharArray()){
        println("$i "+map[i])
        println(map)
        if(!map.containsKey(i) ) 
        return false
        else if(map.getOrDefault(i,0)<1)
        return false
        else map[i] = map.getOrDefault(i,0)-1
    }
    println(map)
        return true
    }

    
}