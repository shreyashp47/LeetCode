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
    fun reverseOddLevels(root: TreeNode?): TreeNode? {
        
    if (root == null) {
            return null
        }
        // Caution: The problem asks to reverse the node values, not the nodes themselves
        dfs(root.left, root.right, 1)
        return root
    }

    private fun dfs(
        node: TreeNode?,
        symmetricNode: TreeNode?,
        level: Int,
    ) {
        if (node == null || symmetricNode == null) {
            return
        }
        if (level % 2 == 1) {
            node.`val` = symmetricNode.`val`.also { symmetricNode.`val` = node.`val` }
        }
        dfs(node.left, symmetricNode.right, level + 1)
        dfs(node.right, symmetricNode.left, level + 1)
    }
}