class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
    var map = mutableSetOf<Int>()
     for(i in arr){
         if(map.contains(i*2) || (map.contains(i/2) && i%2 == 0)){
             return true
         }
         map.add(i)
     } 
 return false
 }
}