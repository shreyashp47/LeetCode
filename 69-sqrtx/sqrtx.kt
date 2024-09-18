class Solution {
    fun mySqrt(x: Int): Int {
        if (x == 0) return 0  // Handle the case where x is 0

        var left = 1
        var right = x
        while (left <= right) {
            val middle = left + (right - left) / 2
            if (middle == x / middle) {
                return middle
            } else if (middle > x / middle) {
                right = middle - 1
            } else {
                left = middle + 1
            }
        }
        return right
    }
}
