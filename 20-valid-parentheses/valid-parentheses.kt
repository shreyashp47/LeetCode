class Solution {
    fun isValid(s: String): Boolean {
    if(s == "")
    return true 
    
    val asn = s.replace("[]","").replace("()","").replace("{}","")
 
 	if(asn == s) return false
    
    return isValid(asn)
    }
}