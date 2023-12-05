class Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data = data;
    }
}
public class Driver {

    public static void selectionSort(Node head)
    {
        Node pointer = head;

        while(pointer != null)
        {
            Node smallest = pointer;
            Node currentNode = pointer;

            while (currentNode != null)
            {
                if(smallest.data > currentNode.data)
                {
                    smallest = currentNode;
                }
                currentNode = currentNode.next;
            }
            int temp = pointer.data;
            pointer.data= smallest.data;
            smallest.data = temp;
            pointer = pointer.next;
        }
    }

    public static void print(Node head) {
        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(5);
        head.next = new Node(1);
        head.next.next = new Node(7);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);

        print(head);
        System.out.println();
        selectionSort(head);
        print(head);

    }
}

