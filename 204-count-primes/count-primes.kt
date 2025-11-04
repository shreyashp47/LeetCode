class Solution {
    fun countPrimes(n: Int): Int {
        var count = 0
        for(i in 2..n-1){
            if(isPrime(i)){
                count++
            }
        }

        return count
    }

    fun isPrime(n:Int):Boolean{
        if(n<2) return false
        if(n==2) return true
        if (n % 2 == 0) return false
        val sqrtN = Math.sqrt(n.toDouble()).toInt()
        for (i in 3..sqrtN step 2) {
            if (n % i == 0) return false
        }
        return true
    }
}