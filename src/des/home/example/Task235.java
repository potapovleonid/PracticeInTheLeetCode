package des.home.example;

public class Task235 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode desiredNode = root;
        byte leftOrRight;

        while (desiredNode != null) {
            if (desiredNode.val == p.val || desiredNode.val == q.val) {
                return desiredNode;
            }

//TODO
            if (desiredNode.left.val == p.val || desiredNode.left.val == q.val || desiredNode.right.val == p.val || desiredNode.right.val == q.val) {
                return desiredNode;
            }

            if (desiredNode.val > p.val && desiredNode.val > q.val) {
                leftOrRight = 0;
            } else leftOrRight = 1;

            if (leftOrRight == 0) {
                desiredNode = desiredNode.left;
            } else {
                desiredNode = desiredNode.right;
            }
        }
        return null;
    }
}
