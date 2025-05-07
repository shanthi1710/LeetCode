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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return root;
        }
        if(key<root.val){
            root.left=deleteNode(root.left,key);
        }else if(key>root.val){
            root.right = deleteNode(root.right,key);
        }else{
            // Node to delete found
            // Case 1: No child or one child
            if(root.left==null){
                return root.right;
            }
            if(root.right ==null){
                return root.left;
            }
            root.val=maxValue(root.left);
            root.left=deleteNode(root.left,root.val);
            // Case 2: Two children → Replace with inorder predecessor

        }
        return root;
    }
    private int maxValue(TreeNode root){
        int max = root.val;
        while(root.right!=null){
            max = root.right.val;
            root=root.right;
        }
        return max;
    }
}