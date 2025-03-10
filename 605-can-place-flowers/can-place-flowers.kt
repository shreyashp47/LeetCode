class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        if(n==0 ) return true 
        var pt = 0
        var numOfFlwers = n
        while(pt < flowerbed.size && numOfFlwers>0){

        if(flowerbed[pt] == 0){
            if(flowerbed.size ==1){
                return true
            }
           if(pt==0 && flowerbed[pt]==0 && flowerbed[pt+1]== 0){
                numOfFlwers--
                flowerbed[pt] = 1
           }
           else if(pt==flowerbed.size-1 && flowerbed[pt]==0 && flowerbed[pt-1]==0){
                numOfFlwers--
                flowerbed[pt] = 1
           }
            else if(pt>0 && flowerbed[pt]==0 && flowerbed[pt-1]==0 && flowerbed[pt+1]== 0){
                numOfFlwers--
                flowerbed[pt] = 1
            }
            }
            pt++
            
            if(numOfFlwers==0)
            return true
        }
       
         return false
    }
}