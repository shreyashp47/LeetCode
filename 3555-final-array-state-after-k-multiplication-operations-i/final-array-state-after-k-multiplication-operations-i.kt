class Solution {
    fun getFinalState(nums: IntArray, k: Int, multiplier: Int): IntArray {
       var numsCopy = nums.copyOf()

        for(i in 0 until k){
            var minIndex = 0

            for(j in 1 until numsCopy.size){
                if(numsCopy[j] < numsCopy[minIndex]){
                    minIndex = j
                }
            }

            numsCopy[minIndex] *= multiplier
        }

        return numsCopy
    }
}