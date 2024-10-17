class Solution {
    fun maxNumberOfBalloons(text: String): Int {
         var balloon = "balloon"
    var map = HashMap<Char, Int>()
    for(i in text ){
        if(i == 'b' || i == 'a' || i == 'l' || i == 'o' || i == 'n' ){
            map[i] = map.getOrDefault(i,0) + 1
        }
    }
    map['l'] = map.getOrDefault('l',0)/2
    map['o'] = map.getOrDefault('o',0)/2
    
    
    var balon = "balon"
    var ans = Integer.MAX_VALUE
    
    for(i in balon ){
       if(map.getOrDefault(i,0) < ans){
           ans = map.getOrDefault(i,0)
       }
    }
    
    
    return ans
        
    }
}