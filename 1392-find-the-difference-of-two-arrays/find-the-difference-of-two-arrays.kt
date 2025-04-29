class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        var set1 = HashSet<Int>()
        var set2 = HashSet<Int>()
        var map1 = nums2.toHashSet()
        for(i in nums1){
            if(!map1.contains(i)) set1.add(i)
        }
        var map2 = nums1.toHashSet()
        for(i in nums2){
            if(!map2.contains(i)) set2.add(i)
        }

        return mutableListOf<List<Int>>(set1.toList(),set2.toList())
        
    }
}