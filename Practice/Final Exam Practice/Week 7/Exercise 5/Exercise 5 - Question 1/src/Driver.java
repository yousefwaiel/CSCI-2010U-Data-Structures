public class Driver {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertElement(1);
        list.insertElement(2);
        list.insertElement(3);
        list.insertElement(4);
        list.insertElement(5);
        list.insertElement(6);
        list.insertElement(7);
        list.insertElement(8);
        list.insertElement(9);
        list.insertElement(10);

        list.print();
        System.out.println("_____________");
        list.printEven();

    }
}