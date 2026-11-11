import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Deque<TreeNode> nodes = new ArrayDeque<>();
        nodes.push(root);
        Deque<Integer> deeps = new ArrayDeque<>();
        int deep = 1;
        int maxDeep = 0;
        deeps.push(deep);
        while (!nodes.isEmpty())  {
            TreeNode current = nodes.pop();
            deep = deeps.pop();
            if (current.right != null) {
                nodes.push(current.right);
                deeps.push(deep + 1);
            }
            if (current.left != null) {
                nodes.push(current.left);
                deeps.push(deep + 1);
            }
            maxDeep = Math.max(deep, maxDeep);
        }
        return maxDeep;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}
