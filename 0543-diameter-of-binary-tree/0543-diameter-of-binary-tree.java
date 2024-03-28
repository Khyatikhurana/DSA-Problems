/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int heightOfBT(TreeNode root){
        if(root == null){
            return 0;
        }
        
        int leftH = heightOfBT(root.left);
        int rightH = heightOfBT(root.right);
        
        return Math.max(leftH,rightH) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
         if(root == null){
            return 0;
         }
        
        int diam1 = diameterOfBinaryTree(root.left);
        int diam2 = diameterOfBinaryTree(root.right);
        int diam3 = heightOfBT(root.left) + heightOfBT(root.right) ;
        return Math.max(diam1,Math.max(diam2,diam3)) ;
        
        
        
    }
}