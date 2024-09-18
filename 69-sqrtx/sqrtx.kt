class Solution {
    fun mySqrt(x: Int): Int {
        var left = 1
        var right = x
            while (left<=right){
                val middle = ( left + right )  / 2
                if (x / middle == middle){
                    return middle
                }else if (x / middle<middle){
                  right = middle-1
                 }else{
                      left=middle+1
            }
        }
        return right
    }
}