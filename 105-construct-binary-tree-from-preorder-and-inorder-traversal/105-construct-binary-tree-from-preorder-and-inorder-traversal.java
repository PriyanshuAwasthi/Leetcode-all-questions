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
    int pos=0;
    
    int find(int val, int[] ino, int low, int hig){
        for(;low<=hig;low++){
            if(val==ino[low])
                return low;
        }
        return -1;
    }
    
    TreeNode build(int[] pre,int[] ino,int low,int hig){
        int index=find(pre[pos],ino,low, hig);
        TreeNode node = new TreeNode(pre[pos]);
        if(low<index){
            pos++;
            node.left=build(pre,ino,low,index-1);
        }
        if(index<hig){
            pos++;
            node.right=build(pre,ino,index+1,hig);
        }
        return node;
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,inorder.length-1);
    }
}