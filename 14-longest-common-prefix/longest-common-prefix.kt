class Solution {
    
fun longestCommonPrefix(strs: Array<String>): String {
    
    	var pref = ""
    	val first = strs[0]

      	for (i in first.indices) {
            var currentChar = first[i] 
            for(j in 1 until strs.size ){
                 if(i >= strs[j].length  ||   currentChar != strs[j][i])
                 return pref
    
            }
            pref = pref + currentChar
        } 
        
        return pref
        
    }


}