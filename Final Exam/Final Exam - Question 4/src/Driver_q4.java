class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class DoublyLinkedList {
    Node head;

    public void addNodeToCenter(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        Node element = head;

        while (element != null && element.next != null) {
            current = current.next;
            element = element.next.next;
        }

        newNode.prev = current;
        newNode.next = current.next;

        if (current.next != null) {
            current.next.prev = newNode;
        }

        current.next = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

}

public class Driver_q4 {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        // Add nodes to the doubly linked list
        list.addNodeToCenter(6);

        // Print the doubly linked list
        System.out.println("Original Doubly Linked List:");
        list.printList();

    }
}