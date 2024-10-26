class Solution {
    fun removeDuplicates(s: String): String {
        val st = Stack<Char>()
        for(i in s.toCharArray()){
            if(st.isEmpty()){
                st.push(i)
            }else{
                if(st.peek() == i)st.pop()
                else  st.push(i)
            }
        }
        return st.joinToString("")
    }
}