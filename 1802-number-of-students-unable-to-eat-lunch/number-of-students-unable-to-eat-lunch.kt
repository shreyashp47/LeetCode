class Solution {
    fun countStudents(students: IntArray, sandwiches: IntArray): Int {
        
    val queue: MutableList<Int> = students.toMutableList()
    var sandwichIndex = 0

    while (sandwichIndex < sandwiches.size) { 
        if (queue.isNotEmpty() && queue[0] == sandwiches[sandwichIndex]) { 
            queue.removeAt(0)
            sandwichIndex++
        } else { 
            val student = queue.removeAt(0)
            queue.add(student)
        }
 
        if (queue.all { it != sandwiches[sandwichIndex] }) {
            break
        }
    }

    return queue.size 
    }
}