class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {

        var list = mutableListOf<Boolean>()

        var bigNum = 0
        for(i in candies){
            if(bigNum < i ) bigNum = i
        }

        for(i in candies){
            if(bigNum <= (i + extraCandies)){
                list.add(true)
            }else  list.add(false)
        }




        return list
        
    }
}