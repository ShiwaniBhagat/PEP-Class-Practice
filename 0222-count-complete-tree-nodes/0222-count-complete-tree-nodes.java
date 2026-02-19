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
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int lh=0;
        int rh=0;
        TreeNode l=root;
        TreeNode r=root;
        while(l!=null) {
            lh++;
            l=l.left;
        }
        while(r!=null) {
            rh++;
            r=r.right;
        }
        int ans=1;
        if(lh==rh){
            return (1 << lh) - 1;
        }
        ans+=countNodes(root.left);
        ans+=countNodes(root.right);
        return ans;
     }
}