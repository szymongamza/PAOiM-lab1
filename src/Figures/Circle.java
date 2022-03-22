package Figures;

public class Circle extends Figure implements Printable {
    double r;

    public Circle(double in1) {
        if (in1 > 0) {
            r = in1;
        } else {
            System.out.println("ERROR");
        }
    }

    @Override
    public void print() {
        System.out.println("Radius length: " + r);
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());


    }

    @Override
    double calculateArea() {
        return 3.14 * r * r;
    }

    @Override
    double calculatePerimeter() {
        return 2 * 3.14 * r;
    }
}