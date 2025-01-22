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
    var count = 0
    fun countNodes(root: TreeNode?): Int {
        traverse(root)
        return count
    }
    private fun traverse(root: TreeNode?){
        if(root == null) return 
        count++
        traverse(root!!.left)
        traverse(root!!.right)
    }
}