class Solution {
    fun fairCandySwap(aliceSizes: IntArray, bobSizes: IntArray): IntArray {
        var aliceSum = 0
     var bobSum = 0
     var map = mutableSetOf<Int>() 
     for(i in aliceSizes)
     	aliceSum += i 
     for(i in bobSizes){
         bobSum += i
         map.add(i)
     } 
     var target = ( aliceSum + bobSum ) /2 
     for(i in aliceSizes){
         val needed = target - (aliceSum - i)
         if(map.contains(needed)){
         return intArrayOf(i, needed)}
     }
     return aliceSizes
        
    }
    }