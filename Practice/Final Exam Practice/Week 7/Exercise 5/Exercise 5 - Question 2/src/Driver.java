public class Driver {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertElement(2);
        list.insertElement(5);
        list.insertElement(12);
        list.insertElement(6);
        list.insertElement(9);

        list.print();

        System.out.println("_____________");

        list.insertNext(5,10);

        list.print();
    }
}