class Solution {
    fun kthFactor(n: Int, k: Int): Int {
        var fact = 0
        for(i in 1..n){
            if(n%i == 0 ) fact++ 
            if(fact == k) return i
        }
        return -1
    }
}