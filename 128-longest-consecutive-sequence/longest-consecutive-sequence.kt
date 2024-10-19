class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        
        if(nums.size == 0)
            return  0
        var longest = 1
        
        var map = HashSet<Int>()
        for(i in nums){
            map.add(i)
        }

        for(i in map){

            if(!map.contains(i-1)){
                var count = 1
                var x = i
                while(map.contains(x+1)){
                    count = count +1
                    x = x+1

                }
            longest = Math.max(longest,count)
            }
        }



        return longest
    }
}