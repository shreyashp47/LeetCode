class Solution {
    fun fib(n: Int): Int {
        return fibDp(n,IntArray(n + 1) { -1 })
    }
  fun fibDp(n: Int, dp: IntArray): Int {
    if(n == 0 || n==1) return n
    if(dp[n]!=-1) return dp[n];
    var sub1 = fib(n-1)
    var sub2 = fib(n-2)
    dp[n] = sub1 + sub2
    return dp[n]    
    }
}