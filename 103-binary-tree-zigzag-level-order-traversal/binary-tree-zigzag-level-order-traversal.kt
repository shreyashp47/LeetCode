/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
        
      if(root == null) return emptyList()

        val result = mutableListOf<List<Int>>()
        val queue = LinkedList<TreeNode>()
        queue.add(root)

        while(queue.isNotEmpty()){ 
            var level = mutableListOf<Int>()

            for (i in queue.indices) {
                val node = queue.poll()
                level.add(node.`val`)

                if(node.left !=null){
                    queue.add(node.left)
                }

                if(node.right != null){
                    queue.add(node.right)
                }

             
            }

            if(result.size%2 != 0)
            level.reverse()

        result.add(level)
        }
       
          
        return result
    }
}