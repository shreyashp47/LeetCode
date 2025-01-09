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

    var maxDepth = 0
    fun maxDepth(root: TreeNode?): Int {
        travers(root,1)
        return maxDepth
    }

    fun travers(root: TreeNode?, depth : Int){
        if(root == null) return
        maxDepth = Math.max(maxDepth,depth)
        travers(root.left, depth+1)
        travers(root.right, depth+1)

    }
}