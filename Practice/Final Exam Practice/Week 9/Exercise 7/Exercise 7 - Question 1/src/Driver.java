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
    Node (Student student)
    {
       this.student = student;
    }
}
public class Driver {

    public static void selectionSort(Node head)
    {
        Node pointer = head;
        while (pointer != null)
        {
            Node smallest = pointer;
            Node currentNode = pointer.next;
            while (currentNode != null)
            {
                if (smallest.student.age > currentNode.student.age)
                {
                    smallest = currentNode;
                }
                currentNode = currentNode.next;
            }
            Student temp = pointer.student;
            pointer.student = smallest.student;
            smallest.student = temp;
            pointer = pointer.next;
        }
    }
    public static void print(Node head)
    {
        while (head != null)
        {
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

        selectionSort(head);

        System.out.println("\nList of students after sorting...");
        print(head);
    }
}