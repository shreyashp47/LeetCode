class Solution {
    fun mySqrt(x: Int): Int {
 if (x == 0) return 0
    var l = 1
    var h = x
    var ans = 0

    while(l<=h){ 
    val mid = l + (h - l) / 2

        if (mid <= x / mid) { 
                ans = mid
                l = mid + 1
            } else {
           h = mid -1
        }
    }
    return ans

        
    }
}
