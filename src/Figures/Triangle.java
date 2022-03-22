package Figures;

import java.lang.Math;

public class Triangle extends Figure implements Printable {
    double a, h;

    public Triangle(double in1, double in2) {
        if (in1 > 0 || in2 > 0) {
            a = in1;
            h = in2;
        } else {
            System.out.println("ERROR");
        }
    }

    @Override
    public void print() {
        System.out.println("Base length: " + a);
        System.out.println("Height: " + h);
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());

    }

    @Override
    double calculateArea() {
        return 0.5 * a * h;
    }

    @Override
    double calculatePerimeter() {
        return Math.sqrt(4 * calculateArea() / Math.sqrt(3.0));
    }
}
