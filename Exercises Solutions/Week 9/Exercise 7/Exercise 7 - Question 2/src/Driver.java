class Student
{
    String name;
    int age;

    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String toString()
    {
       return this.name + ", " + this.age;
    }
}

class Node
{
    Student student;
    Node next;
    Node(Student student)
    {
        this.student = student;
    }
}

public class Driver {

    public static void insertionSort(Node head)
    {
        if (head == null || head.next == null)
        {
            return;
        }
        Node current = head;
        while(current != null){
            Node minValueNode = findMinValueNode(current);
            swapNodes(current, minValueNode);
            current = current.next;
        }
    }

    public static Node findMinValueNode(Node start) {
        Node minNode = start;
        Node current = start;
        while (current != null) {
            if (current.student.age < minNode.student.age) {
                minNode = current;
            }
            current = current.next;
        }
        return minNode;
    }
    public static void swapNodes(Node node1, Node node2) {
        Student tempStudent = node1.student;
        node1.student = node2.student;
        node2.student = tempStudent;
    }
    public static void print(Node head) {
        while (head != null) {
            System.out.println(head.student.toString());
            head = head.next;
        }
    }


    public static void main(String[] args) {
        Node head = new Node(new Student("Steve Jobs", 55));
        head.next = new Node(new Student("Elon Musk", 45));
        head.next.next = new Node(new Student("Ana Ben", 25));
        head.next.next.next = new Node(new Student("Lizzy Stone", 35));
        head.next.next.next.next = new Node(new Student("Warren Buffet", 75));
        System.out.println("\nList of students before sorting...");
        print(head);
        insertionSort(head);
        System.out.println("\nList of students after sorting...");
        print(head);
    }
}