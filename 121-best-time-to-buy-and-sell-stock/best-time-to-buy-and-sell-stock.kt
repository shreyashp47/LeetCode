class Solution {
    fun maxProfit(prices: IntArray): Int {
         if (prices.isEmpty()) return 0
      var minPrice = Int.MAX_VALUE
    var maxProfit = 0

    for (price in prices) { 
        if (price < minPrice) {
            minPrice = price
        } else { 
            val profit = price - minPrice
            if (profit > maxProfit) {
                maxProfit = profit
            }
        }
    }

    return maxProfit
    }
}