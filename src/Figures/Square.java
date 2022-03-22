package Figures;

public class Square extends Figure implements Printable {
    double a;

    public Square(double in1) {
        if (in1 > 0) {
            a = in1;
        } else {
            System.out.println("ERROR");
        }
    }

    @Override
    public void print() {
        System.out.println("Side length: " + a);
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
    }

    @Override
    double calculateArea() {
        return a * a;
    }

    @Override
    double calculatePerimeter() {
        return 4 * a;
    }
}