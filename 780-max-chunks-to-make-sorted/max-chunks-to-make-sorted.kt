class Solution {
    fun maxChunksToSorted(arr: IntArray): Int {
         var chunk = 0
     var max = 0
     for(i in arr.indices){
         max = Math.max(max , arr[i])
         if(max < i+1) chunk++
     }
        return chunk 
    }
}