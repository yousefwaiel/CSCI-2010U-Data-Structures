class Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data = data;
    }

}

public class LinkedList
{
    Node head;

    LinkedList()
    {
        this.head = null;
    }

    public void insertElement(int number)
    {
        Node node = new Node(number);

        if(this.head == null)
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

        while (currentNode != null)
        {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public void sort()
    {
        Node current = head;
        Node index = null;
        int temp;

        if (head == null)
        {
            return;
        }
        else
        {
            while ( current !=  null)
            {
                index = current.next;

                while (index !=null)
                {
                    if (current.data > index.data)
                    {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }






    }
}