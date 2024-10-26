class Solution {
    fun isValid(s: String): Boolean {
         val stack = Stack<Char>()
          
          for(i in s.toCharArray()){
            if(i == '(' || i == '[' || i == '{'){ 
                stack.push(i)
                }else if(i == ')' || i == ']' || i == '}'){
                    if(stack.isEmpty()){
                        return false
                    }else if(i == ')' && stack.peek() == '('){ stack.pop()
                    }else if(i == ']' && stack.peek() == '['){stack.pop()
                    }else if(i == '}' && stack.peek() == '{'){ stack.pop()
                    }else return false 
                } 
          } 
          
          return stack.isEmpty();
    }
}