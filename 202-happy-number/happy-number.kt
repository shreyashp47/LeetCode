class Solution {
   
fun isHappy(n: Int): Boolean {
    var num = n
    var map = mutableListOf<Int>()
    
    while(num!=1 && !map.contains(num)){
        map.add(num)
        num = isNext(num)
        println(num)
    }
    return num == 1
}

fun isNext(n: Int): Int {
    var num = n
    var count = 0
    while(num>0){
        var digit = num % 10;
        count += digit*digit
         num /= 10
    }
    return count
    
    
}
}