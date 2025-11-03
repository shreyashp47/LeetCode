class Solution {
    fun findGCD(nums: IntArray): Int {
        var max = 0
        var min = nums[0]
        for(i in nums){
            max = Math.max(i,max)
            min = Math.min(i,min)
        }
        return gcd(max,min)
    }

    fun gcd(a:Int,b:Int):Int{
        var x = a
        var y = b
        while(y!=0){
            var temp = y
            y = x % y
            x = temp
        }
        return x
    }
}