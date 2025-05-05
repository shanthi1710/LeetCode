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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
		levelOrderHelper(arr, root, 0);
		return arr;
    }
    public void levelOrderHelper(List<List<Integer>>arr,TreeNode root,int level){
        if(root==null){
            return;
        }else{
            if(level>=arr.size()){
                arr.add(new ArrayList<>());
            }
            arr.get(level).add(root.val);
            levelOrderHelper(arr, root.left, level + 1);
            levelOrderHelper(arr, root.right, level + 1);
        }
    }
}