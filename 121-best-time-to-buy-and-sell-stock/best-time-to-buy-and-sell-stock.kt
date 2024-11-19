class Solution {
    fun maxProfit(prices: IntArray): Int {
         if (prices.isEmpty()) return 0
    var max = 0
        var minPrice = prices[0]
        for (price in prices) {
            val diff = price - minPrice
            if (minPrice > price) minPrice = price
            if (diff > max) max = diff
        }

        return max
    }
}