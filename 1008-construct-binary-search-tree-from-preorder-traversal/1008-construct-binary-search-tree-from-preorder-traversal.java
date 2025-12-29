class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        int index = 0;
        while(index < preorder.length) {
            TreeNode node = new TreeNode(preorder[index++]);
            if(root == null) {
                root = node;
            } else {
                TreeNode temp = root;
                while(temp != null) {
                    if(node.val<temp.val && temp.left!= null) {
                        temp = temp.left;
                    } else if(node.val>temp.val && temp.right!=null) {
                        temp = temp.right;
                    } else if(node.val<temp.val && temp.left== null) {
                        temp.left = node;
                        break;
                    } else if(node.val>temp.val && temp.right==null) {
                        temp.right = node;
                        break;
                    }
                }
            }
        }
        return root;
    }
}