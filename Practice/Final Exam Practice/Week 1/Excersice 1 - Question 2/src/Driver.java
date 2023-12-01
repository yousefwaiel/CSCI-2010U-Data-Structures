public class Driver {
    public static void calculateArea(Square square, Circle circle){

        double circle_area = 3.14 * Math.pow((circle.radius),2);
        double square_area = square.side * square.side;

        System.out.println("Area of Circle = "+ circle_area);
        System.out.println("Area of Square = "+ square_area);
    }

    public static void main(String[] args) {

        Circle circle = new Circle(5.5);
        Square square = new Square(5.5);

        calculateArea(square,circle);

    }

}