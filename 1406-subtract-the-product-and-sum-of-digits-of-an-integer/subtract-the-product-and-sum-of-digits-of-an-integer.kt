class Solution {
    fun subtractProductAndSum(n: Int): Int {

        var num = n
        var sum = 0
        var mul = 1
        while(num!=0){
            var rem = num % 10
            num = num / 10
            sum = sum + rem
            mul = mul * rem
        }
        return mul - sum
        
    }
}