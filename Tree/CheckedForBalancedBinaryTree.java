public class CheckedForBalancedBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        root.left.left.left = new Node(900);
        root.right.right.right = new Node(8000);
        root.right.right.right.right = new Node(83);
        System.out.println(checkForBinaryTree(root));

    }

    // best solution
    public static int checkForBalanceBinaryTree(Node node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = checkForBalanceBinaryTree(node.left);
        if (leftHeight == -1) {
            return -1;
        }
        int rightHeight = checkForBalanceBinaryTree(node.right);
        if (rightHeight == -1) {
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return 1 + Math.max(leftHeight, rightHeight);
    }


    public static boolean checkForBinaryTree(Node node) {
        if (node == null) {
            return true;
        }
        int lfHeight = maximumDepth(node.left);
        int reightHeight = maximumDepth(node.right);
        if (Math.abs(lfHeight - reightHeight) > 1) {
            return false;
        }
        boolean leftResult = checkForBinaryTree(node.left);
        boolean rightResult = checkForBinaryTree(node.right);
        if (!leftResult || !rightResult) return false;
        return true;
    }

    public static int maximumDepth(Node node) {
        if (node == null) {
            return 0;
        }
        int left = maximumDepth(node.left);
        int right = maximumDepth(node.right);
        return 1 + (Math.max(left, right));
    }
}