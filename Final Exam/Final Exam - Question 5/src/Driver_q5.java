class Student {
    String firstName;
    String lastName;
    int rank;

    public Student(String firstName, String lastName, int rank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Rank: " + rank + ", Name: " + firstName + " " + lastName;
    }
}

class Node {
    Student student;
    Node left, right;

    public Node(Student student) {
        this.student = student;
        this.left = this.right = null;
    }
}


public class Driver_q5 {
    public static Node removeDuplicates(Node root) {
        if (root == null) {
            return null;
        }

        root.left = removeDuplicates(root.left);
        root.right = removeDuplicates(root.right);

        if (root.left != null && root.left.student.rank == root.student.rank) {
            root.left = null;
        }

        if (root.right != null && root.right.student.rank == root.student.rank) {
            root.right = null;
        }

        return root;
    }

    public static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.student);
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = null;
        System.out.println("\n************ Testing with Null Tree *************");
        System.out.println("Original BST:");
        inOrder(root);
        root = removeDuplicates(root);
        System.out.println("\nBST after removing duplicates based on Rank:");
        inOrder(root);
        System.out.println("*************************************************");
        root = new Node(new Student("Alice", "Johnson", 5));
        root.left = new Node(new Student("Bob", "Smith", 3));
        root.right = new Node(new Student("Aisha", "Saleem", 6));
        root.left.left = new Node(new Student("Tim", "David", 2));
        root.left.right = new Node(new Student("Elli", "Miller", 4));
        root.right.right = new Node(new Student("Eve", "Smith", 7));
        root.left.right.left = new Node(new Student("Julie", "Stone", 3));
        root.left.left.left = new Node(new Student("Ola", "Becker", 1));
        System.out.println("\n************ Testing with Julie = 3 Tree *************");
        System.out.println("Original BST:");
        inOrder(root);
        root = removeDuplicates(root);
        System.out.println("\nBST after removing duplicates based on Rank:");
        inOrder(root);
        System.out.println("*************************************************");
        root = new Node(new Student("Alice", "Johnson", 5));
        root.left = new Node(new Student("Bob", "Smith", 3));
        root.right = new Node(new Student("Aisha", "Saleem", 6));
        root.left.left = new Node(new Student("Tim", "David", 2));
        root.left.right = new Node(new Student("Elli", "Miller", 4));
        root.right.right = new Node(new Student("Eve", "Smith", 7));
        root.left.right.right = new Node(new Student("Julie", "Stone", 5));
        root.left.left.left = new Node(new Student("Ola", "Becker", 1));
        System.out.println("\n************ Testing with Julie = 5 Tree *************");
        System.out.println("Original BST:");
        inOrder(root);
        root = removeDuplicates(root);
        System.out.println("\nBST after removing duplicates based on Rank:");
        inOrder(root);
        System.out.println("*************************************************");
    }
}