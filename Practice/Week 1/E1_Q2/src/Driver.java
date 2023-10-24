public class Driver {

    public static void calculateArea(Circle circle, Square square){
        double circle_area = 3.14 * ( circle.radius * circle.radius);
        System.out.println("Area of Circle : "+ circle_area);
        double square_area = square.side * square.side ;
        System.out.println("Area of Square : "+ square_area);
    }
    public static void main(String[] args) {
        Square square = new Square(5.5);
        Circle circle = new Circle(5.5);

        calculateArea(circle, square);
    }
}
