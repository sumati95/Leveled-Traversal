public class Height {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(8);
        root.left.left.left.right = new TreeNode(9);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(11);
        System.out.println(height(root));
        printLevel(root);
    }
    static int height(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int lheight = height(root.left);
            int rheight = height(root.right);
            if (lheight > rheight) {
                return lheight + 1;
            } else {
                return rheight + 1;
            }
        }
    }

    static void levelOrder(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.println(root.value + " ");
        }
        else {
            levelOrder(root.left, level - 1);
            levelOrder(root.right, level - 1);
        }
    }

    static void printLevel(TreeNode root) {
        int h = height(root);
        for (int i = 0; i <= h; i++) {
            levelOrder(root, i);
        }
    }
}

class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;
    TreeNode(int v) {
        value = v;
    }
}
