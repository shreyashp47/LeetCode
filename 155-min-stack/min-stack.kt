 
class MinStack() {
      val st = Stack<Int>()
      val min = Stack<Int>()
 
    fun push(value: Int) { 
        st.push(value)
        if(min.isEmpty() || min.peek() >= value){
            min.push(value)
        }
    } 
    fun pop() { 
       val p = st.pop()
       if(p == min.peek()){
        min.pop()
       }
    }
 
    fun top(): Int {
       return st.peek()
    }
 
    fun getMin(): Int {
         return min.peek()
    }
}
  
