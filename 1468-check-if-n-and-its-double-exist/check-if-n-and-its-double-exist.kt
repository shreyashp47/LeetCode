class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
    var map = HashMap<Int,Int>() 
     for(i in arr.indices){
         if(map.containsValue(arr[i]*2) || (map.containsValue(arr[i]/2) && arr[i]%2 == 0)){
             println("${arr[i]}")
             return true
         }
         map[i] = arr[i]
     } 
 return false
 }
}