class Node
{
    public int data;
    public Node next;

    public Node(int data)
    {
        this.data = data;
    }
}

public class LinkedList {

    Node head;
    LinkedList(){
        this.head = null;
    }

    public void insertElement(int number)
    {
        Node node = new Node(number);

        if ( this.head == null)
        {
            this.head = node;
        }
        else
        {
            Node currentNode = this.head;
            while ( currentNode.next != null)
            {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
    }

    public void print()
    {
        Node currentNode = this.head;

        while(currentNode.next != null)
        {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public void insertNext(int number, int newNumber)
    {
        Node currentNode = this.head;

        while(currentNode != null)
        {
            if (currentNode.data !=number)
            {
                currentNode = currentNode.next;
            }
            else
            {
                Node newNode = new Node(newNumber);
                Node temp = currentNode.next;
                currentNode.next = newNode;
                newNode.next = temp;
                break;
            }
        }
    }



}