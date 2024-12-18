class Solution {
    fun finalPrices(prices: IntArray): IntArray {
        var arr = IntArray(prices.size)

        for(i in prices.indices){
            arr[i] = prices[i]

            for(j in i+1..prices.size-1){
                if(prices[i] >= prices[j]){
                    arr[i] = prices[i] - prices[j]
                    break
                }
            }
        }
        return arr
    }
}