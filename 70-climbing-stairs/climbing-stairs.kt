class Solution {
    fun climbStairs(n: Int): Int {
   var dp = IntArray(n+1){0} 
    dp[0] = 1  
    dp[1] = 1  
    for(i in 2..n){
        dp[i] = dp[i-1] + dp[i-2] 
    }
    return dp[n]
    }
}