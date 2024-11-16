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
    fun preorder(root: TreeNode?, result :MutableList<Int>){
        if (root==null) return 
        result.add(root.`val`) 
        preorder(root.left, result)
        preorder (root.right, result)
    }
    fun preorderTraversal(root: TreeNode?): List<Int> {
        var preorderTree = mutableListOf<Int>()
        if(root== null) return preorderTree
 
        preorder(root,preorderTree)
        return preorderTree
    }
}