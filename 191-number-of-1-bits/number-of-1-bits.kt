class Solution {
    fun hammingWeight(n: Int): Int {
         var count = 0
         var num = n
       while(num>0){
            if(num % 2 == 1){
                count++
            }
            num /= 2
        }
         return count
    }
}