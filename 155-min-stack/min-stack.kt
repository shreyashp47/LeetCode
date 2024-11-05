 
class MinStack() {
    private val st = Stack<StackElement>()
 
    fun push(value: Int) { 
        val currentMin = if (st.isEmpty()) value else minOf(value, st.peek().min)
        st.push(StackElement(value, currentMin))
    } 
    fun pop() { 
        if (st.isNotEmpty()) {
            st.pop()
        }
    }
 
    fun top(): Int {
        if (st.isNotEmpty()) {
            return st.peek().data
        }
        throw NoSuchElementException("Stack is empty")
    }
 
    fun getMin(): Int {
        if (st.isNotEmpty()) {
            return st.peek().min
        }
        throw NoSuchElementException("Stack is empty")
    }
}
 
class StackElement(val data: Int, val min: Int)
