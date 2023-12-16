public class Driver {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(5);
        tree.root.left = new Node(2);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(8);
        tree.root.right.right = new Node(20);
        tree.root.right.left.left = new Node(7);
        System.out.println("\nPre Order before deletion");
        tree.preOrder(tree.root);
        System.out.println("\nPre Order after deletion");
        tree.deletion(5);
        tree.preOrder(tree.root);
    }
}