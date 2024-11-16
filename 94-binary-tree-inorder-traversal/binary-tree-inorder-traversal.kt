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
    fun inorderTraversal(root: TreeNode?): List<Int> {
         var preorderTree = mutableListOf<Int>()
        if(root== null) return preorderTree
 
        inorder(root,preorderTree)
        return preorderTree
    }

    fun inorder(root: TreeNode?, result :MutableList<Int>){
        if (root==null) return 
       
        inorder(root.left, result)
         result.add(root.`val`) 
        inorder (root.right, result)
    }
    
}