class Node{
    int value;
    Node right;
    Node left;

    Node (int value){
        this.value = value;
    }

}

public class BinarySearchTree
{
    Node root;

    void deletion(int value)
    {
        root = delete(root,value);
    }

    Node delete(Node node, int value)
    {
        if (node == null)
        {
            return node;
        }
        if (value < node.value)
        {
            node.left = delete(node.left,value);
        } else if (value > node.value) {
            node.right = delete(node.right,value);
        }
        else
        {
            if(node.left == null)
            {
                return node.right;
            }
            if ( node.right == null)
            {
                return node.left;
            }
            node.value = minValue(node.right);
            node.right = delete(node.right, node.value);
        }
        return node;
    }

    int minValue(Node node)
    {
        int minValue = node.value;
        while(node.left!=null)
        {
            minValue = node.left.value;
            node = node.left;
        }
        return minValue;
    }

    void preOrder(Node node)
    {
        if (node == null)
        {
            return;
        }
        System.out.print(node.value + "\t ");
        preOrder(node.left);
        preOrder(node.right);
    }
}