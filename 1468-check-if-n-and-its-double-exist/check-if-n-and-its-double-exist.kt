class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
          for(i in 0..arr.size-1){
            
           for(j in 0..arr.size-1)
           {
               if(i!=j && arr[i]*2 == arr[j] )
              {  println("$i - $j "+arr[i]*2)
                return true
          
           }
           }
       }
       
       return false
    }
}