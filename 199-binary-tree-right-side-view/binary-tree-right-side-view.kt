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
    fun rightSideView(root: TreeNode?): List<Int> {
         
      if(root == null) return emptyList()

        val result = mutableListOf<Int>()
        val queue = LinkedList<TreeNode>()
        queue.add(root)
        

        while(queue.isNotEmpty()){ 
            var l = 0

            for (i in queue.indices) {
                val node = queue.poll()
                l = node.`val`

                if(node.left != null){
                    queue.add(node.left)
                }
                if(node.right != null){
                    queue.add(node.right)
                }
                
                

             
            }
  
        result.add(l)
        }
       
          
        return result
    }
}