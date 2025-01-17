class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
    var pt = 0
    
    while(pt<numbers.size){
        
        var search = target - numbers[pt] 
        var left = pt+1
        var right = numbers.size-1
        while(left<=right){
            var mid = (right + left)/2
            if(numbers[mid] == search){
                if(pt<mid)
               return intArrayOf(pt+1,mid+1)else 
               return intArrayOf(mid+1,pt+1)
            }else if(search > numbers[mid]){
                left = mid +1
            }else right = mid -1
        }
        pt++
    }
    
    return intArrayOf()
    }
}