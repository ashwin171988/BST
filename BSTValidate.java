/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
     
     if(root == null)
     return true;
     
     if(root.left == null && root.right == null)
     return true;
     
     boolean leftSubtree = ( root.left != null ) ? ( (root.val >= root.left.val) && (isValidBST(root.left)) ) : true;
     boolean rightSubtree = (root.right!=null) ? ( (root.val < root.right.val) && (isValidBST(root.right)) ) : true;
    
    return (leftSubtree && rightSubtree );
        
    }
}