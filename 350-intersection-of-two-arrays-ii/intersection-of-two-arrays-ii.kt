class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
         nums1.sort()
     nums2.sort()
     var array = ""
     
     var n1 = 0
     var n2 = 0
     var k = 0
     
     while(n1 < nums1.size && n2 < nums2.size){ 
         if(nums1[n1] < nums2[n2]){
             n1++
         }else if(nums1[n1] > nums2[n2]){
             n2++
         }else {
             nums1[k] = nums1[n1]
             println("${nums1[k]}")
             k++
             n1++
             n2++
         }
         //println("$n1 $n2")
         //println("${nums1[n1]} ${nums2[n2]} ") 
         
     }
     
     return nums1.copyOfRange(0,k)
    }
}