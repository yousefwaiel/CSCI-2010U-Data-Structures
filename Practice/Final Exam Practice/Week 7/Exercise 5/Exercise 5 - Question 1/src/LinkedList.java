class Node
{
    public int data;
    public Node next;

    public Node(int data)
    {
        this.data = data;
    }
}

public  class LinkedList
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
           while(currentNode.next != null)
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


   public void printEven()
   {
       Node currentNode = this.head;

       while (currentNode != null)
       {
           if (currentNode.data%2 == 0)
           {
               System.out.println(currentNode.data);
               currentNode = currentNode.next;
           }
           else
           {
               currentNode = currentNode.next;
           }

       }
   }

}