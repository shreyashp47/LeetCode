class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        for( i  in s){
            if(i == '(' || i== '[' || i == '{'){
                stack.push(i)
            }
            else if(i == ')' || i== ']' || i == '}' ){
                if(stack.isEmpty()) return false
                if(stack.peek() == '(' && i == ')') stack.pop()
                else if(stack.peek() == '[' && i == ']') stack.pop()
                else if(stack.peek() == '{' && i == '}') stack.pop()
                else return false
            }
        }
        
        return stack.isEmpty()
    }
}