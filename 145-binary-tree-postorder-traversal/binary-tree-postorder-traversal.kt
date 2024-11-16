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
    fun postorderTraversal(root: TreeNode?): List<Int> {
         var preorderTree = mutableListOf<Int>()
        if(root== null) return preorderTree
 
        postorder(root,preorderTree)
        return preorderTree
    }
    

    fun postorder(root: TreeNode?, result :MutableList<Int>){
        if (root==null) return 
       
        postorder(root.left, result)
         
        postorder (root.right, result)
        result.add(root.`val`) 
    }
}