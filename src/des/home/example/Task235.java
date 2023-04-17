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
        byte leftOrRight;
        TreeNode head = root;

        while (head != null) {
            if ((head.val <= p.val && head.val >= q.val) || (head.val >= p.val && head.val <= q.val)){
                return head;
            }

            if (head.val > p.val && head.val > q.val) {
                leftOrRight = 0;
            } else leftOrRight = 1;

            if (leftOrRight == 0) {
                head = head.left;
            } else {
                head = head.right;
            }
        }
        return null;
    }
}
