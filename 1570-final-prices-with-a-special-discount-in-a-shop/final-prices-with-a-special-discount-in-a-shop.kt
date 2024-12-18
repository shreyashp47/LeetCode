class Solution {
    fun finalPrices(prices: IntArray): IntArray {
        var stack = Stack<Int>()
        var size = prices.size-1

        for(i in size downTo 0){
            while(!stack.isEmpty() && stack.peek()>prices[i]){
                stack.pop()
            }
            var p = prices[i]
            if(!stack.isEmpty()){ 
                prices[i] =  prices[i] - stack.peek() 
            } 
                stack.push(p)
            
        }
        return prices
    }
}