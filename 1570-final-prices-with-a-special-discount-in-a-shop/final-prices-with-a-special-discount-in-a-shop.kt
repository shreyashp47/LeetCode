class Solution {
    fun finalPrices(prices: IntArray): IntArray {
       

        for(i in prices.indices){
           

            for(j in i+1..prices.size-1){
                if(prices[i] >= prices[j]){
                    prices[i] = prices[i] - prices[j]
                    break
                }
            }
        }
        return prices
    }
}