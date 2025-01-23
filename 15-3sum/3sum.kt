class Solution {
    
fun threeSum(nums: IntArray): List<List<Int>> { 
    val res = mutableListOf<List<Int>>()
    var n = nums.size-1
    nums.sort()
    for(i in 0..n){
        if(i>0 && nums[i-1] == nums[i]) continue
        var left = i+1
        var right = n
        while(left<right){
            var sum = nums[i] + nums[left] + nums[right]
            if(sum > 0 ){
                right--
            }else if(sum<0){
                left++
            }else{
                res.add(listOf(nums[i] , nums[left] , nums[right]))
                left++
                right--

                while(left<right && nums[left] == nums[left-1]) left++
                while(right<right && nums[right] == nums[right+1]) right--

            }
        }

    }


    return res
    }


}