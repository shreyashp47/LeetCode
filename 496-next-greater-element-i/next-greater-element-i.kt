class Solution {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        
        var ngr =  ngr(nums2)

        var map = HashMap<Int,Int>()
        for(i in 0..nums2.size-1)
            map[nums2[i]] = ngr[i]

        var ans = IntArray(nums1.size)
        for(i in 0..nums1.size-1){
           ans[i] = map[nums1[i]] ?: 0
        }

      return  ans
    }

    fun ngr(num: IntArray): IntArray{
        var n = num.size
        var ans  = IntArray(n)

        ans[n-1] = -1
        val st = Stack<Int>()
        st.push(num[n-1])
        for(i in n-2 downTo 0){
            
            while(st.size>0 && st.peek()<= num[i]){
                st.pop()
            }
            if(st.size == 0)
            ans[i] = -1
            else ans[i] = st.peek()
            st.push(num[i])
        }

        return ans
    }
}