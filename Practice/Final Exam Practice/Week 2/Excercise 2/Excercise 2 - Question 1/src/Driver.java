// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Driver {
    public static void main(String[] args) {
        Number number = new Number(3.1146789);
        System.out.println("Original Number : " + number.number);

        Number.Precision precision = number.new Precision();
        System.out.println("New Number = " + precision.setPrecision());
    }
}